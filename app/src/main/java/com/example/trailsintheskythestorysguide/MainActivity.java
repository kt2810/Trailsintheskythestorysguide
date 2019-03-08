package com.example.trailsintheskythestorysguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button_title;
    private Button button_character;
    private Button button_country;
    private Button button_timeline;
    private Button button_organization;
    private Button button_vid;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons access to other activities

        //title
        button_title =findViewById(R.id.button_title);
        button_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                open_title_activity();
            }
        });


        //character
        button_character =findViewById(R.id.button_character);
        button_character.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                open_character_activity();
            }
        });


        button_country =findViewById(R.id.button_country);
        button_country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                open_country_activity();
            }
        });

        //timeline
        button_timeline =findViewById(R.id.button_time);
        button_timeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                open_timeline_activity();
            }
        });

        //organization
        button_organization =findViewById(R.id.button_org);
        button_organization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                open_organization_activity();
            }
        });

        //video
        button_vid =findViewById(R.id.button_vid);
        button_vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                open_video_activity();
            }
        });
    }


    public void open_title_activity(){
        Intent intent = new Intent(this, title_activity.class);
        startActivity(intent);
    }
    public void open_character_activity() {
        Intent intent = new Intent(this, character_activity.class);
        startActivity(intent);
    }
    public void open_country_activity(){
        Intent intent = new Intent(this, country_activity.class);
        startActivity(intent);
    }
    public void open_timeline_activity(){
        Intent intent = new Intent(this, timeline.class);
        startActivity(intent);
    }
    public void open_organization_activity(){
        Intent intent = new Intent(this, organization_activity.class);
        startActivity(intent);
    }
    public void open_video_activity(){
        Intent intent = new Intent(this, video_acitivity.class);
        startActivity(intent);
    }
   /* public void buttonOnClick(View v) {
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), video.class));
    }*/
}
