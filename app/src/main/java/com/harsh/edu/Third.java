package com.harsh.edu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Harsh on 4/8/2015.
 */
public class Third extends Activity{

    EditText userinput , userpass;
    TextView texv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        userinput = (EditText) findViewById(R.id.editinput);
        userpass = (EditText) findViewById(R.id.editinput2);
        texv = (TextView) findViewById(R.id.textout);


        Button butnex = (Button) findViewById(R.id.nexbut);
        butnex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Third.this,Fourth.class);
                startActivity(i);
            }
        });



    }


public void saveData(View view){

        SharedPreferences sharepref= getSharedPreferences("userinfo", Context.MODE_PRIVATE);

    SharedPreferences.Editor editor = sharepref.edit();
    editor.putString("username",userinput.getText().toString());
    editor.putString("pass", userpass.getText().toString());
    editor.apply();

    Toast.makeText(this,"saved",Toast.LENGTH_SHORT).show();



}

    public void dispData(View view){


        SharedPreferences sharepref= getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        String name = sharepref.getString("username","");
        String pass = sharepref.getString("pass","");
        texv.setText(name + "  " + pass);



    }


}


