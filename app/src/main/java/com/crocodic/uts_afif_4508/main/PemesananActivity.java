package com.crocodic.uts_afif_4508.main;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.crocodic.uts_afif_4508.R;
import com.crocodic.uts_afif_4508.db.SharedPreference;

/**
 * Created by Nama : Afif Faishal Najib.
 * Nim : A11.2014.08251
 * A11.4508
 */

public class PemesananActivity extends AppCompatActivity {

    private EditText etGulai;
    private EditText etAyam;
    private EditText etIga;
    private EditText etMendoan;
    private EditText etSpageti;
    private EditText etRujak;
    private EditText etEs;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan);
        initUI();
    }

    private void initUI() {
        etGulai = (EditText)findViewById( R.id.et_gulai );
        etAyam = (EditText)findViewById( R.id.et_ayam );
        etIga = (EditText)findViewById( R.id.et_iga );
        etMendoan = (EditText)findViewById( R.id.et_mendoan );
        etSpageti = (EditText)findViewById( R.id.et_spageti );
        etRujak = (EditText)findViewById( R.id.et_rujak );
        etEs = (EditText)findViewById( R.id.et_es );
        btnHitung = (Button)findViewById( R.id.btn_hitung );

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strGulai = etGulai.getText().toString().trim();
                String strAyam = etAyam.getText().toString().trim();
                String strIga = etIga.getText().toString().trim();
                String strMendoan = etMendoan.getText().toString().trim();
                String strSpageti= etSpageti.getText().toString().trim();
                String strRujak= etRujak.getText().toString().trim();
                String strEs= etEs.getText().toString().trim();

                if (strGulai.isEmpty() || strAyam.isEmpty() || strIga.isEmpty() || strMendoan.isEmpty() ||
                        strSpageti.isEmpty() || strRujak.isEmpty() || strEs.isEmpty()){
                    Toast.makeText(PemesananActivity.this, "Silahkan isi semua pesanan", Toast.LENGTH_SHORT).show();
                } else {
                    Long lngGulai = Long.parseLong(strGulai);
                    Long lngAyam = Long.parseLong(strAyam);
                    Long lngIga= Long.parseLong(strIga);
                    Long lngMendoan = Long.parseLong(strMendoan);
                    Long lngSpageti = Long.parseLong(strSpageti);
                    Long lngRujak = Long.parseLong(strRujak);
                    Long lngEs= Long.parseLong(strEs);
//                    sharedPreference.setHargaMenu(lngGulai, lngAyam, lngIga, lngMendoan, lngSpageti, lngRujak, lngEs);
                    Intent intent = new Intent(PemesananActivity.this, StrukActivity.class);
                    intent.putExtra("gulai", lngGulai);
                    intent.putExtra("ayam", lngAyam);
                    intent.putExtra("iga", lngIga);
                    intent.putExtra("mendoan", lngMendoan);
                    intent.putExtra("spageti", lngSpageti);
                    intent.putExtra("rujak", lngRujak);
                    intent.putExtra("es", lngEs);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.setting, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                break;
            case R.id.action_done:
                Intent intent = new Intent(PemesananActivity.this, SettingHargaActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        return true;
    }

}
