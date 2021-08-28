package com.donation.services;

import java.util.List;

import com.donation.entities.Campaign;

public interface CampaignService {
	
	public List<Campaign> getCampaigns();
	public Campaign addCampaign(Campaign aktion);
	public Campaign getCampaign(Long id);
	public Campaign updateCampaign(Long id, Campaign aktion);
	public void deleteCampaign(Long id);
}
