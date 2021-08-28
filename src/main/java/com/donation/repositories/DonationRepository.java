package com.donation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.donation.entities.Donation;


@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {

}
