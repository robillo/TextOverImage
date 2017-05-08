package com.appbusters.robinkamboj.textoverimage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.ColorFilterTransformation;
import jp.wasabeef.glide.transformations.CropCircleTransformation;
import jp.wasabeef.glide.transformations.GrayscaleTransformation;
import jp.wasabeef.glide.transformations.MaskTransformation;
import jp.wasabeef.glide.transformations.gpu.BrightnessFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.ContrastFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.KuwaharaFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SepiaFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SketchFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.VignetteFilterTransformation;

public class MainActivity extends AppCompatActivity {

    private Bitmap mBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Glide.with(this)
                .load(R.drawable.image)
                .bitmapTransform(new GrayscaleTransformation(getApplicationContext()))
                .into((ImageView) findViewById(R.id.image1));

        Glide.with(this)
                .load(R.drawable.image)
                .bitmapTransform(new ColorFilterTransformation(getApplicationContext(), R.color.colorPrimary))
                .into((ImageView) findViewById(R.id.image2));

        Glide.with(this)
                .load(R.drawable.image)
                .bitmapTransform(new BrightnessFilterTransformation(getApplicationContext(), -0.6f))
                .into((ImageView) findViewById(R.id.image3));

        Glide.with(this)
                .load(R.drawable.image)
                .bitmapTransform(new SepiaFilterTransformation(getApplicationContext(), 1.0f))
                .into((ImageView) findViewById(R.id.image4));

        Glide.with(this)
                .load(R.drawable.image)
                .bitmapTransform(new VignetteFilterTransformation(getApplicationContext()))
                .into((ImageView) findViewById(R.id.image5));

        Glide.with(this)
                .load(R.drawable.image)
                .bitmapTransform(new KuwaharaFilterTransformation(getApplicationContext(), 25))
                .into((ImageView) findViewById(R.id.image6));

        Glide.with(this)
                .load(R.drawable.image)
                .bitmapTransform(new BrightnessFilterTransformation(getApplicationContext(), 0.7f))
                .into((ImageView) findViewById(R.id.image7));

        Glide.with(this)
                .load(R.drawable.image)
                .bitmapTransform(new SketchFilterTransformation(getApplicationContext()))
                .into((ImageView) findViewById(R.id.image8));
    }
}
