package kr.ivis.mycafe;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by it on 2017. 11. 22..
 */

public class FirstActivity extends AppCompatActivity {

    private MessageBeforeExit messageBeforeExit;

    ConstraintLayout fLayout;
    TextView title;
    Button start, dev, howtoapp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        fLayout = (ConstraintLayout) findViewById(R.id.activity_first);
        fLayout.setBackgroundColor(Color.rgb(255, 217, 236));

        title = (TextView) findViewById(R.id.appTitle);


        start = (Button) findViewById(R.id.startButton); //앱 시작하기 버튼
        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, LocSelectActivity.class);
                startActivity(intent);
            }

        });

        dev = (Button) findViewById(R.id.developerButton); //개발자정보보기 버튼
        dev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, DeveloperActivity.class);
                startActivity(intent);
            }
        });


        howtoapp = (Button) findViewById(R.id.howtoButton);
        howtoapp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, HowtoActivity.class);
                startActivity(intent);
            }
        });

        messageBeforeExit = new MessageBeforeExit(this);

    }

    @Override
    public void onBackPressed() {
        messageBeforeExit.onBackPressed();
    }

}
