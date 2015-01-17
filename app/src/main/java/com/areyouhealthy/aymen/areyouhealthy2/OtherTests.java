package com.areyouhealthy.aymen.areyouhealthy2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class OtherTests extends Activity implements View.OnClickListener {


    ImageButton cvomit, cdiah, cAnsomnia;
    Button valider, annuler;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //To change body of generated methods, choose Tools | Templates.
        setContentView(R.layout.othertests);


        cvomit = (ImageButton) findViewById(R.id.cvomit);
        cdiah = (ImageButton) findViewById(R.id.cdiah);
        valider = (Button) findViewById(R.id.valider);
        annuler = (Button) findViewById(R.id.annuler);
        cAnsomnia = (ImageButton) findViewById(R.id.cAnsomnia);

        cvomit.setOnClickListener(this);
        cdiah.setOnClickListener(this);
        cAnsomnia.setOnClickListener(this);
        valider.setOnClickListener(this);
        annuler.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        int i = v.getId();
        if (i == R.id.cvomit) {
            AlertDialog alert = new AlertDialog.Builder(OtherTests.this).create();
            alert.setTitle("Vomit");
            alert.setMessage("Vomit cad wa7ed yet9aye2");
            alert.setButton("OK", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(OtherTests.this, "I get the info.", Toast.LENGTH_SHORT).show();

                }
            });


            //  alert.setCancelable(false);
            alert.show();

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        } else if (i == R.id.cdiah) {
            AlertDialog alert = new AlertDialog.Builder(OtherTests.this).create();
            alert.setTitle("Diahria");
            alert.setMessage("Diahria cad wa7ed karchah tejri Constipation cad wa7ed karchah 3asma ");
            alert.setButton("OK", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(OtherTests.this, "I get the info.", Toast.LENGTH_SHORT).show();

                }
            });


            //  alert.setCancelable(false);
            alert.show();

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        } else if (i == R.id.cAnsomnia) {
            AlertDialog alert = new AlertDialog.Builder(OtherTests.this).create();
            alert.setTitle("Ansomnia");
            alert.setMessage("Ansomnia cad wa7ed Na9es noum");
            alert.setButton("OK", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(OtherTests.this, "I get the info.", Toast.LENGTH_SHORT).show();

                }
            });


            //  alert.setCancelable(false);
            alert.show();

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        } else if (i == R.id.valider) {
            Intent intent = new Intent(this, EnregistrementEtat.class);
            intent.putExtra("EnregistrementEtat", "bonjour aymoun");
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        } else if (i == R.id.annuler) {
            Intent intent = new Intent(this, EnregistrementEtat.class);
            intent.putExtra("EnregistrementEtat", "bonjour aymoun");
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        }


    }
}
