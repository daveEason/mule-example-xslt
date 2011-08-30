package com.mulesoft.example.muleexamplexslt;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.rmi.RemoteException;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 8/26/11
 * Time: 10:46 AM
 *
 * ICalculator interface
 */
public interface ICalculator {

    /**
     * @return String
     * @throws java.rmi.RemoteException
     */

    @GET
    @Path("/GetBankRateXML")
    @Consumes(MediaType.TEXT_HTML)
    @Produces("text/xml")
    public BankRate getCurrentBankRateXML(String bankName) throws RemoteException;

    /**
     * @return String
     * @throws java.rmi.RemoteException
     */
    @GET
    @Path("/GetBankRateHTML")
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_HTML)
    public BankRate getCurrentBankRateHTML(String bankName) throws RemoteException;
}
