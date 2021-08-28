package com.donation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donation.entities.Campaign;
import com.donation.entities.Donation;
import com.donation.repositories.CampaignRepository;
import com.donation.repositories.DonationRepository;

@Service
public class DonationServiceImp implements DonationService{
	
	@Autowired
	private DonationRepository donationRepository;
	@Autowired
	private CampaignRepository campaignRepository;

	@Override
	public Donation addDonation(Long id,Donation donation) {
		Campaign campaign = campaignRepository.getById(id);
		donation.setCampaign(campaign);
		return donationRepository.save(donation);
	}

}
