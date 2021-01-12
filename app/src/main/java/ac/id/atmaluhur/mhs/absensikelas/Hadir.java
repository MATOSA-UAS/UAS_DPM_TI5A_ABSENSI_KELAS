package ac.id.atmaluhur.mhs.absensikelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hadir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_hadir);

        Button balik = (Button)findViewById(R.id.ButtonBalik) ;
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hadir.this, Pilih.class);
                startActivity(i);
            }
        });
    }
}