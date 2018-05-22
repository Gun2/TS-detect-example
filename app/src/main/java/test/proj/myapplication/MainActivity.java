package test.proj.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClicked001(View v){
        Intent cameraIntent = new Intent(this, DetectorCameraActivity.class);
        startActivity(cameraIntent);    }
}
