package com.example.vision.vision361;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button vision, navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkPermissions();

        vision = (Button) findViewById(R.id.vision);
        navigation = (Button) findViewById(R.id.nav);

        vision.setOnClickListener(this);
        navigation.setOnClickListener(this);

    }
    Intent intent;
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.vision:
            intent = new Intent(this,Vision.class);
            startActivity(intent);
            break;
            case R.id.nav:
            intent = new Intent(this,Navigation.class);
            startActivity(intent);
            break;
        }
    }
    public void checkPermissions() {
        int MY_PERMISSIONS_REQUEST_CAMERA = 100;

        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.READ_EXTERNAL_STORAGE)
                + ContextCompat.checkSelfPermission(this,
                        Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        MY_PERMISSIONS_REQUEST_CAMERA);
        }
    }
}
