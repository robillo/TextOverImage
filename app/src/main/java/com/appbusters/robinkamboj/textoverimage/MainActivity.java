package com.appbusters.robinkamboj.textoverimage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.mukesh.image_processing.ImageProcessor;

public class MainActivity extends AppCompatActivity {

    private ImageProcessor mImageProcessor;
    private ImageView mImageView;
    private Bitmap mBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.image1);
        mImageProcessor = new ImageProcessor();

        Glide.with(this)
                .load(R.drawable.image)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(mImageView);

        BitmapDrawable drawable = (BitmapDrawable) mImageView.getDrawable();
        mBitmap = drawable.getBitmap();

        mImageProcessor.doInvert(mBitmap);
    }
}
