package kr.ivis.mycafe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HowtoActivity extends AppCompatActivity {

    RelativeLayout hLayout;

    TextView appdesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howto);

        hLayout = (RelativeLayout) findViewById(R.id.activity_howto);
        hLayout.setBackgroundColor(Color.rgb(255, 217, 236)); //레이아웃 색상 rgb값으로 설정

        appdesc = (TextView) findViewById(R.id.appDesc);
        appdesc.setText(" 이 앱은 경남 각 지역별 인기카페 정보를 제공하는 앱입니다.\n\n\n" +
                " 초기 화면의 '시작하기' 버튼을 누르면 경남 18개\n시/군을 고를 수 있습니다.\n\n\n" +
                " 지역을 고르면 해당지역의 추천 카페 리스트를\n볼 수 있는데, 원하는 카페를 터치하면 해당 카페의\n정보를 볼 수 있습니다.\n\n\n" +
                " '지도보기'와 '전화걸기'를 통해 편하게 매장에\n전화를 걸거나, 위치정보 등을 알 수 있습니다.\n\n" +
                " 사용중 문제/의문점이 생기거나 잘못된 정보를 발견하시면, 초기화면의 '개발자정보' 페이지를\n이용해 주시기 바랍니다.\n\n\n" +
                "감사합니다.\n\n\n");
    }
}
