package com.donation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.donation.entities.Organizor;

@Repository
public interface OrganizorRepository extends JpaRepository<Organizor, Long>{

}
