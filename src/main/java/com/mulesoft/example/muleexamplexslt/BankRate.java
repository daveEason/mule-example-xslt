package com.mulesoft.example.muleexamplexslt;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 8/26/11
 * Time: 10:42 AM
 * Simple BankRate object
 */
@XmlRootElement
public class BankRate {

    public double rate;
    public String bankName;

    public BankRate() {

        //do nothing
    }

    public BankRate(double newRate, String name) {

        setRate(newRate);
        setBankName(name);
    }

    public void setRate(double newRate) {
        this.rate = newRate;
    }

    @XmlTransient
    public double getRate() {
        return rate;
    }

    public void setBankName(String name) {
        this.bankName = name;
    }

    @XmlTransient
    public String getBankName() {
        return this.bankName;
    }
}