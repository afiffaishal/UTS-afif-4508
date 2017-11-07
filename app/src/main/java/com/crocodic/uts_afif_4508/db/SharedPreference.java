package com.crocodic.uts_afif_4508.db;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Nama : Afif Faishal Najib.
 * Nim : A11.2014.08251
 * A11.4508
 */


@SuppressLint("CommitPrefEdits")
public class SharedPreference {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "DATARESTO";

//    private static final String NAMA_GULAI = "NAMA_GULAI";
    private static final String HARGA_GULAI = "HARGA_GULAI";
//    private static final String NAMA_AYAM = "NAMA_AYAM";
    private static final String HARGA_AYAM = "HARGA_AYAM";
//    private static final String NAMA_IGA = "NAMA_IGA";
    private static final String HARGA_IGA = "HARGA_IGA";
//    private static final String NAMA_MENDOAN = "NAMA_MENDOAN";
    private static final String HARGA_MENDOAN= "HARGA_MENDOAN";
//    private static final String NAMA_SPAGETI = "NAMA_SPAGETI";
    private static final String HARGA_SPAGETI = "HARGA_SPAGETI";
//    private static final String NAMA_RUJAK = "NAMA_RUJAK";
    private static final String HARGA_RUJAK = "HARGA_RUJAK";
//    private static final String NAMA_TEH = "NAMA_TEH";
    private static final String HARGA_TEH = "HARGA_TEH";

    public SharedPreference(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

//    public void setNamaMenu(){
//        // Storing login value as TRUE
//        editor.putString(NAMA_GULAI, "Gulai Kepala Ikan");
//        editor.putString(NAMA_AYAM, "Ayam bakar kalasan");
//        editor.putString(NAMA_IGA, "Iga bakar sambal rujak");
//        editor.putString(NAMA_MENDOAN, "Mendoan anget");
//        editor.putString(NAMA_SPAGETI, "Sphageti carbonara");
//        editor.putString(NAMA_RUJAK, "Rujak singapura");
//        editor.putString(NAMA_TEH, "Es teh manis");
//        editor.commit();
//    }

    public void setHargaMenu(Long lngHargaGulai, Long lngHargaAyam, Long lngHargaIga, Long lngHargaMendoan,
                             Long lngHargaSpageti, Long lngHargaRujak, Long lngHargaTeh){
        // Storing login value as TRUE
        editor.putLong(HARGA_GULAI, lngHargaGulai);
        editor.putLong(HARGA_AYAM, lngHargaAyam);
        editor.putLong(HARGA_IGA, lngHargaIga);
        editor.putLong(HARGA_MENDOAN, lngHargaMendoan);
        editor.putLong(HARGA_SPAGETI, lngHargaSpageti);
        editor.putLong(HARGA_RUJAK, lngHargaRujak);
        editor.putLong(HARGA_TEH, lngHargaTeh);
        editor.commit();
    }

    public Long getHargaGulai(){
        return pref.getLong(HARGA_GULAI, 0);
    }

    public Long getHargaAyam(){
        return pref.getLong(HARGA_AYAM, 0);
    }

    public Long getHargaIga(){
        return pref.getLong(HARGA_IGA, 0);
    }

    public Long getHargaMendoan(){
        return pref.getLong(HARGA_MENDOAN, 0);
    }

    public Long getHargaSpageti(){
        return pref.getLong(HARGA_SPAGETI, 0);
    }

    public Long getHargaRujak(){
        return pref.getLong(HARGA_RUJAK, 0);
    }

    public Long getHargaTeh(){
        return pref.getLong(HARGA_TEH, 0);
    }

//    public String getNamaGulai(){
//        return pref.getString(NAMA_GULAI, "");
//    }
//
//    public String getNamaAyam(){
//        return pref.getString(NAMA_AYAM, "");
//    }
//
//    public String getNamaIga(){
//        return pref.getString(NAMA_IGA, "");
//    }
//
//    public String getNamaMendoan(){
//        return pref.getString(NAMA_MENDOAN, "");
//    }
//
//    public String getNamaSpageti(){
//        return pref.getString(NAM, "");
//    }
//
//    public String getNamaRujak(){
//        return pref.getString(NAMA_GULAI, "");
//    }
//
//    public String getNamaTeh(){
//        return pref.getString(NAMA_GULAI, "");
//    }

}
