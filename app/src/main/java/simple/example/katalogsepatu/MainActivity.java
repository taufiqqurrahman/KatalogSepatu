package simple.example.katalogsepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnSport,btnKantor,btnPesta;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKantor = findViewById(R.id.btn_buka_sepatu_kantor);
        btnSport = findViewById(R.id.btn_buka_buka_sport);
        btnPesta = findViewById(R.id.btn_buka_sepatu_Pesta);
        btnKantor.setOnClickListener(view -> bukaGaleri("Kantor"));
        btnSport.setOnClickListener(view -> bukaGaleri("Sport"));
        btnPesta.setOnClickListener(view -> bukaGaleri("Pesta"));
    }

    private void bukaGaleri(String jenisSepatu) {
        Log.d("MAIN","Buka activity kantor");
        Intent intent = new Intent(this, GalerySepatu.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisSepatu);
        startActivity(intent);
    }

}