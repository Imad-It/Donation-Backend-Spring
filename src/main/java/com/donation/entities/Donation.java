package com.donation.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Donation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String campaignName;
	private double amount;
	private boolean receiptRequested;
	private Status status;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Campaign campaign;
	
	public Donation() {}
	
	public Donation(String campaignName, double amount, boolean receiptRequested, Status status,Campaign campaign) {
		this.campaignName = campaignName;
		this.amount = amount;
		this.receiptRequested = receiptRequested;
		this.status = status;
		this.campaign = campaign;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isReceiptRequested() {
		return receiptRequested;
	}

	public void setReceiptRequested(boolean receiptRequested) {
		this.receiptRequested = receiptRequested;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
