package com.example.trailsintheskythestorysguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class title_activity extends AppCompatActivity {

    private ImageButton button_fc;
    private ImageButton button_sc;
    private ImageButton button_3rd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_activity);

        ImageButton button1 = findViewById(R.id.title_imgButton_fc);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_fc_page();
            }
        });

        ImageButton button2 = findViewById(R.id.title_imgButton_sc);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_sc_page();
            }
        });

        ImageButton button3 = findViewById(R.id.title_imgButton_3rd);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_3rd_page();
            }
        });


    }
    public void open_fc_page(){
        Intent intent = new Intent(this, title_fc_page.class);
        startActivity(intent);
    }
    public void open_sc_page(){
        Intent intent = new Intent(this, title_sc_page.class);
        startActivity(intent);
    }
    public void open_3rd_page(){
        Intent intent = new Intent(this, title_3rd_page.class);
        startActivity(intent);
    }
}
