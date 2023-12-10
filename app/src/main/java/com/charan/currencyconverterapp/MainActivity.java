package com.charan.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtamount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        b1 = findViewById(R.id.btn1);

        String[] from = {"USD","Egyptian Pound","Indian Rupees","Srilankan Rupees"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to = {"Indian Rupees","Srilankan Rupees","USD","Egyptian Pound"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Double tot;
                Double amount = Double.parseDouble(ed1.getText().toString());

                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Indian Rupees"){
                    tot = amount * 83.43;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Srilankan Rupees"){
                    tot = amount * 327.59;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "USD"){
                    tot = amount ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Egyptian Pound"){
                    tot = amount * 30.93;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Egyptian Pound" && sp2.getSelectedItem().toString() == "Indian Rupees"){
                    tot = amount * 2.70;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Egyptian Pound" && sp2.getSelectedItem().toString() == "Srilankan Rupees"){
                    tot = amount * 10.59;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Egyptian Pound" && sp2.getSelectedItem().toString() == "USD"){
                    tot = amount / 30.93;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Egyptian Pound" && sp2.getSelectedItem().toString() == "Egyptian Pound"){
                    tot = amount ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Egyptian Pound"){
                    tot = amount / 2.70;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Indian Rupees"){
                    tot = amount;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Srilankan Rupees"){
                    tot = amount * 3.93;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "USD"){
                    tot = amount / 83.43;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Srilankan Rupees" && sp2.getSelectedItem().toString() == "Srilankan Rupees"){
                    tot = amount ;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Srilankan Rupees" && sp2.getSelectedItem().toString() == "Indian Rupees"){
                    tot = amount / 3.93;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Srilankan Rupees" && sp2.getSelectedItem().toString() == "USD"){
                    tot = amount / 327.59;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Srilankan Rupees" && sp2.getSelectedItem().toString() == "Egyptian Pound"){
                    tot = amount * 10.59;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}