package cn.edu.gdmec.a07150841.work2;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("work2","出现了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("work2","恢复了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("work2","暂停了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("work2","停止了");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("work2","重来了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("work2","销毁了");
    }
}
