package com.donation.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Campaign {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double donationMinimum;
	private double targetAmount;
	@OneToOne(cascade = CascadeType.ALL)
	private Account account;
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy ="campaign")
	private List<Donation> donations= new ArrayList<Donation>();
	
	public Campaign() {}
	
	public Campaign(String name, double donationMinimum, double targetAmount, Account account) {
		this.name = name;
		this.donationMinimum = donationMinimum;
		this.targetAmount = targetAmount;
		this.account = account;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDonationMinimum() {
		return donationMinimum;
	}

	public void setDonationMinimum(double donationMinimum) {
		this.donationMinimum = donationMinimum;
	}

	public double getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(double targetAmount) {
		this.targetAmount = targetAmount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Donation> getDonations() {
		return donations;
	}

	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}

}
