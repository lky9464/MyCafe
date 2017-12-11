package kr.ivis.mycafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LocSelectActivity extends AppCompatActivity {

    Button geochang_btn, hapcheon_btn, uiryeong_btn, changnyeong_btn, miryang_btn, yangsan_btn, gimhae_btn, changwon_btn, hamahn_btn;
    Button sancheong_btn, hamyang_btn, hadong_btn, jinju_btn, sacheon_btn, gosung_btn, geoje_btn, tongyeong_btn, namhae_btn;
    ImageView kn_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loc_select);

        geochang_btn = findViewById(R.id.geochang);
        hapcheon_btn = findViewById(R.id.hapcheon);
        uiryeong_btn = findViewById(R.id.uiryeong);
        changnyeong_btn = findViewById(R.id.changnyeong);
        miryang_btn = findViewById(R.id.miryang);
        yangsan_btn = findViewById(R.id.yangsan);
        gimhae_btn = findViewById(R.id.gimhae);
        changwon_btn = findViewById(R.id.changwon);
        hamahn_btn = findViewById(R.id.hamahn);
        sancheong_btn = findViewById(R.id.sancheong);
        hamyang_btn = findViewById(R.id.hamyang);
        hadong_btn = findViewById(R.id.hadong);
        jinju_btn = findViewById(R.id.jinju);
        sacheon_btn = findViewById(R.id.sacheon);
        gosung_btn = findViewById(R.id.gosung);
        geoje_btn = findViewById(R.id.geoje);
        tongyeong_btn = findViewById(R.id.tongyeong);
        namhae_btn = findViewById(R.id.namhae);



        geochang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "거창군");
                startActivity(intent);
            }
        });

        hapcheon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "합천군");
                startActivity(intent);
            }
        });

        uiryeong_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "의령군");
                startActivity(intent);
            }
        });

        changnyeong_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "창녕군");
                startActivity(intent);
            }
        });

        miryang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "밀양시");
                startActivity(intent);
            }
        });

        yangsan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "양산시");
                startActivity(intent);
            }
        });

        gimhae_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "김해시");
                startActivity(intent);
            }
        });

        changwon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "창원시");
                startActivity(intent);
            }
        });

        hamahn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "함안군");
                startActivity(intent);
            }
        });
        sancheong_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "산청군");
                startActivity(intent);
            }
        });
        hamyang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "함양군");
                startActivity(intent);
            }
        });
        hadong_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "하동군");
                startActivity(intent);
            }
        });
        jinju_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "진주시");
                startActivity(intent);
            }
        });
        sacheon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "사천시");
                startActivity(intent);
            }
        });
        gosung_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "고성군");
                startActivity(intent);
            }
        });
        geoje_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "거제시");
                startActivity(intent);
            }
        });
        tongyeong_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "통영시");
                startActivity(intent);
            }
        });
        namhae_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocSelectActivity.this, MainActivity.class);
                intent.putExtra("Selected", "남해군");
                startActivity(intent);
            }
        });

        kn_map = findViewById(R.id.kn_map);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) { //지역이미지 비율 자동 맞춤
        super.onWindowFocusChanged(hasFocus);

        int height = kn_map.getHeight();
        int width = kn_map.getWidth();
        int length = height < width ? height : width;

        Log.d("rect size", "height : " + height + ", width : " + width + ", length : " + length);
        ConstraintLayout.LayoutParams layoutParams =  new ConstraintLayout.LayoutParams(length, length);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.rightToRight  = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop =  ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;

        kn_map.setLayoutParams(layoutParams);
    }
}
