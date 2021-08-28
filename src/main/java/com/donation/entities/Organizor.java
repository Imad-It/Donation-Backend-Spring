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

@Entity
public class Organizor {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String email;
	private String lastName;
	private String firstName;
	private String password;
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Campaign> campaigns=new ArrayList<Campaign>();
	
	public Organizor() {}

	public Organizor(String email, String lastName, String firstName, String password) {
		this.email = email;
		this.lastName = lastName;
		this.firstName = firstName;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}
	
	
}
