package kr.ivis.mycafe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

public class DeveloperActivity extends AppCompatActivity {

    RelativeLayout dLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

        dLayout = (RelativeLayout) findViewById(R.id.activity_developer);
        dLayout.setBackgroundColor(Color.rgb(255, 217, 236)); //레이아웃 색상 rgb값으로 설정

    }
}
