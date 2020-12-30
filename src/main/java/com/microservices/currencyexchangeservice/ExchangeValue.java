package com.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "EXCHANGE_VALUE")
public class ExchangeValue {
	
	@Id
	private int id;
	private int port;
	@Column(name = "CURRENCY_FROM")
	private String from;
	@Column(name = "CURRENCY_TO")
	private String to ;
	private BigDecimal conversionMultiple;
	public ExchangeValue(int id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	
	public ExchangeValue() {
		
	}
	

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	

}
