package com.example.trailsintheskythestorysguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class character_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_activity);

        ImageButton btn_agate = findViewById(R.id.character_agate_link_to_page);
        btn_agate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_agate();
            }
        });

        ImageButton btn_alan = findViewById(R.id.character_alan_link_to_page);
        btn_alan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_alan();
            }
        });

        ImageButton btn_alba = findViewById(R.id.character_alba_link_to_page);
        btn_alba.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_alba_weissmann();
            }
        });

        ImageButton btn_albert = findViewById(R.id.character_albert_link_to_page);
        btn_albert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_albert();
            }
        });

        ImageButton btn_alicia = findViewById(R.id.character_alicia_link_to_page);
        btn_alicia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_alicia();
            }
        });

        ImageButton btn_anelace = findViewById(R.id.character_anelace_link_to_page);
        btn_anelace.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_anelace();
            }
        });

        ImageButton btn_bleublanc = findViewById(R.id.character_bleublanc_link_to_page);
        btn_bleublanc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_bleublanc();
            }
        });

        ImageButton btn_campanella = findViewById(R.id.character_campanella_link_to_page);
        btn_campanella.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_campanella();
            }
        });

        ImageButton btn_cassius = findViewById(R.id.character_cassius_link_to_page);
        btn_cassius.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_cassius();
            }
        });

        ImageButton btn_celeste = findViewById(R.id.character_celeste_link_to_page);
        btn_celeste.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_celeste();
            }
        });

        ImageButton btn_colins = findViewById(R.id.character_colins_link_to_page);
        btn_colins.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_colins();
            }
        });

        ImageButton btn_din = findViewById(R.id.character_din_link_to_page);
        btn_din.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_raven_trio();
            }
        });

        ImageButton btn_don = findViewById(R.id.character_don_link_to_page);
        btn_don.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_don();
            }
        });

        ImageButton btn_dunan = findViewById(R.id.character_dunan_link_to_page);
        btn_dunan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_dunan();
            }
        });

        ImageButton btn_elnan = findViewById(R.id.character_elnan_link_to_page);
        btn_elnan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_elnan();
            }
        });

        ImageButton btn_estelle = findViewById(R.id.character_estelle_link_to_page);
        btn_estelle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_estelle();
            }
        });

        ImageButton btn_georg = findViewById(R.id.character_george_link_to_page);
        btn_georg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_alba_weissmann();
            }
        });

        ImageButton btn_gilbert = findViewById(R.id.character_gilbert_link_to_page);
        btn_gilbert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_gilbert();
            }
        });

        ImageButton btn_giliath = findViewById(R.id.character_giliath_link_to_page);
        btn_giliath.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_giliath();
            }
        });

        ImageButton btn_grant = findViewById(R.id.character_grant_link_to_page);
        btn_grant.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_grant();
            }
        });

        ImageButton btn_gustav = findViewById(R.id.character_gustav_link_to_page);
        btn_gustav.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_gustav();
            }
        });

        ImageButton btn_hilda = findViewById(R.id.character_hilda_link_to_page);
        btn_hilda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_hilda();
            }
        });

        ImageButton btn_jean = findViewById(R.id.character_jean_link_to_page);
        btn_jean.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_jean();
            }
        });

        ImageButton btn_josette = findViewById(R.id.character_josette_link_to_page);
        btn_josette.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_josette();
            }
        });

        ImageButton btn_joshua = findViewById(R.id.character_joshua_link_to_page);
        btn_joshua.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_joshua();
            }
        });

        ImageButton btn_julia = findViewById(R.id.character_julia_link_to_page);
        btn_julia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_julia();
            }
        });

        ImageButton btn_kanone = findViewById(R.id.character_kanone_link_to_page);
        btn_kanone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_kanone();
            }
        });

        ImageButton btn_karna = findViewById(R.id.character_karna_link_to_page);
        btn_karna.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_karna();
            }
        });

        ImageButton btn_kevin = findViewById(R.id.character_kevin_link_to_page);
        btn_kevin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_kevin();
            }
        });

        ImageButton btn_kilika = findViewById(R.id.character_kilika_link_to_page);
        btn_kilika.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_kilika();
            }
        });

        ImageButton btn_klaudia = findViewById(R.id.character_klaudia_link_to_page);
        btn_klaudia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_klaudia();
            }
        });

        ImageButton btn_klaus = findViewById(R.id.character_klaus_link_to_page);
        btn_klaus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_klaus();
            }
        });

        ImageButton btn_kurt = findViewById(R.id.character_kurt_link_to_page);
        btn_kurt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_kurt();
            }
        });

        ImageButton btn_kyle = findViewById(R.id.character_kyle_link_to_page);
        btn_kyle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_kyle();
            }
        });

        ImageButton btn_lace = findViewById(R.id.character_lace_link_to_page);
        btn_lace.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_raven_trio();
            }
        });

        ImageButton btn_lechter = findViewById(R.id.character_lechter_link_to_page);
        btn_lechter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_lechter();
            }
        });

        ImageButton btn_leonhardt = findViewById(R.id.character_leonhardt_link_to_page);
        btn_leonhardt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_leonhardt();
            }
        });

        ImageButton btn_lila = findViewById(R.id.character_lila_link_to_page);
        btn_lila.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_lila();
            }
        });

        ImageButton btn_lorence = findViewById(R.id.character_lorence_link_to_page);
        btn_lorence.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_leonhardt();
            }
        });

        ImageButton btn_luciola = findViewById(R.id.character_luciola_link_to_page);
        btn_luciola.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_luciola();
            }
        });

        ImageButton btn_lugran = findViewById(R.id.character_lugran_link_to_page);
        btn_lugran.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_lugran();
            }
        });

        ImageButton btn_maybelle = findViewById(R.id.character_maybelle_link_to_page);
        btn_maybelle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_maybelle();
            }
        });

        ImageButton btn_morgan = findViewById(R.id.character_morgan_link_to_page);
        btn_morgan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_morgan();
            }
        });

        ImageButton btn_morris = findViewById(R.id.character_morris_link_to_page);
        btn_morris.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_morris();
            }
        });

        ImageButton btn_mueller = findViewById(R.id.character_mueller_link_to_page);
        btn_mueller.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_mueller();
            }
        });

        ImageButton btn_murdoch = findViewById(R.id.character_murdoch_link_to_page);
        btn_murdoch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_murdoch();
            }
        });

        ImageButton btn_olivier = findViewById(R.id.character_olivier_link_to_page);
        btn_olivier.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_olivier();
            }
        });

        ImageButton btn_philip = findViewById(R.id.character_philip_link_to_page);
        btn_philip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_philip();
            }
        });

        ImageButton btn_renne = findViewById(R.id.character_renne_link_to_page);
        btn_renne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_renne();
            }
        });

        ImageButton btn_ries = findViewById(R.id.character_ries_link_to_page);
        btn_ries.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_ries();
            }
        });

        ImageButton btn_rocco = findViewById(R.id.character_rocco_link_to_page);
        btn_rocco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_raven_trio();
            }
        });

        ImageButton btn_rufina = findViewById(R.id.character_rufina_link_to_page);
        btn_rufina.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_rufina();
            }
        });

        ImageButton btn_scherazard = findViewById(R.id.character_scherazard_link_to_page);
        btn_scherazard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_scherazard();
            }
        });

        ImageButton btn_teresa = findViewById(R.id.character_teresa_link_to_page);
        btn_teresa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_teresa();
            }
        });

        ImageButton btn_tita = findViewById(R.id.character_tita_link_to_page);
        btn_tita.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_tita();
            }
        });

        ImageButton btn_walter = findViewById(R.id.character_walter_link_to_page);
        btn_walter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_walter();
            }
        });

        ImageButton btn_zin = findViewById(R.id.character_zin_link_to_page);
        btn_zin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                view_zin();
            }
        });

    }

    public void view_agate(){
        Intent intent = new Intent(this, char_agate.class);
        startActivity(intent);
    }
    public void view_alan(){
        Intent intent = new Intent(this, char_alan.class);
        startActivity(intent);
    }
    public void view_alba_weissmann(){
        Intent intent = new Intent(this, char_alba_weissmann.class);
        startActivity(intent);
    }
    public void view_albert(){
        Intent intent = new Intent(this, char_albert.class);
        startActivity(intent);
    }
    public void view_alicia(){
        Intent intent = new Intent(this, char_alicia.class);
        startActivity(intent);
    }
    public void view_anelace(){
        Intent intent = new Intent(this, char_anelace.class);
        startActivity(intent);
    }
    public void view_bleublanc(){
        Intent intent = new Intent(this, char_bleublanc.class);
        startActivity(intent);
    }
    public void view_campanella(){
        Intent intent = new Intent(this, char_campanella.class);
        startActivity(intent);
    }
    public void view_cassius(){
        Intent intent = new Intent(this, char_cassius.class);
        startActivity(intent);
    }
    public void view_celeste(){
        Intent intent = new Intent(this, char_celeste.class);
        startActivity(intent);
    }
    public void view_colins(){
        Intent intent = new Intent(this, char_colins.class);
        startActivity(intent);
    }
    public void view_raven_trio(){
        Intent intent = new Intent(this, char_raven_trio.class);
        startActivity(intent);
    }
    public void view_don(){
        Intent intent = new Intent(this, char_don.class);
        startActivity(intent);
    }
    public void view_dunan(){
        Intent intent = new Intent(this, char_dunan.class);
        startActivity(intent);
    }
    public void view_elnan(){
        Intent intent = new Intent(this, char_elnan.class);
        startActivity(intent);
    }
    public void view_estelle(){
        Intent intent = new Intent(this, char_estelle.class);
        startActivity(intent);
    }
    public void view_gilbert(){
        Intent intent = new Intent(this, char_gilbert.class);
        startActivity(intent);
    }
    public void view_giliath(){
        Intent intent = new Intent(this, char_giliath.class);
        startActivity(intent);
    }
    public void view_grant(){
        Intent intent = new Intent(this, char_grant.class);
        startActivity(intent);
    }
    public void view_gustav(){
        Intent intent = new Intent(this, char_gustav.class);
        startActivity(intent);
    }
    public void view_hilda(){
        Intent intent = new Intent(this, char_hilda.class);
        startActivity(intent);
    }
    public void view_jean(){
        Intent intent = new Intent(this, char_jean.class);
        startActivity(intent);
    }
    public void view_josette(){
        Intent intent = new Intent(this, char_josette.class);
        startActivity(intent);
    }
    public void view_joshua(){
        Intent intent = new Intent(this, char_joshua.class);
        startActivity(intent);
    }
    public void view_julia(){
        Intent intent = new Intent(this, char_julia.class);
        startActivity(intent);
    }
    public void view_kanone(){
        Intent intent = new Intent(this, char_kanone.class);
        startActivity(intent);
    }
    public void view_karna(){
        Intent intent = new Intent(this, char_karna.class);
        startActivity(intent);
    }
    public void view_kevin(){
        Intent intent = new Intent(this, char_kevin.class);
        startActivity(intent);
    }
    public void view_kilika(){
        Intent intent = new Intent(this, char_kilika.class);
        startActivity(intent);
    }
    public void view_klaudia(){
        Intent intent = new Intent(this, char_klaudia.class);
        startActivity(intent);
    }
    public void view_klaus(){
        Intent intent = new Intent(this, char_klaus.class);
        startActivity(intent);
    }
    public void view_kurt(){
        Intent intent = new Intent(this, char_kurt.class);
        startActivity(intent);
    }
    public void view_kyle(){
        Intent intent = new Intent(this, char_kyle.class);
        startActivity(intent);
    }
    public void view_lechter(){
        Intent intent = new Intent(this, char_lechter.class);
        startActivity(intent);
    }
    public void view_leonhardt(){
        Intent intent = new Intent(this, char_leonhardt.class);
        startActivity(intent);
    }
    public void view_lila(){
        Intent intent = new Intent(this, char_lila.class);
        startActivity(intent);
    }
    public void view_luciola(){
        Intent intent = new Intent(this, char_luciola.class);
        startActivity(intent);
    }
    public void view_lugran(){
        Intent intent = new Intent(this, char_lugran.class);
        startActivity(intent);
    }
    public void view_maybelle(){
        Intent intent = new Intent(this, char_maybelle.class);
        startActivity(intent);
    }
    public void view_morgan(){
        Intent intent = new Intent(this, char_morgan.class);
        startActivity(intent);
    }
    public void view_morris(){
        Intent intent = new Intent(this, char_morris.class);
        startActivity(intent);
    }
    public void view_mueller(){
        Intent intent = new Intent(this, char_mueller.class);
        startActivity(intent);
    }
    public void view_murdoch(){
        Intent intent = new Intent(this, char_murdoch.class);
        startActivity(intent);
    }
    public void view_olivier(){
        Intent intent = new Intent(this, char_olivier.class);
        startActivity(intent);
    }
    public void view_philip(){
        Intent intent = new Intent(this, char_philip.class);
        startActivity(intent);
    }
    public void view_renne(){
        Intent intent = new Intent(this, char_renne.class);
        startActivity(intent);
    }
    public void view_ries(){
        Intent intent = new Intent(this, char_ries.class);
        startActivity(intent);
    }
    public void view_rufina(){
        Intent intent = new Intent(this, char_rufina.class);
        startActivity(intent);
    }
    public void view_scherazard(){
        Intent intent = new Intent(this, char_scherazard.class);
        startActivity(intent);
    }
    public void view_teresa(){
        Intent intent = new Intent(this, char_teresa.class);
        startActivity(intent);
    }
    public void view_tita(){
        Intent intent = new Intent(this, char_tita.class);
        startActivity(intent);
    }
    public void view_walter(){
        Intent intent = new Intent(this, char_walter.class);
        startActivity(intent);
    }
    public void view_zin(){
        Intent intent = new Intent(this, char_zin.class);
        startActivity(intent);
    }
}
