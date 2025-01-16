package com.example.lab9.service;

import com.example.lab9.entity.Masina;
import com.example.lab9.repo.MasinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasinaService {
    @Autowired
    private MasinaRepository masinaRepository;

    public void adaugaMasina(Masina masina) {
        masinaRepository.save(masina);
    }

    public void stergeMasina(String numarInmatriculare) {
        masinaRepository.deleteById(numarInmatriculare);
    }

    public Masina cautaMasina(String numarInmatriculare) {
        return masinaRepository.findById(numarInmatriculare).orElse(null);
    }

    public Iterable<Masina> getToateMasinile() {
        return masinaRepository.findAll();
    }

    public long numarMasiniMarca(String marca) {
        return masinaRepository.countByMarca(marca);
    }

    public long numarMasiniSub100000Km() {
        return masinaRepository.countByKilometriLessThan(100000);
    }

    public Iterable<Masina> masiniMaiNoiDe5Ani() {
        return masinaRepository.findByAnFabricatieGreaterThan(2018);
    }
}
