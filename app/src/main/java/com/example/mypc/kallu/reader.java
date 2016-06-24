package com.example.mypc.kallu;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by PRANAV SHENOY on 24-06-2016.
 */
public class reader {
    Context context;

    public reader(Context context){
        this.context=context;
    }
    public void CopyReadAssets(int position,int section) {
        AssetManager assetManager = context.getAssets();
        InputStream in = null;
        OutputStream out = null;
        File file = new File(context.getFilesDir(), position + ".pdf");
        try {
            in = assetManager.open(section + "/" + position + ".pdf");
            out = context.openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);
            copyFile(in, out);
            in.close();
            out.flush();
            out.close();
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + context.getFilesDir() + "/" + position + ".pdf"),
                "application/pdf");
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
    private void copyFile(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1)
            out.write(buffer, 0, read);
    }
}
