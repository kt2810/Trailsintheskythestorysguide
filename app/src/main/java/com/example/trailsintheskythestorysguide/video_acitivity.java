package com.example.trailsintheskythestorysguide;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadata;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class video_acitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_acitivity);


        VideoView videoView1 = findViewById(R.id.vid_sky1_videoview);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.sora_fc;
        Uri uri = Uri.parse(videoPath);
        videoView1.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView1.setMediaController(mediaController);
        mediaController.setAnchorView(videoView1);


        VideoView videoView2 = findViewById(R.id.vid_sky2_videoview);
        String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.sora_sc;
        Uri uri2 = Uri.parse(videoPath2);
        videoView2.setVideoURI(uri2);

        MediaController mediaController2 = new MediaController(this);
        videoView2.setMediaController(mediaController2);
        mediaController2.setAnchorView(videoView2);


        VideoView videoView3 = findViewById(R.id.vid_sky3_videoview);
        String videoPath3 = "android.resource://" + getPackageName() + "/" + R.raw.sora_3rd;
        Uri uri3 = Uri.parse(videoPath3);
        videoView3.setVideoURI(uri3);

        MediaController mediaController3 = new MediaController(this);
        videoView3.setMediaController(mediaController3);
        mediaController3.setAnchorView(videoView3);

    }


}
