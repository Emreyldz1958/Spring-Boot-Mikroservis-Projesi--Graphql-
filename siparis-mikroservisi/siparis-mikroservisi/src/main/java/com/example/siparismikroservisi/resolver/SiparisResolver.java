package com.example.siparismikroservisi.resolver;

import java.util.List; 
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import com.example.siparismikroservisi.entity.Siparis;
import com.example.siparismikroservisi.repository.SiparisRepository;

@Component
public class SiparisResolver {
    private final SiparisRepository siparisRepository;

    public SiparisResolver(SiparisRepository siparisRepository) {
        this.siparisRepository = siparisRepository;
    }

    @QueryMapping
    public List<Siparis> siparisler() {
        return siparisRepository.findAll();
    }

    @MutationMapping
    public Siparis addSiparis(@Argument Long kitapId, @Argument int miktar, @Argument Long kullaniciId) {
        Siparis siparis = new Siparis(kitapId, miktar, kullaniciId);
        return siparisRepository.save(siparis);
    }
}

