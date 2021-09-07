package com.manhal.videoview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        mediaController = new MediaController(this);

     //   Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videoeye);
        Uri uri = Uri.parse("https://www.rmp-streaming.com/media/big-buck-bunny-360p.mp4");
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}