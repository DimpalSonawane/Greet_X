  package com.appdroid.greetx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

  public class Log_in extends AppCompatActivity {
    TextView textView6,textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        textView6 = findViewById(R.id.textView6);
        textView = findViewById(R.id.textView4);

        textView6.setText(Html.fromHtml("By signing you agree to our <u><font color=#367FA5>Terms of Use</font> and <font color=#367FA5>Privacy policy<u></font>"));

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Log_in.this,Verification.class);
                startActivity(intent);

            }
        });
    }
}