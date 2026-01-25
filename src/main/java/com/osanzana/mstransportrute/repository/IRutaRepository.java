package com.osanzana.mstransportrute.repository;

import com.osanzana.mstransportrute.entity.RutaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRutaRepository extends JpaRepository<RutaEntity, Long> {
}
