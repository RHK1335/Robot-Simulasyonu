package proje;

import java.util.Scanner;

/**
 *
 * @author RHK
 */
public class gezginrobot extends robot {
   private String tür = new String();
   private double gezinmeHızı;
   private int ayakSayısı;
  
    
   

    public String getTür() {
        return tür;
    }

    public void setTür(String tür) {
        this.tür = tür;
    }

    public double getGezinmeHızı() {
        return gezinmeHızı;
    }

    public void setGezinmeHızı(double gezinmeHızı) {
        this.gezinmeHızı = gezinmeHızı;
    }


    public int getAyakSayısı() {
        return ayakSayısı;
    }

    public void setAyakSayısı(int ayakSayısı) {
        this.ayakSayısı = ayakSayısı;
    }
   
   public double engelGecmeSuresi(){
       double süre;
       if(tür.equalsIgnoreCase("paletli"))
       {
           süre=(double)(super.getMotorSayi())*3;
           
       }
       else if(tür.equalsIgnoreCase("tekerli"))
       {
           süre=(double)(super.getMotorSayi())*0.5;
           
       }
        else
       {
           System.out.println("geçemez");
           return -1;
       }  
       return süre;
   }    
}