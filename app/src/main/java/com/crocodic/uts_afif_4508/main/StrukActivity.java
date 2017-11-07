package com.crocodic.uts_afif_4508.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.crocodic.uts_afif_4508.R;
import com.crocodic.uts_afif_4508.db.SharedPreference;

import org.w3c.dom.Text;

/**
 * Created by Nama : Afif Faishal Najib.
 * Nim : A11.2014.08251
 * A11.4508
 */

public class StrukActivity extends AppCompatActivity {

    private EditText etGulai;
    private EditText etAyam;
    private EditText etIga;
    private EditText etMendoan;
    private EditText etSpageti;
    private EditText etRujak;
    private EditText etEs;
    private EditText etTotal;

    private SharedPreference sharedPreference;

    private Long lngGulai;
    private Long lngAyam;
    private Long lngIga;
    private Long lngMendoan;
    private Long lngSpageti;
    private Long lngRujak;
    private Long lngEs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sharedPreference = new SharedPreference(getApplicationContext());
        initUI();

        Bundle extrass = getIntent().getExtras();

        if (extrass!=null){
            lngGulai = extrass.getLong("gulai");
            lngAyam = extrass.getLong("ayam");
            lngIga = extrass.getLong("iga");
            lngMendoan = extrass.getLong("mendoan");
            lngSpageti = extrass.getLong("spageti");
            lngRujak = extrass.getLong("rujak");
            lngEs = extrass.getLong("es");
        }

        setValue();
    }

    private void initUI() {
        etGulai = (EditText)findViewById( R.id.et_gulai );
        etAyam = (EditText)findViewById( R.id.et_ayam );
        etIga = (EditText)findViewById( R.id.et_iga );
        etMendoan = (EditText)findViewById( R.id.et_mendoan );
        etSpageti = (EditText)findViewById( R.id.et_spageti );
        etRujak = (EditText)findViewById( R.id.et_rujak );
        etEs = (EditText)findViewById( R.id.et_es );
        etTotal = (EditText) findViewById( R.id.et_total );
    }

    private void setValue(){
        Long lngTotalGulai = sharedPreference.getHargaGulai()*lngGulai;
        Long lngTotalAyam = sharedPreference.getHargaAyam()*lngAyam;
        Long lngTotalIga = sharedPreference.getHargaIga()*lngIga;
        Long lngTotalMendoan = sharedPreference.getHargaMendoan()*lngMendoan;
        Long lngTotalSpageti = sharedPreference.getHargaSpageti()*lngSpageti;
        Long lngTotalRujak = sharedPreference.getHargaRujak()*lngRujak;
        Long lngTotalEs = sharedPreference.getHargaTeh()*lngEs;
        Long lngTotal = lngTotalGulai+lngTotalAyam+lngTotalIga+lngTotalMendoan+lngTotalSpageti+lngTotalRujak
                +lngTotalEs;
        etGulai.setText(""+String.valueOf(lngTotalGulai));
        etAyam.setText(""+String.valueOf(lngTotalAyam));
        etIga.setText(""+String.valueOf(lngTotalIga));
        etMendoan.setText(""+String.valueOf(lngTotalMendoan));
        etSpageti.setText(""+String.valueOf(lngTotalSpageti));
        etRujak.setText(""+String.valueOf(lngTotalRujak));
        etEs.setText(""+String.valueOf(lngTotalEs));

        etTotal.setText(""+String.valueOf(lngTotal));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
