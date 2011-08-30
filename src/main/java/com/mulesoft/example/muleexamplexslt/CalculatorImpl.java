package com.mulesoft.example.muleexamplexslt;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.rmi.RemoteException;
import java.text.DecimalFormat;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 8/26/11
 * Time: 10:53 AM
 * Simple example module to demonstrate REST and XSLT
 */
@Path("/Calculator")
public class CalculatorImpl implements ICalculator{

    @GET
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_XML)
	@Path("/GetTestHTML")
	public String getTestHTML() {
		StringBuffer result = new StringBuffer("<html><head><Title>Test HTML</Title></head>");
		result.append("<br/>");
		result.append("<body>This is a test for html content</body></html>");
		return result.toString();
	}

    @Override
    @GET
    @Path("/GetBankRateXML")
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_XML)
    public BankRate getCurrentBankRateXML(@QueryParam("bankName") String bankName) throws RemoteException {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        float rate = (float) ((Math.random() * 4) + 2);
        BankRate bankRate = new BankRate((Double.valueOf(twoDForm.format(rate))),bankName);
        return bankRate;

    }

    @Override
    @GET
    @Path("/GetBankRateHTML")
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_HTML)
    public BankRate getCurrentBankRateHTML(@QueryParam("bankName") String bankName) throws RemoteException {
        float rate = (float) ((Math.random() * 4) + 2);
        BankRate bankRate = new BankRate(rate, bankName);
        return bankRate;
    }
}