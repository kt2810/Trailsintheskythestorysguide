package com.example.trailsintheskythestorysguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class organization_activity extends AppCompatActivity {
    private ImageButton bracer_btn;
    private ImageButton septian_church_btn;
    private ImageButton epstein_foundation_btn;
    private ImageButton zcf_btn;
    private ImageButton gralsritter_dominion_btn;
    private ImageButton ouroboros_btn;
    private ImageButton red_constellation_btn;
    private ImageButton intelligence_division_liberl_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organization_activity);


        bracer_btn =findViewById(R.id.bracer_btn);
        bracer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                open_bracer_activity();
            }
        });

        septian_church_btn =findViewById(R.id.septian_church_btn);
        septian_church_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                open_septian_church_activity();
            }
        });

        epstein_foundation_btn =findViewById(R.id.epstein_foundation_btn);
        epstein_foundation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                open_epstein_foundation_activity();
            }
        });

        zcf_btn =findViewById(R.id.zcf_btn);
        zcf_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                open_zcf_activity();
            }
        });

        gralsritter_dominion_btn =findViewById(R.id.gralsritter_btn);
        gralsritter_dominion_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                open_gralsritter_dominion_activity();
            }
        });

        ouroboros_btn =findViewById(R.id.ouroboros_btn);
        ouroboros_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                open_ouroboros_activity();
            }
        });
    }

    public void open_bracer_activity(){
        Intent intent = new Intent(this, bracer_guild.class);
        startActivity(intent);
    }
    public void open_septian_church_activity() {
        Intent intent = new Intent(this, septian_church.class);
        startActivity(intent);
    }
    public void open_gralsritter_dominion_activity() {
        Intent intent = new Intent(this, gralsritter.class);
        startActivity(intent);
    }
    public void open_epstein_foundation_activity(){
        Intent intent = new Intent(this, epstein_foundation.class);
        startActivity(intent);
    }
    public void open_zcf_activity(){
        Intent intent = new Intent(this, zcf.class);
        startActivity(intent);
    }
    public void open_ouroboros_activity(){
        Intent intent = new Intent(this, ouroboros.class);
        startActivity(intent);
    }
    public void open_red_constellation_activity(){
        Intent intent = new Intent(this, red_onstellation.class);
        startActivity(intent);
    }
    public void open_intelligence_division_liberl_activity(){
        Intent intent = new Intent(this, intelligence_division_liberl.class);
        startActivity(intent);
    }
}
