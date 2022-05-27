package marta.android.catmusic;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

public class ResizeableButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }

    public void openCustomize(View view) {
        Intent intent = new Intent(this, Customize.class);
        this.startActivity(intent);
    }
}