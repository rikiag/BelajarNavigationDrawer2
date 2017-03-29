package id.ac.unsyiah.android.belajarnavigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TambahJadwal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Tambah Jadwal Baru");
        setContentView(R.layout.activity_tambah_jadwal);
    }
}
