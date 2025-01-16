package com.example.lab9.repo;

import com.example.lab9.entity.Masina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface MasinaRepository extends JpaRepository<Masina, String> {
    long countByMarca(String marca);
    long countByKilometriLessThan(int kilometri);
    Iterable<Masina> findByAnFabricatieGreaterThan(int an);
}
