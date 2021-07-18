package marta.android.catmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer meow1;
    MediaPlayer meow2;
    MediaPlayer meow3;
    MediaPlayer meow4;
    MediaPlayer meow5;
    MediaPlayer meow6;
    MediaPlayer meow7;
    MediaPlayer meow8;
    MediaPlayer meow9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        meow1 = MediaPlayer.create(this, R.raw.meow1);
        meow2 = MediaPlayer.create(this, R.raw.meow2);
        meow3 = MediaPlayer.create(this, R.raw.meow3);
        meow4 = MediaPlayer.create(this, R.raw.meow4);
        meow5 = MediaPlayer.create(this, R.raw.meow5);
        meow6 = MediaPlayer.create(this, R.raw.meow6);
        meow7 = MediaPlayer.create(this, R.raw.meow7);
        meow8 = MediaPlayer.create(this, R.raw.meow8);
        meow9 = MediaPlayer.create(this, R.raw.meow9);
    }

    public void openAbout(View view) {
        Intent intent = new Intent(this, About.class);
        this.startActivity(intent);
    }

    public void openCustomize(View view) {
        Intent intent = new Intent(this, Customize.class);
        this.startActivity(intent);
    }

    public void meow1(View view) {
        meow1.start();
    }
    public void meow2(View view) {
        meow2.start();
    }
    public void meow3(View view) {
        meow3.start();
    }
    public void meow4(View view) {
        meow4.start();
    }
    public void meow5(View view) {
        meow5.start();
    }
    public void meow6(View view) {
        meow6.start();
    }
    public void meow7(View view) {
        meow7.start();
    }
    public void meow8(View view) {
        meow8.start();
    }
    public void meow9(View view) {
        meow9.start();
    }
}