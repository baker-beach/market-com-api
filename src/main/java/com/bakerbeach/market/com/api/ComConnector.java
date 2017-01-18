package com.bakerbeach.market.com.api;

import java.util.Map;

public interface ComConnector {
	
	public void generateMessageAndSend(String messageType, Map<String, Object> data) throws ComConnectorException;

	void setBcc(Map<String, String> bcc);

	Map<String, String> getBcc();

}
