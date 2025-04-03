package com.example.chistesyfrases.Repositories;

import com.example.chistesyfrases.Entities.ChistesYFrasesEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface ChistesYFrasesRepository extends JpaRepository<ChistesYFrasesEntity, UUID> {

    Page<ChistesYFrasesEntity> findAllByChisteOFraseContaining(String chisteOFrase, Pageable pageable);

    @Override
    Page<ChistesYFrasesEntity> findAll(Pageable pageable);

}