package com.training.org;

public class PaymentDetails {
 int payment;
 String payId;
 
 public PaymentDetails() {
		this.payment=0;
		this.payId="";
	}

public PaymentDetails(int payment, String payId) {
	super();
	this.payment = payment;
	this.payId = payId;
}

public int getPayment() {
	return payment;
}

public void setPayment(int payment) {
	this.payment = payment;
}

public String getPayId() {
	return payId;
}

public void setPayId(String payId) {
	this.payId = payId;
}

@Override
public String toString() {
	return "PaymentDetails [payment=" + payment + ", payId=" + payId + "]";
}
 
 
 
}

