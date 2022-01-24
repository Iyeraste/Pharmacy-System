package com.example.PharmacySystem.repository;

import com.example.PharmacySystem.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {

}
