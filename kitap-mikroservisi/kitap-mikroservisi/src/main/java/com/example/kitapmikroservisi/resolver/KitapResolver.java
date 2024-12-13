package com.example.kitapmikroservisi.resolver;

import java.util.List; 
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import com.example.kitapmikroservisi.entity.Kitap;
import com.example.kitapmikroservisi.repository.KitapRepository;

@Component
public class KitapResolver {
    private final KitapRepository kitapRepository;

    public KitapResolver(KitapRepository kitapRepository) {
        this.kitapRepository = kitapRepository;
    }

    @QueryMapping
    public List<Kitap> kitaplar() {
        return kitapRepository.findAll();
    }

    @MutationMapping
    public Kitap addKitap(@Argument String isim, @Argument String yazar, @Argument String tur, @Argument Double fiyat) {
        Kitap kitap = new Kitap(isim, yazar, tur, fiyat);
        return kitapRepository.save(kitap);
    }
}
