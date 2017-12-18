package kr.ivis.mycafe;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    RelativeLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLayout = (RelativeLayout) findViewById(R.id.activity_main);

        //레이아웃의 색상을 rgb값으로 설정
        mLayout.setBackgroundColor(Color.rgb(255, 217, 236));

        final String Selected = getIntent().getStringExtra("Selected");
        listView = findViewById(R.id.listView);

        //리스트뷰의 색상을 rgb값으로 설정
        listView.setBackgroundColor(Color.rgb(255,240,236));

        String strArray[] = new String[1];

        //이전 액티비티에서 넘겨받은 Selected의 상태에 따라 구분한 조건문
        switch (Selected){
            // ex) 앞서 받아온 Selected가 거창군이면 -> 거창군 카페
            case "거창군": strArray = getResources().getStringArray(R.array.cafes_거창군);break;
            case "합천군": strArray = getResources().getStringArray(R.array.cafes_합천군);break;
            case "의령군": strArray = getResources().getStringArray(R.array.cafes_의령군);break;
            case "창녕군": strArray = getResources().getStringArray(R.array.cafes_창녕군);break;
            case "밀양시": strArray = getResources().getStringArray(R.array.cafes_밀양시);break;
            case "양산시": strArray = getResources().getStringArray(R.array.cafes_양산시);break;
            case "김해시": strArray = getResources().getStringArray(R.array.cafes_김해시);break;
            case "창원시": strArray = getResources().getStringArray(R.array.cafes_창원시);break;
            case "함안군": strArray = getResources().getStringArray(R.array.cafes_함안군);break;
            case "산청군": strArray = getResources().getStringArray(R.array.cafes_산청군);break;
            case "함양군": strArray = getResources().getStringArray(R.array.cafes_함양군);break;
            case "하동군": strArray = getResources().getStringArray(R.array.cafes_하동군);break;
            case "진주시": strArray = getResources().getStringArray(R.array.cafes_진주시);break;
            case "사천시": strArray = getResources().getStringArray(R.array.cafes_사천시);break;
            case "고성군": strArray = getResources().getStringArray(R.array.cafes_고성군);break;
            case "거제시": strArray = getResources().getStringArray(R.array.cafes_거제시);break;
            case "통영시": strArray = getResources().getStringArray(R.array.cafes_통영시);break;
            case "남해군": strArray = getResources().getStringArray(R.array.cafes_남해군);break;
        }

        //리스트뷰에 각 지역별 카페 배열(카페이름들)을 어댑터로 연결시켜줌.
        listView.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,strArray));

        //리스트뷰의 여러 카페들 중 사용자가 선택한 카페의 이름을 받아 SecondActivity로 넘겨줌
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("CafeName", listView.getItemAtPosition(position).toString());
                startActivity(intent);
            }
        });
    }
}