package com.dzkj.a3dmap.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dzkj.a3dmap.R;

public class BitmapActivity extends AppCompatActivity {

    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmap);
        iv = findViewById(R.id.iv);
        test();

    }
    private void test() {
        Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round);
        Bitmap mBitmap2 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        Bitmap bmOverlay = Bitmap.createBitmap(mBitmap.getWidth(), mBitmap.getHeight(), mBitmap.getConfig());
        Canvas canvas = new Canvas();
        canvas.setBitmap(bmOverlay);
        canvas.drawBitmap(mBitmap, new Matrix(), null);
        canvas.drawBitmap(mBitmap2, new Matrix(), null);
        iv.setImageBitmap(bmOverlay);}
}