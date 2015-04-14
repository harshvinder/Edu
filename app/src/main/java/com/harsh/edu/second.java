package com.harsh.edu;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Harsh on 3/22/2015.
 */
public class second extends ActionBarActivity {
    static final int REQUEST_CAMERA = 1;
    ImageView harshimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
            harshimage = (ImageView) findViewById(R.id.imageView1);
        Button cam = (Button) findViewById(R.id.cambutton);

       cam.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

            launch_camera(v);
           }
       });
        Button bfs = (Button) findViewById(R.id.sharebut);
        bfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(second.this,Third.class);
                startActivity(i);
            }
        });
    }


    public void launch_camera(View v)

    {
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i,REQUEST_CAMERA);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==REQUEST_CAMERA && resultCode== RESULT_OK)
        {
            if(requestCode==REQUEST_CAMERA && resultCode==RESULT_OK)
            {
                Bundle extras = data.getExtras();
                Bitmap photo = (Bitmap) extras.get("data");
                harshimage.setImageBitmap(photo);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }


}