/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author B.Aja
 */
public class Pemesanan {
    /* attributes */
    private int id;
    private Pengguna id_pengguna;
    private Ruangan id_ruangan;
    private final LocalDate tgl_pemesanan; // ubah type data "date"
    private final LocalDateTime waktu_kegiatan1; // ubah type data "date"
    private final LocalDateTime waktu_kegiatan2; // ubah type data "date"
    private final String nama_kegiatan;
    private String institusi;
    private boolean status; // true if confirmed by admin
    private boolean checked;
    
    /* constructor */
    public Pemesanan(int id, Pengguna pengguna, Ruangan ruangan,String institusi, String nama, LocalDate tglPesan, LocalDateTime waktu1, LocalDateTime waktu2){
        this.id = id;
        this.id_pengguna = pengguna;
        this.id_ruangan = ruangan;
        this.nama_kegiatan = nama;
        this.institusi = institusi;
        this.tgl_pemesanan = tglPesan;
        this.waktu_kegiatan1 = waktu1;
        this.waktu_kegiatan2 = waktu2;
        this.status = false;
        this.checked = false;
    }
    
    /* methods */
    
    public int getId() {
        return this.id;
    }
    public Pengguna getPengguna() {
        return this.id_pengguna;
    }
    public Ruangan getRuangan() {
        return this.id_ruangan;
    }
    public LocalDate getTglPemesanan() {
        return this.tgl_pemesanan;
    }
    public LocalDateTime getWaktuKegiatan1() {
        return this.waktu_kegiatan1;
    }
    public LocalDateTime getWaktuKegiatan2() {
        return this.waktu_kegiatan2;
    }
    public String getNama() {
        return this.nama_kegiatan;
    }
    public String getInstitusi() {
        return this.institusi;
    }
    public String getKegiatan() {
        return this.nama_kegiatan;
    }
    public boolean getStatus () {
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getChecked(){
        return this.checked;
    }
    public void setChecked(boolean check){
        this.checked = check;
    }
    
    
}
