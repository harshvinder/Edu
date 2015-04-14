package com.harsh.edu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Harsh on 4/10/2015.
 */
public class CustomAdapter extends ArrayAdapter<String> {

    Integer[] drawim = {R.drawable.food,R.drawable.flower,R.drawable.build,R.drawable.bg};

    CustomAdapter(Context context, String[] Names, Integer[] drawim) {
        super(context, R.layout.fifth,Names);
}
     @Override
        public View getView(int position, View convertView, ViewGroup parent) {
           LayoutInflater youinflate = LayoutInflater.from(getContext());

            View customview = youinflate.inflate(R.layout.fifth,parent,false);
            String givenames = getItem(position);

            TextView listtex = (TextView)customview.findViewById(R.id.texlist);
            ImageView listim = (ImageView)customview.findViewById(R.id.imlist);

            listtex.setText(givenames);

            listim.setImageResource(drawim[position]);

            return customview;
        }

}
