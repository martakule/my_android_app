package marta.android.catmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Customize extends AppCompatActivity {
    private Button meow1;
    private Button meow2;
    private Button meow3;
    private Button meow4;
    private Button meow5;
    private Button meow6;
    private Button meow7;
    private Button meow8;
    private Button meow9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize);
        meow1 = findViewById(R.id.meow1);
        meow2 = findViewById(R.id.meow2);
        meow3 = findViewById(R.id.meow3);
        meow4 = findViewById(R.id.meow4);
        meow5 = findViewById(R.id.meow5);
        meow6 = findViewById(R.id.meow6);
        meow7 = findViewById(R.id.meow7);
        meow8 = findViewById(R.id.meow8);
        meow9 = findViewById(R.id.meow9);
    }

    public void onPause(View view) {
        // Save new values
    }
}