package com.example.vision.vision361;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button vision, navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
}
