package Entities;

import Proceed.Giaotiep;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class thuthu implements Serializable,Giaotiep{
    private int matt;
    private String tentt;
    private String diachitt;
    private int sdttt;
     private String emailtt;

    public int getMatt() {
        return matt;
    }

    public void setMatt(int matt) {
        this.matt = matt;
    }

    public String getTentt() {
        return tentt;
    }

    public void setTentt(String tentt) {
        this.tentt = tentt;
    }

    public String getDiachi() {
        return diachitt;
    }

    public void setDiachi(String diachitt) {
        this.diachitt = diachitt;
    }

    public int getSdttt() {
        return sdttt;
    }

    public void setSdttt(int sdttt) {
        this.sdttt = sdttt;
    }

    public String getEmailtt() {
        return emailtt;
    }

    public void setEmailtt(String emailtt) {
        this.emailtt = emailtt;
    }

    @Override
    public Object toObject() {
        return new Object[]{
            this.getMatt(),this.getTentt(),this.getDiachi(), this.getEmailtt(), this.getSdttt()
        };

    }

}