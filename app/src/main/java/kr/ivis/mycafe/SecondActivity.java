package kr.ivis.mycafe;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView cafeinfo; //카페대표사진 이미지뷰
    TextView cafename, cafeaddress, cafetime; //카페 이름, 주소, 운영 시간 텍스트뷰
    Button call, pic, location; //전화걸기, 사진더보기, 지도보기 버튼
    RelativeLayout sLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sLayout = (RelativeLayout) findViewById(R.id.activity_second);
        sLayout.setBackgroundColor(Color.rgb(255,217,236)); //레이아웃 색상을 rgb값으로 설정

        cafename = (TextView) findViewById(R.id.nameTextView);
        cafeaddress = (TextView) findViewById(R.id.addressTextView);
        cafetime = (TextView) findViewById(R.id.timeTextView);
        cafeinfo = (ImageView) findViewById(R.id.imageView);
        call = (Button) findViewById(R.id.callButton);
        pic = (Button) findViewById(R.id.morePic);
        location = (Button) findViewById(R.id.locationButton);


        String cafeName = getIntent().getStringExtra("CafeName");

        /****************************************창원*****************************************/
        if (cafeName.equals("1997영국집")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.ukhousepic)); //해당카페 대표사진을 보여주는 이미지뷰
            cafename.setText("이름 : 1997영국집");
            cafeaddress.setText("위치 : 경남 창원시 의창구 외동반림로248번길 25");
            cafetime.setText("영업시간 : 10:00 ~ 22:30");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            //전화버튼
            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-9035-5338")));
                    }
                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("스페이스펀")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.spacefunpic));
            cafename.setText("스페이스펀");
            cafeaddress.setText("경남 창원시 의창구 창이대로417번길 25");
            cafetime.setText("영업시간 : 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-9964-9553")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });
        }
        else if (cafeName.equals("S9")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.s9pic));
            cafename.setText("S9");
            cafeaddress.setText("경남 창원시 의창구 창원대학로 20");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-9964-9553")));
                    }
                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });
        }
        else if (cafeName.equals("가로수")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.garosu_pic));
            cafename.setText("가로수");
            cafeaddress.setText("경남 창원시 의창구 용지로239번길 16-1");
            cafetime.setText("영업시간 : 10:00 ~ 22:30");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-9964-9553")));
                    }
                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });
        }
        else if (cafeName.equals("카페미뇽")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafe_minon_pic));
            cafename.setText("카페미뇽");
            cafeaddress.setText("경남 창원시 의창구 용지로239번길 34-1");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-9964-9553")));
                    }
                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });
        }
        else if (cafeName.equals("스팀펑크")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.steampunk_pic));
            cafename.setText("스팀펑크");
            cafeaddress.setText("경남 창원시 성산구 상남동 19-5");
            cafetime.setText("영업시간 : 10:00 ~ 01:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-282-2200")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });
        }
        else if (cafeName.equals("경성코페 귀곡점")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.kscofe_pic));
            cafename.setText("경성코페 귀곡점");
            cafeaddress.setText("경남 창원시 성산구 귀곡동 707");
            cafetime.setText("영업시간 : 11:00 ~ 01:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-264-6565")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });
        }
        else if (cafeName.equals("타르타르 상남점")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.tarrtarr_pic));
            cafename.setText("타르타르 상남점");
            cafeaddress.setText("경남 창원시 성산구 상남동 36-3");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "1800-1712")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });
        }
        else if (cafeName.equals("더 클라우드")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.thecloud_pic));
            cafename.setText("더 클라우드");
            cafeaddress.setText("경남 창원시 의창구 대원동 원이대로 320");
            cafetime.setText("영업시간 : 09:00 ~ 24:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-9964-9553")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });
        }
        else if (cafeName.equals("브라운핸즈")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.brownhands_pic));
            cafename.setText("브라운핸즈");
            cafeaddress.setText("경남 창원시 마산합포구 가포동 606-3");
            cafetime.setText("영업시간 : 10:00 ~ 24:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-243-0050")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });
        }
        else if (cafeName.equals("그래시헤이")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.grassyhay_pic));
            cafename.setText("그래시헤이");
            cafeaddress.setText("경남 창원시 의창구 창이대로 397번길1 1층");
            cafetime.setText("영업시간 : 10:00 ~ 24:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "070-8810-4800")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });
        }
        else if (cafeName.equals("컴포즈 창원시청점")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.compose_pic));
            cafename.setText("컴포즈 창원시청점");
            cafeaddress.setText("경남 창원시 의창구 원이대로 589번길6-6 102-1호");
            cafetime.setText("영업시간 : 09:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-261-9900")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }

        /****************************************창원*****************************************/


        /****************************************거창*****************************************/
        else if (cafeName.equals("카페외갓집")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafeoegazip_pic));
            cafename.setText("카페외갓집");
            cafeaddress.setText("경남 거창군 마리면 거안로 860-16");
            cafetime.setText("영업시간 : 10:00 ~ 22:00 일요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-944-0708")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("커피브라운")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.coffeebrown_pic));
            cafename.setText("커피브라운");
            cafeaddress.setText("경남 창원시 의창구 원이대로 589번길6-6 102-1호");
            cafetime.setText("영업시간 : 11:00 ~ 22:00 마지막 일요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-944-6774")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("플래닛커피")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.planetcoffee_pic));
            cafename.setText("플래닛커");
            cafeaddress.setText("경남 거창군 거창읍 동동4길 54");
            cafetime.setText("영업시간 : 11:00 ~ 22:00 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-2415-7552")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("뿌에블로젤라또")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.pueblogelato_pic));
            cafename.setText("뿌에블로젤라또");
            cafeaddress.setText("경남 거창군 거창읍 중앙로 71-1");
            cafetime.setText("영업시간 : 12:00 ~ 20:00 주말 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-6606-8768")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("코너131")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.corner131_pic));
            cafename.setText("코너131");
            cafeaddress.setText("경남 거창군 거창읍 강변로 131");
            cafetime.setText("영업시간 : 10:00 ~ 23:30");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-942-7131")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("더무그")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.themoog_pic));
            cafename.setText("더무그");
            cafeaddress.setText("경남 거창군 거창읍 강변로 127");
            cafetime.setText("영업시간 : 10:00 ~ 23:00 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-943-1995")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("감성카페아메리카노")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafeamericano_pic));
            cafename.setText("감성카페아메리카노");
            cafeaddress.setText("경남 거창군 거창읍 공수들1길 54");
            cafetime.setText("영업시간 : 평일 11:00 ~ 24:00, 일요일 12:00 ~ 24:00 토요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-942-4942")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("디애플스토리")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.theapplestory_pic));
            cafename.setText("디애플스토리");
            cafeaddress.setText("경남 거창군 거창읍 상동7길 15-8");
            cafetime.setText("영업시간 : 12:00 ~ 24:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-944-9844")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("컵오브커피 거창점")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cupofcoffee_pic));
            cafename.setText("컵오브커피 거창점");
            cafeaddress.setText("경남 거창군 거창읍 하동2길 3");
            cafetime.setText("영업시간 : 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-942-1129")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("커피마루")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.coffeemaru_pic));
            cafename.setText("커피마루");
            cafeaddress.setText("경남 거창군 가조면 가조가야로 1103-1");
            cafetime.setText("영업시간 : 10:00 ~ 23:30");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-944-3350")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /****************************************거창*****************************************/

        /*************************************합천*********************************************/
        else if (cafeName.equals("님프")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.nymph_pic));
            cafename.setText("님프");
            cafeaddress.setText("경남 합천군 합천읍 문화로 43");
            cafetime.setText("영업시간 : 10:00 ~ 24:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-931-4567")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("플로리안")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.florian_pic));
            cafename.setText("플로리안");
            cafeaddress.setText("경남 합천군 삼가면 일부3길 6-1");
            cafetime.setText("영업시간 : 11:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-931-9298")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페리조트인더시티")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.caferesort_pic));
            cafename.setText("카페리조트인더시티");
            cafeaddress.setText("경남 합천군 합천읍 대야로 805");
            cafetime.setText("영업시간 : 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-931-2622")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("인스커피")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.inscoffee_pic));
            cafename.setText("인스커피");
            cafeaddress.setText("경남 합천군 합천읍 충효로 63");
            cafetime.setText("영업시간 : 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-932-8585")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("커피베이 합천점")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.coffeebay_pic));
            cafename.setText("커피베이 합천점");
            cafeaddress.setText("경남 합천군 합천읍 중앙로길 1");
            cafetime.setText("영업시간 : 11:30 ~ 22:30");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-932-9114")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("이모하")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.imoha_pic));
            cafename.setText("이모하");
            cafeaddress.setText("경남 합천군 합천읍 문화로 5 파크뷰");
            cafetime.setText("영업시간 : 09:00 ~ 18:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-933-2258")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페뮤즈")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafemuse_pic));
            cafename.setText("카페뮤즈");
            cafeaddress.setText("경남 합천군 야로면 가야산로 498");
            cafetime.setText("영업시간 : 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-2020-3376")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페다온")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafedaon_pic));
            cafename.setText("카페다온");
            cafeaddress.setText("경남 합천군 합천읍 중앙로 93");
            cafetime.setText("영업시간 : 11:00 ~ 24:00 첫째주, 셋째주 일요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-931-3252")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************합천*********************************************/

        /*************************************의령*********************************************/
        else if (cafeName.equals("그린프로그")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.greenfrog_pic));
            cafename.setText("그린프로그");
            cafeaddress.setText("경남 의령군 정곡면 법정로 971");
            cafetime.setText("영업시간 : 10:00 ~ 21:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-572-9710")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("새콩커피")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.saecongcoffee_pic));
            cafename.setText("새콩커피");
            cafeaddress.setText("경남 의령군 의령읍 의병로 239");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-573-2028")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페세그루")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafe3guru_pic));
            cafename.setText("카페세그루");
            cafeaddress.setText("경남 의령군 칠곡면 자굴산로 162 내조마을회관");
            cafetime.setText("영업시간 : 09:00 ~ 20:00 첫번째,세번째 화요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-3102-2574")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("파인그로브")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.pinegrove_pic));
            cafename.setText("파인그로브");
            cafeaddress.setText("경남 의령군 칠곡면 진의로8길 24-4");
            cafetime.setText("영업시간 : 11:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-572-0867")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("힐링카페")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.healingcafe_pic));
            cafename.setText("힐링카페");
            cafeaddress.setText("경남 의령군 의령읍 남강로 687");
            cafetime.setText("영업시간 : 13:00 ~ 21:00 2,4 주 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-573-8091")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************의령*********************************************/

        /*************************************창녕*********************************************/
        else if (cafeName.equals("노리")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.nori_pic));
            cafename.setText("노리");
            cafeaddress.setText("경남 창녕군 부곡면 노리2길 7-20");
            cafetime.setText("영업시간 : 10:00 ~ 21:00 수요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-521-0015")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("모다페")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.modafe_pic));
            cafename.setText("모다페");
            cafeaddress.setText("경남 창녕군 창녕읍 향교골목길 10-10");
            cafetime.setText("영업시간 : 11:00 ~ 22:30 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-533-8682")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페89도씨")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafe89c_pic));
            cafename.setText("카페89도씨");
            cafeaddress.setText("경남 창녕군 남지읍 남지철교길 22");
            cafetime.setText("영업시간 : 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "070-5035-0750")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("우포로와")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.woopolowa_pic));
            cafename.setText("우포로와");
            cafeaddress.setText("경남 창녕군 대합면 쟁반1길 38");
            cafetime.setText("영업시간 : 10:00 ~ 20:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-6316-0231")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("슈가파우더")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.sugarpouder_pic));
            cafename.setText("슈가파우더");
            cafeaddress.setText("경남 창녕군 창녕읍 명덕로 13");
            cafetime.setText("영업시간 : 11:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-6327-6844")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("커피볶는집 프리모")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.frimo_pic));
            cafename.setText("커피볶는집 프리모");
            cafeaddress.setText("경남 창녕군 창녕읍 우포2로 1220-1");
            cafetime.setText("영업시간 : 평일 09:00 ~ 23:00 주말 09:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-532-2947")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페파인")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafepine_pic));
            cafename.setText("카페파인");
            cafeaddress.setText("경남 창녕군 계성면 계성화왕산로 288-3");
            cafetime.setText("영업시간 : 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-521-9798")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************창녕*********************************************/

        /*************************************밀양*********************************************/
        else if (cafeName.equals("카페지디")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafegd_pic));
            cafename.setText("카페지디");
            cafeaddress.setText("경남 창녕군 대합면 쟁반1길 38");
            cafetime.setText("영업시간 : 10:00 ~ 20:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-6316-0231")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("마리옹")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.marion_pic));
            cafename.setText("마리옹");
            cafeaddress.setText("경남 창녕군 창녕읍 명덕로 13");
            cafetime.setText("영업시간 : 11:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-6327-6844")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("햇살이머무는정원")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.sunstaygarden_pic));
            cafename.setText("햇살이머무는정원");
            cafeaddress.setText("경남 창녕군 창녕읍 우포2로 1220-1");
            cafetime.setText("영업시간 : 평일 09:00 ~ 23:00 주말 09:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-532-2947")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("트리인블루")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.treeinblue_pic));
            cafename.setText("트리인블루");
            cafeaddress.setText("경남 창녕군 계성면 계성화왕산로 288-3");
            cafetime.setText("영업시간 : 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-521-9798")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("커피명가 밀양아랑점")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.coffeemyungga_pic));
            cafename.setText("커피명가 밀양아랑점");
            cafeaddress.setText("경남 창녕군 대합면 쟁반1길 38");
            cafetime.setText("영업시간 : 10:00 ~ 20:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-6316-0231")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페하비비")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.habibi_pic));
            cafename.setText("카페하비비");
            cafeaddress.setText("경남 창녕군 창녕읍 명덕로 13");
            cafetime.setText("영업시간 : 11:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-6327-6844")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("메모리아")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.memoria_pic));
            cafename.setText("메모리아");
            cafeaddress.setText("경남 창녕군 창녕읍 우포2로 1220-1");
            cafetime.setText("영업시간 : 평일 09:00 ~ 23:00 주말 09:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-532-2947")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("노을이쁜카페")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.noelcafe_pic));
            cafename.setText("노을이쁜카페");
            cafeaddress.setText("경남 창녕군 계성면 계성화왕산로 288-3");
            cafetime.setText("영업시간 : 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-521-9798")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("홀릭")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.holic_pic));
            cafename.setText("홀릭");
            cafeaddress.setText("경남 창녕군 계성면 계성화왕산로 288-3");
            cafetime.setText("영업시간 : 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-521-9798")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************밀양*********************************************/

        /*************************************양산*********************************************/
        else if (cafeName.equals("구름에반하다")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.gureum_pic));
            cafename.setText("구름에반하다");
            cafeaddress.setText("경남 양산시 물금읍 오봉3길 70");
            cafetime.setText("영업시간 : 13:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-910-9996")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("스페이스나무")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.spacenamu_pic));
            cafename.setText("스페이스나무");
            cafeaddress.setText("경남 양산시 하북면 충렬로 1733");
            cafetime.setText("영업시간 : 11:00 ~ 18:00 갤러리 매주 월요일 휴관");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-374-3500")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페해바라기")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafesunflower_pic));
            cafename.setText("카페해바라기");
            cafeaddress.setText("경남 양산시 장흥3길 22");
            cafetime.setText("영업시간 : 평일 11:00 ~ 19:00 주말/공휴일 11:00 ~ 20:00 화요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-366-1855")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페잍")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafeit_pic));
            cafename.setText("카페잍");
            cafeaddress.setText("경남 양산시 상북면 석계로 45");
            cafetime.setText("영업시간 : 10:30 - 21:30 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-3909-8531")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페블루지앤")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafebluesien_pic));
            cafename.setText("카페블루지앤");
            cafeaddress.setText("경남 양산시 물금읍 백호로 92");
            cafetime.setText("영업시간 : 평일 10:30 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-387-7073")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페오조")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafeojo_pic));
            cafename.setText("카페오조");
            cafeaddress.setText("경남 양산시 물금읍 백호1길 28-1");
            cafetime.setText("영업시간 : 13:00 ~ 22:00 화요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-387-8337")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("스트롤링커피")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.strollingcoffee_pic));
            cafename.setText("스트롤링커피");
            cafeaddress.setText("경남 양산시 원동면 화제로 190");
            cafetime.setText("영업시간 : 10:30 ~ 20:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-372-7060")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************양산*********************************************/

        /*************************************김해*********************************************/
        else if (cafeName.equals("카페달리아")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafedalia_pic));
            cafename.setText("카페달리아");
            cafeaddress.setText("경남 김해시 인제로 433");
            cafetime.setText("영업시간 : 11:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-325-9001")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("낙도맨션")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.nakdomansion_pic));
            cafename.setText("낙도맨션");
            cafeaddress.setText("경남 김해시 김해대로2273번길 46");
            cafetime.setText("영업시간 : 12:00 ~ 21:00 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-311-9987")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("달카페")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.dalcafe_pic));
            cafename.setText("달카페");
            cafeaddress.setText("경남 김해시 식만로 354-41");
            cafetime.setText("영업시간 : 10:30 ~ 23:30");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-324-5514")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("마일커피")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.milecoffee_pic));
            cafename.setText("마일커피");
            cafeaddress.setText("경남 김해시 호계로 425-1");
            cafetime.setText("영업시간 : 08:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "070-4888-4840")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("도로시플레이트")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.dorosyplate_pic));
            cafename.setText("도로시플레이트");
            cafeaddress.setText("경남 김해시 대청계곡길 53");
            cafetime.setText("영업시간 : 11:30 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-328-4311")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("일루소")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.illuso_pic));
            cafename.setText("일루소");
            cafeaddress.setText("경남 김해시 대청계곡길 195-108");
            cafetime.setText("영업시간 : 10:30 ~ 22:30");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-605-8768")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("솔렌더")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.solender_pic));
            cafename.setText("솔렌더");
            cafeaddress.setText("경남 김해시 관동로 92");
            cafetime.setText("영업시간 : 평일 11:30 ~ 22:30 주말 11:30 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-323-3232")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("필로")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.pilo_pic));
            cafename.setText("필로");
            cafeaddress.setText("경남 김해시 신안계곡1길 18");
            cafetime.setText("영업시간 : 10:30 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-313-5210")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("폴인커피강")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.fallincoffeekang_pic));
            cafename.setText("폴인커피강");
            cafeaddress.setText("경남 김해시 식만로348번길 15-1");
            cafetime.setText("영업시간 : 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-322-2670")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페오닉스")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafeonyx_pic));
            cafename.setText("카페오닉스");
            cafeaddress.setText("경남 김해시 율하1로81번길 24");
            cafetime.setText("영업시간 : 09:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-325-5864")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************김해*********************************************/

        /*************************************함안*********************************************/
        else if (cafeName.equals("그루브맨커피")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.groovemancoffee_pic));
            cafename.setText("그루브맨커피");
            cafeaddress.setText("경남 함안군 칠원읍 경남대로 1621");
            cafetime.setText("영업시간 : 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-4100-6553")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("멜로우")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.mellow_pic));
            cafename.setText("멜로우");
            cafeaddress.setText("경남 함안군 산인면 신산리 519-3");
            cafetime.setText("영업시간 : 09:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-583-0998")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페타밀")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafetamil_pic));
            cafename.setText("카페타밀");
            cafeaddress.setText("경남 함안군 칠원읍 북원로 52-1");
            cafetime.setText("영업시간 : 평일 11:30 ~ 22:30 주말 11:30 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-587-3434")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("인터라켄")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.interlaken_pic));
            cafename.setText("인터라켄");
            cafeaddress.setText("경남 함안군 칠원읍 야촌1길 1");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-587-5185")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("에이미스커피 경남함안점")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.amyscoffee_pic));
            cafename.setText("에이미스커피 경남함안점");
            cafeaddress.setText("경남 함안군 가야읍 가야로 83");
            cafetime.setText("영업시간 : 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-585-5333")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페드아라")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafedeara_pic));
            cafename.setText("카페드아라");
            cafeaddress.setText("경남 함안군 가야읍 왕궁1길 32");
            cafetime.setText("영업시간 : 11:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-583-8782")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************함안*********************************************/

        /*************************************함양*********************************************/
        else if (cafeName.equals("케빈커피로스터스")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.kevincoffeeroasters_pic));
            cafename.setText("케빈커피로스터스");
            cafeaddress.setText("경남 함양군 함양읍 상림1길 26");
            cafetime.setText("영업시간 : 평일 10:00 ~ 22:00 토요일 10:00 ~ 23:00 일요일 10:00 ~ 19:30");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-964-0515")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("황금마차")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.goldenwagon_pic));
            cafename.setText("황금마차");
            cafeaddress.setText("경남 함양군 함양읍 교산리 1041");
            cafetime.setText("영업시간 : 평일 09:00 ~ 19:00  주말 09:00 ~ 20:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-3846-7105")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("다소니")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.dasoni_pic));
            cafename.setText("다소니");
            cafeaddress.setText("경남 함양군 서상면 서상로 307-1");
            cafetime.setText("영업시간 : 11:00 ~ 21:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-964-3232")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페엔")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafen_pic));
            cafename.setText("카페엔");
            cafeaddress.setText("경남 함양군 안의면 농월정길 9");
            cafetime.setText("영업시간 : 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-963-7333")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("작은카페테이블")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.littlecafetable_pic));
            cafename.setText("작은카페테이블");
            cafeaddress.setText("경남 함양군 안의면 금벌길 11");
            cafetime.setText("영업시간 : 10:30 ~ 20:00 매월 16일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-8595-1111")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************함양*********************************************/

        /*************************************거제*********************************************/
        else if (cafeName.equals("바람의핫도그")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.windshotdog_pic));
            cafename.setText("바람의핫도그");
            cafeaddress.setText("경남 거제시 남부면 다대5길 13");
            cafetime.setText("영업시간 : 평일 09:00 ~ 18:00 주말 09:00 ~ 19:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-634-1123")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("포뷰")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.poview_pic));
            cafename.setText("포뷰");
            cafeaddress.setText("경남 거제시 장승포로13길 11");
            cafetime.setText("영업시간 : 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-682-1044")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페상상")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafesangsang_pic));
            cafename.setText("카페상상");
            cafeaddress.setText("경남 거제시 일운면 거제대로 2752");
            cafetime.setText("영업시간 : 10:00 ~ 21:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-682-5225")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("에버어뮤즈")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafeamuse_pic));
            cafename.setText("에버어뮤즈");
            cafeaddress.setText("경남 거제시 문동4길 99");
            cafetime.setText("영업시간 : 11:30 ~ 21:00 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-4848-9614")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("볼리에르")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.voriere_pic));
            cafename.setText("볼리에르");
            cafeaddress.setText("경남 거제시 사등면 가조로 1292-20");
            cafetime.setText("영업시간 : 11:00 ~ 21:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-636-9345")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("섬타임")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.sometime_pic));
            cafename.setText("섬타임");
            cafeaddress.setText("경남 거제시 일운면 소동6길 17-2");
            cafetime.setText("영업시간 : 11:00 ~ 21:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-682-6828")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("아나무라")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.anamura_pic));
            cafename.setText("아나무라");
            cafeaddress.setText("경남 거제시 옥포대첩로 430-5");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-687-5412")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("블루밍제이")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.bloomingj_pic));
            cafename.setText("블루밍제이");
            cafeaddress.setText("경남 거제시 계룡로 28");
            cafetime.setText("영업시간 : 평일 10:00 ~ 22:00 토요일 10:00 ~ 22:00 일요일 12:00 ~ 22:00 2,4번째 일요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-635-5337")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("블랙업커피 거제점")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.blackupcoffee_pic));
            cafename.setText("블랙업커피 거제점");
            cafeaddress.setText("경남 거제시 중곡로1길 42");
            cafetime.setText("영업시간 : 09:00 ~ 22:30");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-950-4952")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************거제*********************************************/

        /*************************************통영*********************************************/
        else if (cafeName.equals("카페울라봉")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.woolabong_pic));
            cafename.setText("카페울라봉");
            cafeaddress.setText("경남 통영시 동문로 22");
            cafetime.setText("영업시간 : 12:00 ~ 19:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-649-3824")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("꿀단지")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.honeyjar_pic));
            cafename.setText("꿀단지");
            cafeaddress.setText("경남 거제시 계룡로 28");
            cafetime.setText("영업시간 : 08:00 ~ 21:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-649-0032")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페바다봄")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.badabom_pic));
            cafename.setText("카페바다봄");
            cafeaddress.setText("경남 통영시 통영해안로 303");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-648-0710")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("헤이수오미")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.heisuomi_pic));
            cafename.setText("헤이수오미");
            cafeaddress.setText("경남 거제시 옥포대첩로 430-5");
            cafetime.setText("영업시간 : 11:00 ~ 21:00 둘째, 넷째 주 수요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "070-8846-5381")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("까사베르데")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.casaverde_pic));
            cafename.setText("까사베르데");
            cafeaddress.setText("경남 통영시 무전7길 48");
            cafetime.setText("영업시간 : 10:00 ~ 22:00 둘째, 넷째 주 일요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-649-4561")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("안트워프커피")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.antwarp_pic));
            cafename.setText("안트워프커피");
            cafeaddress.setText("경남 통영시 산양읍 풍화일주로 1188");
            cafetime.setText("영업시간 : 10:30 ~ 20:00 명절 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-648-5275")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("바이사이드")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.byside_pic));
            cafename.setText("바이사이드");
            cafeaddress.setText("경남 통영시 항남1길 12");
            cafetime.setText("영업시간 : 12:00 ~ 24:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-3133-8661")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페이봄")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafe2bom_pic));
            cafename.setText("카페이봄");
            cafeaddress.setText("경남 통영시 도남로 96-6");
            cafetime.setText("영업시간 : 평일 10:00 ~ 22:00 주말 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-649-3170")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("보다나은")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.bodanaeun_pic));
            cafename.setText("보다나은");
            cafeaddress.setText("경남 통영시 해평5길 157");
            cafetime.setText("영업시간 : 12:00 ~ 23:00 화요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "070-4739-4700")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************통영*********************************************/

        /*************************************사천*********************************************/
        else if (cafeName.equals("커피레")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.coffeeleh_pic));
            cafename.setText("커피레");
            cafeaddress.setText("경남 사천시 해안관광로 68-14");
            cafetime.setText("영업시간 : 10:00 ~ 24:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-835-3007")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("모엘루")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.moellu_pic));
            cafename.setText("모엘루");
            cafeaddress.setText("경남 사천시 해안관광로 68-2");
            cafetime.setText("영업시간 : 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-833-1584")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페코끼리")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafekokkiri_pic));
            cafename.setText("카페코끼리");
            cafeaddress.setText("경남 사천시 해안관광로 170-18");
            cafetime.setText("영업시간 : 11:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-9858-9285")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페정미소")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafejungmiso_pic));
            cafename.setText("카페정미소");
            cafeaddress.setText("경남 사천시 진삼로 150");
            cafetime.setText("영업시간 : 10:30 ~ 22:30 화요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-834-1474")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("타르팩토리")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.tarrfactory_pic));
            cafename.setText("타르팩토리");
            cafeaddress.setText("경남 사천시 사천읍 역사길 11-22 2층");
            cafetime.setText("영업시간 : 10:00 ~ 22:00 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-855-9323")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("더웨이닝커피 삼천포대교점")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.thewainingcoffee_pic));
            cafename.setText("더웨이닝커피 삼천포대교점");
            cafeaddress.setText("경남 사천시 군영숲길 74");
            cafetime.setText("영업시간 : 11:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + " 055-832-9191")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("커피필라멘트")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.coffeefilament_pic));
            cafename.setText("커피필라멘트");
            cafeaddress.setText("경남 사천시 사천읍 동문로 90");
            cafetime.setText("영업시간 : 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-855-8917")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************사천*********************************************/

        /*************************************진주*********************************************/
        else if (cafeName.equals("마미니")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.mamini_pic));
            cafename.setText("마미니");
            cafeaddress.setText("경남 진주시 남강로659번길 13-6");
            cafetime.setText("영업시간 : 12:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-6674-6252")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("펄디스트릭")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.pearldistrict_pic));
            cafename.setText("펄디스트릭");
            cafeaddress.setText("경남 진주시 선학산길 105");
            cafetime.setText("영업시간 : 12:00 ~ 21:00 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-752-7078")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("블랙바닐라")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.blackvanilla_pic));
            cafename.setText("블랙바닐라");
            cafeaddress.setText("경남 진주시 솔밭로140번길 19-2");
            cafetime.setText("영업시간 : 12:00 ~ 23:00 일요일 12:00 ~ 22:00 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + " 010-4688-6168")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페아르볼")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafearbol_pic));
            cafename.setText("카페아르볼");
            cafeaddress.setText("경남 진주시 의곡길 9");
            cafetime.setText("영업시간 : 12:00 - 21:00 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-748-4104")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("울트라블루")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.ultrablue_pic));
            cafename.setText("울트라블루");
            cafeaddress.setText("경남 진주시 남강로 11");
            cafetime.setText("영업시간 : 11:00 ~ 24:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-9656-0120")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("로스팅웨어")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.roastingware_pic));
            cafename.setText("로스팅웨어");
            cafeaddress.setText("경남 진주시 동부로 79");
            cafetime.setText("영업시간 : 08:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-755-5225")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("허니타임")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.honeytime_pic));
            cafename.setText("허니타임");
            cafeaddress.setText("경남 진주시 비봉로23번길 6");
            cafetime.setText("영업시간 : 12:00 ~ 20:00 월요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-7657-8859")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("소확행")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.sohwakhang_pic));
            cafename.setText("소확행");
            cafeaddress.setText("경남 진주시 진주대로920번길 22");
            cafetime.setText("영업시간 : 12:00 ~ 21:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-3577-0232")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************진주*********************************************/

        /*************************************하동*********************************************/
        else if (cafeName.equals("카페로드100")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.caferoad100_pic));
            cafename.setText("카페로드100");
            cafeaddress.setText("경북 경주시 보불로 100");
            cafetime.setText("영업시간 : 평일 10:30 ~ 23:00 주말 10:00 ~ 23:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "054-741-7401")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("블리스커피 보문점")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.blisscoffee_pic));
            cafename.setText("블리스커피 보문점");
            cafeaddress.setText("경북 경주시 보불로 158");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-7740-6277")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("품안")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.pooman_pic));
            cafename.setText("품안");
            cafeaddress.setText("경북 경주시 새골길 191");
            cafetime.setText("영업시간 : 12:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "054-777-1047")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("누마루한옥커피")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.numaru_pic));
            cafename.setText("누마루한옥커피");
            cafeaddress.setText("경북 경주시 보불로 267");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "054-745-3538")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("소더비")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.sotheby_pic));
            cafename.setText("소더비");
            cafeaddress.setText("경북 경주시 보불로 174-3");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "054-771-4433")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("커피앤크레마")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.coffeeandcrema_pic));
            cafename.setText("커피앤크레마");
            cafeaddress.setText("경북 경주시 하동분접길 7");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "070-4201-1261")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("한옥카페부연")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.buyeon_pic));
            cafename.setText("한옥카페부연");
            cafeaddress.setText("경북 경주시 보불로 88");
            cafetime.setText("영업시간 : 12:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "054-744-1101")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************하동*********************************************/

        /*************************************산청*********************************************/
        else if (cafeName.equals("카페아모르")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafeamor_pic));
            cafename.setText("카페아모르");
            cafeaddress.setText("경남 산청군 금서면 매촌리 87-22");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-974-6789")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페플래닛27")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafeplanet27_pic));
            cafename.setText("카페플래닛27");
            cafeaddress.setText("경남 산청군 금서면 경호로 27");
            cafetime.setText("영업시간 : 11:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-2930-0251")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페솔직한곰")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.gom_pic));
            cafename.setText("카페솔직한곰");
            cafeaddress.setText("경남 산청군 산청읍 웅석봉로 71");
            cafetime.setText("영업시간 : 11:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-2748-2894")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페엘림")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafeelim_pic));
            cafename.setText("카페엘림");
            cafeaddress.setText("경남 산청군 단성면 호암로701번길 155-39");
            cafetime.setText("영업시간 : 10:00 ~ 20:00 일요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "070-8884-5899")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페모티")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafemotea_pic));
            cafename.setText("카페모티");
            cafeaddress.setText("경남 산청군 산청읍 꽃봉산로91번길 21");
            cafetime.setText("영업시간 : 12:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-5561-2017")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************산청*********************************************/

        /*************************************남해*********************************************/
        else if (cafeName.equals("쿤스트라운지")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.kunstlounge_pic));
            cafename.setText("쿤스트라운지");
            cafeaddress.setText("경남 남해군 삼동면 독일로 34");
            cafetime.setText("영업시간 : 평일 10:00 ~ 21:00 주말 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "070-4111-4058")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("코나하우스")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.konahouse_pic));
            cafename.setText("코나하우스");
            cafeaddress.setText("경남 남해군 남면 남서대로 493");
            cafetime.setText("영업시간 : 11:00 ~ 19:00 수요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-863-5878")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("카페유자")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.cafeyuja_pic));
            cafename.setText("카페유자");
            cafeaddress.setText("경남 남해군 삼동면 동부대로 1423");
            cafetime.setText("영업시간 : 11:00 ~ 18:00 수요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-867-5201")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("펠리스카페")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.felizcafe_pic));
            cafename.setText("펠리스카페");
            cafeaddress.setText("경남 남해군 삼동면 독일로 22");
            cafetime.setText("영업시간 : 09:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-867-0588")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("크란츠러카페")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.kranzler_pic));
            cafename.setText("크란츠러카페");
            cafeaddress.setText("경남 남해군 삼동면 독일로 46");
            cafetime.setText("영업시간 : 08:00 ~ 18:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-867-8382")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("엘가커피")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.lgacoffee_pic));
            cafename.setText("엘가커피");
            cafeaddress.setText("경남 남해군 창선면 동부대로 2801-3");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-867-5988")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("라 벨라")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.labella_pic));
            cafename.setText("라 벨라");
            cafeaddress.setText("경남 남해군 삼동면 동부대로 1105");
            cafetime.setText("영업시간 : 평일 09:00 ~ 21:00 주말 09:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "010-4146-7337")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************남해*********************************************/

        /*************************************고성*********************************************/
        else if (cafeName.equals("폴라리스")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.polaris_pic));
            cafename.setText("폴라리스");
            cafeaddress.setText("경남 고성군 동해면 조선특구로 2126");
            cafetime.setText("영업시간 : 11:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "070-7422-7089")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("소담수목원카페")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.sodam_pic));
            cafename.setText("소담수목원카페");
            cafeaddress.setText("경남 고성군 동해면 외산로 592");
            cafetime.setText("영업시간 : 10:30 ~ 18:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-673-0700")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("당동박씨네커피")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.dangdong_pic));
            cafename.setText("당동박씨네커피");
            cafeaddress.setText("경남 고성군 거류면 거류로 670");
            cafetime.setText("영업시간 : 평일 10:00 ~ 22:00 주말 12:00 ~ 21:30");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-672-1989")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("디노커피")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.dinocoffee_pic));
            cafename.setText("디노커피");
            cafeaddress.setText("경남 고성군 회화면 남해안대로 3666");
            cafetime.setText("영업시간 : 10:00 ~ 22:00");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "070-8866-4405")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        else if (cafeName.equals("선셋")) {
            cafeinfo.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.sunset_pic));
            cafename.setText("선셋");
            cafeaddress.setText("경남 고성군 고성읍 신월로 37");
            cafetime.setText("영업시간 : 11:00 ~ 22:00 2, 4째주 화요일 휴무");
            call.setText("문의전화");
            pic.setText("사진 더보기");
            location.setText("지도보기");

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (ActivityCompat.checkSelfPermission(SecondActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(SecondActivity.this,"전화 못 걸겠음 권한 없음",Toast.LENGTH_LONG).show();
                    } else {
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "055-673-8192")));
                    }

                }
            });

            //사진더보기 버튼
            pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, PicActivity.class);
                    intent.putExtra("CafeName",getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

            //지도보기 버튼
            location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                    intent.putExtra("CafeName", getIntent().getStringExtra("CafeName"));
                    startActivity(intent);
                }
            });

        }
        /*************************************고성*********************************************/

    }
}