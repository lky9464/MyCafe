package kr.ivis.mycafe;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by it on 2017. 12. 9..
 */

public class MessageBeforeExit { //앱을 종료할것인지 물어보는 기능

    private long backKeyPressedTime = 0;
    private Toast toast;

    private Activity activity;

    public MessageBeforeExit(Activity context) {
        this.activity = context;
    }

    public void onBackPressed() {
        if(System.currentTimeMillis() > backKeyPressedTime + 2500) {
            backKeyPressedTime = System.currentTimeMillis();
            showGuide();
            return;
        }
        if(System.currentTimeMillis() <= backKeyPressedTime + 2500) {
            activity.finish();
            toast.cancel();
        }
    }

    private void showGuide() {
        toast = Toast.makeText(activity, "\'뒤로\'버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT);
        toast.show();
    }
}
