package com.example.restservice;

import java.util.List;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Token;
import com.twilio.type.IceServer;

public class TwilioHandler 
{
	public static final String ACCOUNT_SID = "XXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "XXXXXXXXXXXXX";
    
	private List<IceServer> iceServers;
    
	public void doIceServerRetrieve()
	{
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Token token = Token.creator().setTtl(3600).create();
        this.iceServers = token.getIceServers();
	}
	/**
	 * Gets/sets
	 */
	public List<IceServer> getIceServers() {
		return iceServers;
	}
	public void setIceServers(List<IceServer> iceServers) {
		this.iceServers = iceServers;
	}
}
