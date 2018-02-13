package kr.ivis.mycafe;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AuthorityActivity extends AppCompatActivity {

    TextView authority2;
    TextView home;
    RelativeLayout aLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authority);

        aLayout = findViewById(R.id.activity_authority);
        aLayout.setBackgroundColor(Color.rgb(255, 217, 236)); //레이아웃 색상 rgb값으로 설정

        authority2 = findViewById(R.id.authority2);

        authority2.setText(
                " 권한 활성화가 필요합니다.\n\n" +
                "\'설정 > 애플리케이션(앱권한) > CafeDa >\n 권한 > 위치, 전화 권한 on\'\n\n" +
                "위 상태로 설정해주시면 사용 가능합니다.");

        home = findViewById(R.id.textView4);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AuthorityActivity.this, FirstActivity.class);

                startActivity(intent);
                finish();
            }
        });
    }
}
