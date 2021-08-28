package com.donation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donation.entities.Campaign;
import com.donation.entities.Donation;
import com.donation.services.CampaignService;
import com.donation.services.DonationService;


@CrossOrigin("*")
@RestController
@RequestMapping("")
public class FrontController {
	
	@Autowired
	private CampaignService campaignService;
	@Autowired
	private DonationService donationService;
	
	@PostMapping("/add")
	public ResponseEntity<Campaign> addCampaign(@RequestBody Campaign a) {
		return new ResponseEntity<Campaign>(campaignService.addCampaign(a), HttpStatus.CREATED);
	}
	
	@GetMapping("/campaigns")
	public ResponseEntity<List<Campaign>> getCampaign(){
		return new ResponseEntity<List<Campaign>>(campaignService.getCampaigns(), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Campaign> updateCampaign(@PathVariable Long id, @RequestBody Campaign c) {
		return new ResponseEntity<Campaign>(campaignService.updateCampaign(id, c), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCategory(@PathVariable Long id) {
		campaignService.deleteCampaign(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@PostMapping("/{idCamp}/adddonationt")
	public ResponseEntity<Donation> addDonation(@PathVariable Long idCamp,@RequestBody Donation d) {
		return new ResponseEntity<Donation>(donationService.addDonation(idCamp,d), HttpStatus.CREATED);
	}

}
