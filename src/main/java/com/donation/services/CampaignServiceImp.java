package com.donation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donation.entities.Campaign;
import com.donation.repositories.CampaignRepository;


@Service
public class CampaignServiceImp implements CampaignService {
	
	@Autowired
	private CampaignRepository campaignRepository;

	@Override
	public List<Campaign> getCampaigns() {
		return campaignRepository.findAll();
	}

	@Override
	public Campaign addCampaign(Campaign campaign) {
		return campaignRepository.save(campaign);
	}

	@Override
	public Campaign getCampaign(Long id) {
		return campaignRepository.getById(id);
	}

	@Override
	public Campaign updateCampaign(Long id,Campaign campaign) {
		campaign.setId(id);
		return campaignRepository.save(campaign);
	}

	@Override
	public void deleteCampaign(Long id) {
		campaignRepository.deleteById(id);		
	}

}
