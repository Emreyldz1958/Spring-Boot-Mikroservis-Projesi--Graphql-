package com.example.kitapmikroservisi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "kitap")
public class Kitap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isim;
    private String yazar;
    private String tur;  
    private Double fiyat;

    
    public Kitap() {
    }

   
    public Kitap(String isim, String yazar, String tur, Double fiyat) {
        this.isim = isim;
        this.yazar = yazar;
        this.tur = tur;
        this.fiyat = fiyat;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", yazar='" + yazar + '\'' +
                ", tur='" + tur + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}
