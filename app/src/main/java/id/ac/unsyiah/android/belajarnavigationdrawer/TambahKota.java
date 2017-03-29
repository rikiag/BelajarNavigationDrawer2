package id.ac.unsyiah.android.belajarnavigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TambahKota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Tambah Kota Baru");
        setContentView(R.layout.activity_tambah_kota);
    }
}
