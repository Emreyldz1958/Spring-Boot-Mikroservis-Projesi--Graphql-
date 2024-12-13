-- kitapdb ve siparisdb adında veritabanları oluşturuluyor
CREATE DATABASE kitapdb;
CREATE DATABASE siparisdb;

-- kitapdb veritabanını kullanarak tablolar oluşturuluyor
\c kitapdb;

-- Kitap tablosu oluşturuluyor
CREATE TABLE IF NOT EXISTS kitap (
    id SERIAL PRIMARY KEY,
    isim VARCHAR(255),
    yazar VARCHAR(255),
    tur VARCHAR(255),
    fiyat DOUBLE PRECISION
);

-- Sipariş tablosu oluşturuluyor
CREATE TABLE IF NOT EXISTS siparis (
    id SERIAL PRIMARY KEY,
    kitap_id INT REFERENCES kitap(id),
    miktar INT,
    kullanici_id INT
);
