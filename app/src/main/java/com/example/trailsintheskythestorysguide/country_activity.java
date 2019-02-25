package com.example.trailsintheskythestorysguide;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class country_activity extends AppCompatActivity {
    private ImageButton liberl;
    private ImageButton calvard;
    private ImageButton erebonia;
    private ImageButton crossbell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_activity);

        ImageButton button1 = findViewById(R.id.liberl_emblem_btn);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_liberl_page();
            }
        });

        ImageButton button2 = findViewById(R.id.calvard_emblem_btn);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_calvard_page();
            }
        });

        ImageButton button3 = findViewById(R.id.erebonia_emblem_btn);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_erebonia_page();
            }
        });

        ImageButton button4 = findViewById(R.id.crossbell_emblem_btn);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_crossbell_page();
            }
        });

    }

    public void open_liberl_page(){
        Intent intent = new Intent(this, country_liberl.class);
        startActivity(intent);
    }
    public void open_calvard_page(){
        Intent intent = new Intent(this, country_calvard.class);
        startActivity(intent);
    }
    public void open_erebonia_page(){
        Intent intent = new Intent(this, country_erebonia.class);
        startActivity(intent);
    }
    public void open_crossbell_page(){
        Intent intent = new Intent(this, country_crossbell.class);
        startActivity(intent);
    }
}
