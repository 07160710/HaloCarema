package com.kaifeng.halocarema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class HoleActivity extends AppCompatActivity {
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hole);
        iv = (ImageView) (this.findViewById(R.id.imageView1));
        iv.setImageResource(R.drawable.image1);
        //等比例缩放
        iv.setScaleType(ImageView.ScaleType.FIT_XY);
    }
}
