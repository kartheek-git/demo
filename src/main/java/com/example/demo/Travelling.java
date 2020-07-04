package com.example.demo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Travelling {
	
	private String Ticket;
	private String Name;
	private String BusName;
	private double Amount;
	
	public String getTicket() {
		return Ticket;
	}
	public void setTicket(String ticket) {
		Ticket = ticket;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBusName() {
		return BusName;
	}
	public void setBusName(String busName) {
		BusName = busName;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}

	
}
