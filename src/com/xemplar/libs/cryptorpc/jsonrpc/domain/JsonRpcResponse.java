package com.xemplar.libs.cryptorpc.jsonrpc.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.xemplar.libs.cryptorpc.jsonrpc.deserialization.JsonRpcResponseDeserializer;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = JsonRpcResponseDeserializer.class)
public class JsonRpcResponse extends JsonRpcMessage {
	private String result;
	private JsonRpcError error;

	public void setResult(String result){
		this.result = result;
	}
	public void setError(JsonRpcError error){
		this.error = error;
	}

	public String getResult() {
		return result;
	}
	public JsonRpcError getError() {
		return error;
	}
}