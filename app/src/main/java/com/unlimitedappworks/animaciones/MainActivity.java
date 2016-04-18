package com.unlimitedappworks.animaciones;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Animation girar, ampliar, trasladar, alpha;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.iv);
        girar = AnimationUtils.loadAnimation(this, R.anim.girar);
        ampliar = AnimationUtils.loadAnimation(this, R.anim.ampliar);
        trasladar = AnimationUtils.loadAnimation(this, R.anim.trasladar);
        alpha = AnimationUtils.loadAnimation(this, R.anim.transparencia);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAmpliar:
                imageView.startAnimation(ampliar);
                break;
            case R.id.btnGirar:
                imageView.startAnimation(girar);
                break;
            case R.id.btnTrans:
                imageView.startAnimation(alpha);
                break;
            case R.id.btnTrasladar:
                imageView.startAnimation(trasladar);
                break;
        }
    }
}
