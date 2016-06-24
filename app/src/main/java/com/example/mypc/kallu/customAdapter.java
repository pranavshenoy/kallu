package com.example.mypc.kallu;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by PRANAV SHENOY on 22-06-2016.
 */
public class customAdapter extends ArrayAdapter {
    private int resource;
    private LayoutInflater inflater;
    private Context context;
    ArrayList<heading> list_array;
    customAdapter( Context ctx, int resourceId, ArrayList<heading>  objects){
        super( ctx, resourceId, objects );
        inflater = LayoutInflater.from( ctx );
        context=ctx;
        list_array=objects;
        heading x=list_array.get(0);
        resource=resourceId;
    }
    @Override
    public View getView ( int position, View convertView, ViewGroup parent ) {
        TextView head = null;
        TextView writer = null;
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = (RelativeLayout) inflater.inflate( R.layout.draw_list_item,parent,false );
            head= (TextView) convertView.findViewById(R.id.head);
            writer= (TextView) convertView.findViewById(R.id.author);
        heading t=list_array.get(position);
        head.setText(t.getTitle());
        writer.setText("-"+t.getAuthor());
        return convertView;
    }
}
