package com.appdroid.greetx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

public class Dashboard extends AppCompatActivity {
  Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              openActivity();
            }
        });
    }
      public void openActivity(){
            Intent intent = new Intent(this,CategoryList.class);
            startActivity(intent);

    }
}