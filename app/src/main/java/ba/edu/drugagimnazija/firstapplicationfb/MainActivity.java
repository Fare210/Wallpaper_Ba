package ba.edu.drugagimnazija.firstapplicationfb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
        private Button promijeniPozadinu;
                private WallpaperManager wpmgr;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        promijeniPozadinu = findViewById(R.id.setBackground);

                promijeniPozadinu.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("ResourceType")
                    @Override
                    public void onClick(View v) {
                        wpmgr = WallpaperManager.getInstance(MainActivity.this);
                        try {
                            wpmgr.setResource(R.raw.pozadina);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
}