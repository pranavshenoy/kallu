package com.example.mypc.kallu;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class list extends AppCompatActivity {
    private ListView display_list;
    int section=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        section=getIntent().getIntExtra("section", 0);
        CopyReadAssets(100 + section);
        if(section == 1 || section == 2 || section == 3){
            ArrayList<heading> lists = (ArrayList<heading>) getIntent().getSerializableExtra("list");
            Log.e("section", section+"");
            display_list = (ListView) findViewById(R.id.left_drawer);
            display_list.setAdapter(new customAdapter(this, R.layout.draw_list_item, lists));
            display_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    CopyReadAssets(position);
                }
            });
        }
    }

    private void CopyReadAssets(int position) {
        AssetManager assetManager = getAssets();

        InputStream in = null;
        OutputStream out = null;
        File file = new File(getFilesDir(), position + ".pdf");
        Log.e("getFilesDir()",getFilesDir().toString());
        try {
            in = assetManager.open(section+"/"+position + ".pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            Log.e("file.getName()",file.getName());
            copyFile(in, out);
            in.close();
            out.flush();
            out.close();
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/" + position + ".pdf"),
                "application/pdf");

        startActivity(intent);
    }
    private void copyFile(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1)
        {
            out.write(buffer, 0, read);
        }
    }

}