package com.osanzana.mstransportrute.repository;

import com.osanzana.mstransportrute.entity.VehiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculoRepository extends JpaRepository<VehiculoEntity, Long> {
}
