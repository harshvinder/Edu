package com.harsh.edu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Harsh on 4/10/2015.
 */
public class Fourth extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);
        Button butnex2 = (Button) findViewById(R.id.customli);
        butnex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Fourth.this,Fifth.class);
                startActivity(i);
            }
        });



    }
}
