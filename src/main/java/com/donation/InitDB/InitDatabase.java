package com.donation.InitDB;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.donation.entities.Account;
import com.donation.entities.Campaign;
import com.donation.entities.Donation;
import com.donation.entities.Organizor;
import com.donation.entities.Status;
import com.donation.repositories.OrganizorRepository;


@Component
@Transactional
public class InitDatabase implements CommandLineRunner{

	@Autowired
	private OrganizorRepository oraganisatorRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Account account = new Account("Sparkasse", "40055");
		Campaign campaign = new Campaign("Essen für Arme",10.00,1000.00,account);
		Donation donation1 = new Donation("Khalid",10.00,false,Status.UBERWIESEN,campaign);
		donation1.setCampaign(campaign);
		Donation donation2 = new Donation("Samir",20.00,true,Status.IN_BEARBEITUNG,campaign);
		
		List<Donation> donations = new ArrayList<Donation>();
		donations.add(donation1);
		donations.add(donation2);
		campaign.setDonations(donations);
		Organizor organizor = new Organizor("imad@gmail.com","Imado","Imad","1234");
	
		organizor.getCampaigns().add(campaign);
		oraganisatorRepo.save(organizor);
	}

}
