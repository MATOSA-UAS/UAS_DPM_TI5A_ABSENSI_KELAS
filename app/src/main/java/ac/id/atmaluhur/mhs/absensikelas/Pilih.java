package ac.id.atmaluhur.mhs.absensikelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pilih extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_pilih);

        Button balik = (Button)findViewById(R.id.ButtonBalik) ;
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pilih.this, MainActivity.class);
                startActivity(i);
            }
        });

        Button hadir = (Button)findViewById(R.id.ButtonHadir) ;
        hadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pilih.this, Hadir.class);
                startActivity(i);
            }
        });

        Button sakit = (Button)findViewById(R.id.ButtonSakit) ;
        sakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pilih.this, Sakit.class);
                startActivity(i);
            }
        });
    }
}