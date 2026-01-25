package com.osanzana.mstransportrute.repository;

import com.osanzana.mstransportrute.entity.UbicacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUbicacionRepository extends JpaRepository<UbicacionEntity,Long> {
}
