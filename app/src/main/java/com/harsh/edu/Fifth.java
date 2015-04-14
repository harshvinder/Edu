package com.harsh.edu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Harsh on 4/10/2015.
 */
public class Fifth extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listing);
        String[] Names = {"harsh","simran","sanya","manya"};
        Integer[] drawim = {R.drawable.food,R.drawable.flower,R.drawable.build,R.drawable.bg};

        CustomAdapter mylistadapt = new CustomAdapter(this,Names,drawim);
        ListView smarty = (ListView)findViewById(R.id.harshlist);
        smarty.setAdapter(mylistadapt);

        smarty.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Names = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(Fifth.this, Names , Toast.LENGTH_SHORT).show();
            }
        });

    }
}
