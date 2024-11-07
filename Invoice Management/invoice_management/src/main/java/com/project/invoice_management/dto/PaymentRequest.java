package com.project.invoice_management.dto;

import java.math.BigDecimal;

public class PaymentRequest {

	private BigDecimal amount;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
