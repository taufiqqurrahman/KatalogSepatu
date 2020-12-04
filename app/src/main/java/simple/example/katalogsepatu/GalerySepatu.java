package simple.example.katalogsepatu;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import simple.example.katalogsepatu.model.Sepatu;

public class GalerySepatu extends AppCompatActivity {

    List<Sepatu> sepatus;
    int indeksTampil = 0;
    String jenisSepatu;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txJenis,txTipe,txBuatan,txDeskripsi,txJudul;
    ImageView ivFotoHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery_sepatu);
        Intent intent = getIntent();
        jenisSepatu = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        sepatus = DataProvider.getSepatusByTipe (this,jenisSepatu);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> hewanPertama());
        btnTerakhir.setOnClickListener(view -> hewanTerakhir());
        btnSebelumnya.setOnClickListener(view -> hewanSebelumnya());
        btnBerikutnya.setOnClickListener(view -> hewanBerikutnya());

        txJenis = findViewById(R.id.txJenis);
        txTipe = findViewById(R.id.txTipe);
        txBuatan = findViewById(R.id.txBuatan);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarSepatu);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Jenis "+jenisSepatu);
    }


    private void tampilkanProfil() {
        Sepatu k = sepatus.get(indeksTampil);
        Log.d("Sepatu","Menampilkan sepatu "+k.getJenis());
        txJenis.setText(k.getJenis());
        txTipe.setText(k.getTipe ());
        txBuatan.setText(k.getBuatan ());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoHewan.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void hewanPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void hewanTerakhir() {
        int posAkhir = sepatus.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void hewanBerikutnya() {
        if (indeksTampil == sepatus.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void hewanSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}