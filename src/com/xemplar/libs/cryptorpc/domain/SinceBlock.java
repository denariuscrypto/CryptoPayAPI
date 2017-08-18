package com.xemplar.libs.cryptorpc.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SinceBlock extends Entity {
	@JsonProperty("transactions")
	private List<Payment> payments;
	@JsonProperty("lastblock")
	private String lastBlock;

	public SinceBlock(){}
	public SinceBlock(List<Payment> payments, String lastBlock){
		this.payments = payments;
		this.lastBlock = lastBlock;
	}
}