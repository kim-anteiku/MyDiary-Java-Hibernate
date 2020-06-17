/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Wildan A Geraldine
 */
public class Diary {
    private Integer id;
    private java.util.Date tanggal;
    private String judul;
    private String isi;
    
    public Diary(){
        
    }
    
    public Diary(Integer id, java.util.Date tanggal, String judul, String isi){
        this.id = id;
        this.tanggal = tanggal;
        this.judul = judul;
        this.isi = isi;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the tanggal
     */
    public java.util.Date getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(java.util.Date tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the judul
     */
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * @return the isi
     */
    public String getIsi() {
        return isi;
    }

    /**
     * @param isi the isi to set
     */
    public void setIsi(String isi) {
        this.isi = isi;
    }
    
}
