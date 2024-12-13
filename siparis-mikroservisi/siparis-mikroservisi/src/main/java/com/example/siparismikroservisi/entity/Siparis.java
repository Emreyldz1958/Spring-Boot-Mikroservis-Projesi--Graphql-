package com.example.siparismikroservisi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Siparis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long kitapId;
    private int miktar;
    private Long kullaniciId;

    // Default constructor
    public Siparis() {
    }

    // Parametreli constructor
    public Siparis(Long kitapId, int miktar, Long kullaniciId) {
        this.kitapId = kitapId;
        this.miktar = miktar;
        this.kullaniciId = kullaniciId;
    }

    // Getter ve Setter metotları
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKitapId() {
        return kitapId;
    }

    public void setKitapId(Long kitapId) {
        this.kitapId = kitapId;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public Long getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Long kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    @Override
    public String toString() {
        return "Siparis{" +
                "id=" + id +
                ", kitapId=" + kitapId +
                ", miktar=" + miktar +
                ", kullaniciId=" + kullaniciId +
                '}';
    }
}
