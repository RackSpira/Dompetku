package com.rackspira.dompetku.database;

import java.io.Serializable;

/**
 * Created by YUDHA on 19/12/2016.
 */

public class DataMasuk implements Serializable {
    private String ket;
    private String biaya;
    private String status;
    private String tanggal;
    private String id;

    public DataMasuk(String ket, String biaya, String status, String tanggal,String id) {
        this.ket = ket;
        this.biaya = biaya;
        this.status = status;
        this.tanggal = tanggal;
        this.id = id;
    }

    public DataMasuk() {
    }

    public String getKet() {
        return ket;
    }

    public String getBiaya() {
        return biaya;
    }

    public String getStatus() {
        return status;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}