package com.xemplar.libs.cryptorpc.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.xemplar.libs.cryptorpc.domain.enums.ConnectionTypes;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PeerNodeOverview extends Entity {
	private String address;
	private ConnectionTypes connected;

	public PeerNodeOverview(){}
	public PeerNodeOverview(String address, ConnectionTypes types){
		this.address = address;
		this.connected = types;
	}
}