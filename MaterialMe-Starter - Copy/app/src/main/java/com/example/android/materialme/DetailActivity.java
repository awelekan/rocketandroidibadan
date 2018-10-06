package com.example.android.materialme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    Intent detailIntent = new Intent(mContext, DetailActivity.class);
detailIntent.putExtra("title", currentSport.getTitle());
detailIntent.putExtra("image_resource", currentSport.getImageResource());
}

    TextView sportsTitle = (TextView)findViewById(R.id.titleDetail);
    ImageView sportsImage = (ImageView)findViewById(R.id.sportsImageDetail);
    sportsTitle.setText(getIntent().getStringExtra("title"));
            Glide.with(this).load(getIntent().getIntExtra("image_resource",0))
            .into(sportsImage);
