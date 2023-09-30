package com.appdroid.greetx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.appdroid.greetx.Fragment.ImageFragment;
import com.appdroid.greetx.Fragment.TextFragment;

public class Sub_category_1 extends AppCompatActivity {

    TextView imageFrag, textFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category1);

        imageFrag = findViewById(R.id.imageFrag);
        textFrag = findViewById(R.id.textFrag);

        getSupportFragmentManager().beginTransaction().add(R.id.container, new ImageFragment()).commit();

        imageFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageFrag.setBackgroundResource(R.color.purple_700);
                textFrag.setBackgroundResource(R.color.black);
                getSupportFragmentManager().beginTransaction().add(R.id.container, new ImageFragment()).commit();
            }
        });

        textFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageFrag.setBackgroundResource(R.color.black);
                textFrag.setBackgroundResource(R.color.purple_700);
                getSupportFragmentManager().beginTransaction().add(R.id.container, new TextFragment()).commit();
            }
        });

    }
}