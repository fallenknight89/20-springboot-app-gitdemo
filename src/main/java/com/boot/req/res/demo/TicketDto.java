package com.boot.req.res.demo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketDto {

	private String message;
	private Ticket Tkt;
	private String tktStatus;
	
	public String getTktStatus() {
		return tktStatus;
	}
	public void setTktStatus(String tktStatus) {
		this.tktStatus = tktStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
//	public Ticket getTkt() {
//		return Tkt;
//	}
	public void setTkt(Ticket tkt) {
		Tkt = tkt;
	}
	
}
