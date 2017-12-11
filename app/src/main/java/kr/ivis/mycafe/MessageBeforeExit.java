package kr.ivis.mycafe;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by it on 2017. 12. 9..
 */

public class MessageBeforeExit { //초기화면에서 뒤로가기 터치시 앱을 정말 종료할 것인지 물어보는 기능

    private long backKeyPressedTime = 0;
    private Toast toast;

    private Activity activity;

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
            activity.finish();
            toast.cancel();
        }
    }

    private void showGuide() {
        toast = Toast.makeText(activity, "\'뒤로\'버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT);
        toast.show();
    }
}
