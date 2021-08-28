package com.donation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.donation.entities.Campaign;



@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Long>{

}
