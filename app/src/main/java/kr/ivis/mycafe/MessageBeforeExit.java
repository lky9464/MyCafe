package kr.ivis.mycafe;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by it on 2017. 12. 9..
 */

public class MessageBeforeExit { //초기화면에서 뒤로가기 터치시 앱을 정말 종료할 것인지 물어보는 기능

    private long backKeyPressedTime = 0; //뒤로가기 누른 후 경과시간을 담을 변수
    private Toast toast; //알림창 객체
    private Activity activity; //액티비티 객체

    public MessageBeforeExit(Activity context) {
        this.activity = context;
    }

    public void onBackPressed() {
        if(System.currentTimeMillis() > backKeyPressedTime + 2500) { //2.5초 이후에 뒤로가기 클릭시
            backKeyPressedTime = System.currentTimeMillis();
            showGuide();
            return;
        }
        if(System.currentTimeMillis() <= backKeyPressedTime + 2500) { //2.5초 이내에 뒤로가기 터치시
            activity.finish(); //해당 액티비티에서 앱종료
            toast.cancel(); //알림창 꺼짐
        }
    }

    private void showGuide() {
        toast = Toast.makeText(activity, "\'뒤로\'버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT);
        toast.show();
    }
}
