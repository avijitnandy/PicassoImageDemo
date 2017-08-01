package com.w3xplorers.picassoimagedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize Image view
        imgView = (ImageView) findViewById(R.id.imageView);

        //http://www.pngmart.com/files/4/Android-PNG-Photos.png

        //Loading Image from URL
        Picasso.with(this)
                .load("http://www.pngmart.com/files/4/Android-PNG-Photos.png")
                .placeholder(R.drawable.placeholder)                             // optional
                .error(R.drawable.error)                                        // optional
                .resize(400,400)                        // optional
                .into(imgView);
    }
}
