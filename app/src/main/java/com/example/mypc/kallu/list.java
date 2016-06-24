package com.example.mypc.kallu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class list extends AppCompatActivity {
    private ListView display_list;
    int section=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        section=getIntent().getIntExtra("section", 0);
        new reader(getApplicationContext()).CopyReadAssets(100 + section, section);
        if(section == 1 || section == 2 || section == 3){
            ArrayList<heading> lists = (ArrayList<heading>) getIntent().getSerializableExtra("list");
            Log.e("section", section+"");
            display_list = (ListView) findViewById(R.id.left_drawer);
            display_list.setAdapter(new customAdapter(this, R.layout.draw_list_item, lists));
            display_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    new reader(getApplicationContext()).CopyReadAssets(position, section);
                }
            });
        }
    }
}