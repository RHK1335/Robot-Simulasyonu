

package proje;



import java.util.Scanner;
import javax.swing.JFrame;


public class Proje  {

    public static void main(String[] args) {
        Scanner yeni = new Scanner(System.in);
        int robotSay,saybuff=0,say=0;
        int i = 0, sayac, sayac2, j = 0,k=0 , gezsay = 0, manisay = 0, hibsay = 0,tashız,yeniyük,x,y,adım=0,hafıza,sabit1=0,sabit2=0;
        double yenihız,sürehes=0,korbuff=0;
        boolean p = true, t = true;
        Integer[][] matris = new Integer[20][20];
        tahta kareh = new tahta();
        
        
                
        JFrame tablo = new JFrame();
        tablo.setSize(1920,1080);
        tablo.add(kareh);
       

        String deneme = new String();
        String kontrol = new String();
        String robotSayc = new String();
        String yön = new String();

        while (t) {
            System.out.println("Tanımlanacak robot türünü giriniz (hibrit=h,gezgin=g,manipülatör=m)(eğer girmiyecekseniz p yazın) =");
            robotSayc = yeni.nextLine();
            if (robotSayc.equalsIgnoreCase("h")) {
                hibsay++;
            } else if (robotSayc.equalsIgnoreCase("g")) {
                gezsay++;
            } else if (robotSayc.equalsIgnoreCase("m")) {
                manisay++;
            } else if (robotSayc.equalsIgnoreCase("p")) {
                t = false;
            }
            else
            {
                System.out.println("yanlış giriş yaptınız tekrar giriş yapınız");
            }
        }
        gezginrobot[] gezginList = new gezginrobot[gezsay];
        manipülatörrobot[] maniList = new manipülatörrobot[manisay];
        
        if (gezsay != 0) {
            
            for (sayac2 = 0; sayac2 < gezsay; sayac2++) {
                
                gezginList[sayac2]=new gezginrobot();
                System.out.println("Gezgin robotun türünü girin(spider,paletli,tekerli) =");
                gezginList[sayac2].setTür(yeni.next());
                System.out.println("Gezgin robotun ayak sayısını girin =");
                gezginList[sayac2].setAyakSayısı(yeni.nextInt());
                System.out.println("Gezgin robotun motor sayısını girin =");
                gezginList[sayac2].setMotorSayi(yeni.nextInt());
                System.out.println("Gezgin robotun taşıyabileceği yük miktarını girin =");
                gezginList[sayac2].setYukMiktarı(yeni.nextInt());
                System.out.println("Gezgin robotun gezinme hızını girin =");
                gezginList[sayac2].setGezinmeHızı(yeni.nextDouble());

                for (sayac = 0; sayac < j; sayac++) {
                    
                    p = true;
                    deneme = gezginList[sayac].getTür();
                    kontrol = gezginList[j].getTür();

                    if (kontrol.equalsIgnoreCase(deneme)) {
                        continue;
                    }

                    if (kontrol.equalsIgnoreCase("tekerli")) {
                        while (p) {
                            if (gezginList[j].getGezinmeHızı() <= gezginList[sayac].getGezinmeHızı()) {
                                System.out.println("tekerli robot diğer türlerden yavaş olamaz tekrar hız değeri giriniz");

                                yenihız = yeni.nextDouble();
                                gezginList[j].setGezinmeHızı(yenihız);

                            } else {
                                p = false;
                            }

                        }

                    } else if (kontrol.equalsIgnoreCase("spider")) {
                        while (p) {
                            if (gezginList[j].getGezinmeHızı() >= gezginList[sayac].getGezinmeHızı()) {
                                System.out.println("spider robot diğer türlerden hızlı olamaz tekrar hız değeri giriniz");

                                yenihız = yeni.nextDouble();
                                gezginList[j].setGezinmeHızı(yenihız);

                            } else {
                                p = false;
                            }

                        }

                    } 
                    else {
                        if (deneme.equalsIgnoreCase("tekerli")) {
                            saybuff=sayac;
                            while (p) {
                                if (gezginList[j].getGezinmeHızı() >= gezginList[saybuff].getGezinmeHızı()) {
                                    System.out.println("paletli robot tekerli robottan hızlı olamaz tekrar hız değeri giriniz");

                                    yenihız = yeni.nextDouble();
                                    gezginList[j].setGezinmeHızı(yenihız);
                                   sayac=-1;
                                } else {
                                    p = false;
                                }
                                

                            }
                        }
                        if (deneme.equalsIgnoreCase("spider")) {
                            saybuff=sayac;
                            while (p) {
                                
                                if (gezginList[j].getGezinmeHızı() <= gezginList[saybuff].getGezinmeHızı()) {
                                    System.out.println("paletli robot spider roobttan yavaş olamaz tekrar hız değeri giriniz");

                                    yenihız = yeni.nextDouble();
                                    gezginList[j].setGezinmeHızı(yenihız);
                                    sayac=-1;
                                } else {
                                    p = false;
                                }
                                
                            }
                        }

                    }

                }
j++;
            }
            
        }
        if(manisay!=0)
        {
                for(sayac2=0;sayac2<manisay;sayac2++)
                {
                
                maniList[sayac2]=new manipülatörrobot();
                System.out.println("manipülatör robotun türünü girin(seri,paralel) =");
                maniList[sayac2].setTür(yeni.next());
                System.out.println("manipülatör robotun kol uzunluğunu girin =");
                maniList[sayac2].setKoluzun(yeni.nextInt());
                System.out.println("manipülatör robotun motor sayısını girin =");
                maniList[sayac2].setMotorSayi(yeni.nextInt());
                System.out.println("manipülatör robotun taşıyacağı yük miktarını girin =");
                maniList[sayac2].setYukMiktarı(yeni.nextInt());
                System.out.println("manipülatör robotun taşıma hızını girin =");
                maniList[sayac2].setTasimahizi(yeni.nextInt());
                System.out.println("manipülatör robotun maximum taşıma yükünü girin =");
                maniList[sayac2].setMaxyük(yeni.nextInt());
                
                for(sayac=0;sayac<k;sayac++)
                {
            
                    p = true;
                    deneme = maniList[sayac].getTür();
                    kontrol = maniList[k].getTür();

                    if (kontrol.equalsIgnoreCase(deneme)) {
                        continue;
                    }
                    if(kontrol.equalsIgnoreCase("seri"))
                    {
                        
                   while (p) {
                            if (maniList[k].getTasimahizi()>= maniList[sayac].getTasimahizi()) {
                                System.out.println("seri robot paralel robottan hızlı olamaz tekrar hız giriniz");

                                tashız = yeni.nextInt();
                                maniList[k].setTasimahizi(tashız);

                            } else {
                                p = false;
                            }

                        }
                   p=true;
                   while (p) {
                            if (maniList[k].getMaxyük()>= maniList[sayac].getMaxyük()) {
                                System.out.println("seri robot paralel robottan fazla taşıyamaz tekrar max yük giriniz");

                                yeniyük = yeni.nextInt();
                                maniList[k].setMaxyük(yeniyük);

                            } else {
                                p = false;
                            }


                        }
                   
                   
                    }
                    if(kontrol.equalsIgnoreCase("paralel"))
                    {
                   while (p) {
                            if (maniList[k].getTasimahizi()<= maniList[sayac].getTasimahizi()) {
                                System.out.println("paralel robot seri robottan yavaş olamaz tekrar hız giriniz");

                                tashız = yeni.nextInt();
                                maniList[k].setTasimahizi(tashız);

                            } else {
                                p = false;
                            }

                        }
                   p=true;
                   while (p) {
                            if (maniList[k].getMaxyük()<= maniList[sayac].getMaxyük()) {
                                System.out.println("paralel robot seri robottan az taşıyamaz tekrar max yük giriniz");

                                yeniyük = yeni.nextInt();
                                maniList[k].setMaxyük(yeniyük);

                            } else {
                                p = false;
                            }


                        }
                   
                    }
                    p=true;
                    while (p) {
                        
                            if (maniList[k].getYukMiktarı()> maniList[k].getMaxyük()) {
                                System.out.println(" robot bu yük miktarını taşıyamaz :/ tekrar yük giriniz");

                                yeniyük = yeni.nextInt();
                                maniList[k].setYukMiktarı(yeniyük);
                                sayac=-1;

                            } else {
                                p = false;
                            }

                             
                        }
                }
                p=true;
                    while (p) {
                        
                            if (maniList[k].getYukMiktarı()> maniList[k].getMaxyük()) {
                                System.out.println(" robot bu yük miktarını taşıyamaz :/ tekrar max yük giriniz");

                                yeniyük = yeni.nextInt();
                                maniList[k].setYukMiktarı(yeniyük);

                            } else {
                                p = false;
                            }

                             
                        }
                
                k++;
                }
        }
        for(sayac=0;sayac<20;sayac++)
        {
            for(sayac2=0;sayac2<20;sayac2++)
            {
                matris[sayac][sayac2]=0;
            }
        }
        
        System.out.println("hangi robot türünü seçmek istediğinizi yazınız(hibrit=h,gezgin=g,manipülatör=m)=");
        robotSayc=yeni.next();
        
        
        System.out.println("kaç numaralı robotu kullanacaksınız");
        hafıza=yeni.nextInt();
        hafıza--;
       if(robotSayc.equalsIgnoreCase("g"))
       {
           tahta.tür="g";
           
           
        p=true;
        // engel koyma
        
        
        
        
        while(p)
        {        System.out.println("engel koymak istiyorsanız 1 yazın istemiyorsanız 0 yazın");
                 if(yeni.nextInt()!=1)
                     break;
                 
                 System.out.println("engel koymak istediğiniz kordinatları giriniz");
                 System.out.println("x = ");
                 x=yeni.nextInt()-1;
                 if(x>=20 || x<0)
           {
               System.out.println("x'i tekrar giriniz= ");
           x=yeni.nextInt()-1;
           }
                 System.out.println("y = ");
                 y=yeni.nextInt()-1;
                            
           
        
           if(y>=20 || y<0)
           {
               System.out.println("y'yi tekrar giriniz= ");
           y=yeni.nextInt()-1;
           }      

                 matris[x][y]=1;
                 tahta.engelx[say]=x;
                 tahta.engely[say]=y;
                 tahta.sayı=say;
                 tablo.setContentPane(kareh);
                 
                 say++;
                 
                 
                 
                 
                 
                  
        }
        
        
        p=true;
       System.out.println("robotu yerleştirmek istediğiniz kordinatları giriniz");
           System.out.println("x'i giriniz= ");
           
           x=yeni.nextInt()-1;
           if(x>=20 || x<0)
           {
               System.out.println("x'i tekrar giriniz= ");
           x=yeni.nextInt()-1;
           }
           
           System.out.println("y'yi  giriniz= ");
           y=yeni.nextInt()-1;
           if(y>=20 || y<0)
           {
               System.out.println("y'yi tekrar giriniz= ");
           y=yeni.nextInt()-1;
           }
           tahta.robotx=x;
           tahta.roboty=y;
           tablo.setVisible(true);
           
        
        while(p)
        {  
            System.out.println("robotu yürütmek istiyorsanız 1 e basın istemiyorsanız 0 a basın");
            if(yeni.nextInt()!=1)
            {
                System.out.println("geçen süre"+sürehes);
                 break;
            }
                    
        System.out.println("yön seçin ");
        yön=yeni.next();
        System.out.println("adım sayısını giriniz");
        adım=yeni.nextInt();
        if(gezginList[hafıza].getTür().equalsIgnoreCase("spider"))
        {
        if(yön.equalsIgnoreCase("sag"))
        {
            
            for(sayac=0;sayac<adım;sayac++)
            {
                if(x<19)
                {
                    
                     
                    if(matris[x+1][y]!=1)
                    {
                    x++;
                       sürehes=10d/gezginList[hafıza].getGezinmeHızı()+sürehes;
                    }
                    else
                    {
                        System.out.println("engel var ilerlenemez ");
                        break;
                    }
                }
                else
                {
                    System.out.println("mazgaldan çıkılıyor dikkat ");
                    break;
                }
            }
        }
        if(yön.equalsIgnoreCase("sol"))
        {
            for(sayac=0;sayac<adım;sayac++)
            {
                if(x>0)
                {
                    if(matris[x-1][y]!=1)
                    {
                    x--;
                    sürehes=10d/gezginList[hafıza].getGezinmeHızı()+sürehes;
                    }
                    else
                    {
                        System.out.println("engel var ilerlenemez ");
                        break;
                    }
                }
                else
                {
                    System.out.println("mazgaldan çıkılıyor dikkat ");
                    break;
                }
            }
        }
        if(yön.equalsIgnoreCase("geri"))
        {
            for(sayac=0;sayac<adım;sayac++)
            {
                if(y>0)
                {
                    if(matris[x][y-1]!=1)
                    {
                    y--;
                    sürehes=10d/gezginList[hafıza].getGezinmeHızı()+sürehes;
                    }
                    else
                    {
                        System.out.println("engel var ilerlenemez ");
                        break;
                    }
                }
                else
                {
                    System.out.println("mazgaldan çıkılıyor dikkat  ");
                    break;
                }
            }
        }
        if(yön.equalsIgnoreCase("ileri"))
        {
            for(sayac=0;sayac<adım;sayac++)
            {
                if(y<19)
                {
                    if(matris[x][y+1]!=1)
                    {
                    y++;
                    sürehes=10d/gezginList[hafıza].getGezinmeHızı()+sürehes;
                    }
                    else
                    {
                        System.out.println("engel var ilerlenemez ");
                        break;
                    }
                }
                else
                {
                    System.out.println("mazgaldan çıkılıyor dikkat  ");
                    break;
                }
            }
        }
            System.out.println("robot en son bu kordinatlardaydı "+(x+1)+" "+(y+1));
        
        tahta.robotx=x;
        tahta.roboty=y;
        tablo.setContentPane(kareh);
        tablo.setVisible(true);
            
                }
        else
        {
            if(yön.equalsIgnoreCase("sag"))
        {
            
            for(sayac=0;sayac<adım;sayac++)
            {
                if(x<19)
                {
                    
                     x++;
                     
                    if(matris[x][y]==1)
                    {
                        System.out.println("engel gecme süresi"+gezginList[hafıza].engelGecmeSuresi());
                    sürehes=gezginList[hafıza].engelGecmeSuresi()+sürehes;
                       
                    }else
                    {
                        sürehes=10d/gezginList[hafıza].getGezinmeHızı()+sürehes;
                    }
                    
                }
                else
                {
                    System.out.println("mazgaldan çıkılıyor dikkat  ");
                    break;
                }
            }
        }
            if(yön.equalsIgnoreCase("sol"))
        {
            for(sayac=0;sayac<adım;sayac++)
            {
                if(x>0)
                {
                    x--;
                    
                    if(matris[x][y]==1)
                    {
                    sürehes=gezginList[hafıza].engelGecmeSuresi()+sürehes;
                    }else
                    {
                        sürehes=10d/gezginList[hafıza].getGezinmeHızı()+sürehes;
                    }
                   
                }
                else
                {
                    System.out.println("mazgaldan çıkılıyor dikkat ");
                    break;
                }
            }
        }
        if(yön.equalsIgnoreCase("geri"))
        {
            for(sayac=0;sayac<adım;sayac++)
            {
                if(y>0)
                {
                    y--;
                    
                    if(matris[x][y]==1)
                    {
                    
                    sürehes=gezginList[hafıza].engelGecmeSuresi()+sürehes;
                    }else
                    {
                        sürehes=10d/gezginList[hafıza].getGezinmeHızı()+sürehes;
                    }
                   
                }
                else
                {
                    System.out.println("mazgaldan çıkılıyor dikkat  ");
                    break;
                }
            }
        }
        if(yön.equalsIgnoreCase("ileri"))
        {
            for(sayac=0;sayac<adım;sayac++)
            {
                if(y<19)
                {
                     y++;
                    
                    if(matris[x][y]==1)
                    {
                   
                    sürehes=gezginList[hafıza].engelGecmeSuresi()+sürehes;
                    }else
                    {
                        sürehes=10d/gezginList[hafıza].getGezinmeHızı()+sürehes;
                    }
                    
                }
                else
                {
                    System.out.println("mazgaldan çıkılıyor dikkat  ");
                    break;
                }
            }
        }
        System.out.println("robot en son bu kordinatlardaydı "+(x+1)+" "+(y+1));
        tahta.robotx=x;
        tahta.roboty=y;
        tablo.setContentPane(kareh);
        tablo.setVisible(true);
        
        }
        
        }
        
       }
       else if(robotSayc.equalsIgnoreCase("m"))
       {   tahta.tür="m";
           System.out.println("robotu yerleştirmek istediğiniz kordinatları giriniz");
           System.out.println("x'i giriniz= ");
           
           x=yeni.nextInt()-1;
           if(x>=20 || x<0)
           {
               System.out.println("x'i tekrar giriniz= ");
           x=yeni.nextInt()-1;
           }
           
           System.out.println("y'yi  giriniz= ");
           y=yeni.nextInt()-1;
           if(y>=20 || y<0)
           {
               System.out.println("y'yi tekrar giriniz= ");
           y=yeni.nextInt()-1;
           }
           tahta.robotx=x;
           tahta.roboty=y;
           sabit1=x;
           sabit2=y;
           p=true;
           while(p)
        {  
            System.out.println("yükü taşımak istiyorsanız 1 e basın istemiyorsanız 0 a basın");
            if(yeni.nextInt()!=1)
            {
                System.out.println("geçen süre"+sürehes);
                 break;
            }
                 
        System.out.println("yön seçin ");
        yön=yeni.next();
        System.out.println("adım sayısını giriniz");
        adım=yeni.nextInt();
           if(yön.equalsIgnoreCase("sag"))
        {
            
            for(sayac=0;sayac<adım;sayac++)
            {
                if(x<19)
                {                     
                    if((sabit1+maniList[hafıza].getKoluzun())<=x)
                    {
                        System.out.println("verilen kol uzunluğu yetersiz");
                        break;
                    }
                    sürehes=10d/maniList[hafıza].getTasimahizi()+sürehes;
                    x++;
                   
                }
                else
                {
                    System.out.println("mazgaldan çıkılıyor dikkat şuan yük burada ");
                    break;
                }
            }
        }
           if(yön.equalsIgnoreCase("sol"))
        {
            for(sayac=0;sayac<adım;sayac++)
            {
                if(x>0)
                {
                    
                    if((sabit1-maniList[hafıza].getKoluzun()>=x))
                    {
                    System.out.println("verilen kol uzunluğu yetersiz");
                        break;
                    }
                    sürehes=10d/maniList[hafıza].getTasimahizi()+sürehes;
                    x--;
                   
                }
                else
                {
                    System.out.println("mazgaldan çıkılıyor dikkat şuan yük burada");
                    break;
                }
            }
        }
           if(yön.equalsIgnoreCase("geri"))
        {
            for(sayac=0;sayac<adım;sayac++)
            {
                if(y>0)
                {
                    if((sabit2-maniList[hafıza].getKoluzun()>=y))
                    {
                    System.out.println("verilen kol uzunluğu yetersiz");
                        break;
                    }
                    sürehes=10d/maniList[hafıza].getTasimahizi()+sürehes;
                    y--;
                   
                }
                else
                {
                    System.out.println("mazgaldan çıkılıyor dikkat şuan yük burada ");
                    break;
                }
            }
        }
        if(yön.equalsIgnoreCase("ileri"))
        {
            for(sayac=0;sayac<adım;sayac++)
            {
                if(y<19)
                {
                    if((sabit2+maniList[hafıza].getKoluzun())<=y)
                    {
                        System.out.println("verilen kol uzunluğu yetersiz");
                        break;
                    }
                    sürehes=10d/maniList[hafıza].getTasimahizi()+sürehes;
                    y++;
                }
                else
                {
                    System.out.println("mazgaldan çıkılıyor dikkat şuan yük burada ");
                    break;
                }
            }
        }
        System.out.println("yük en son bu kordinatlardaydı "+(x+1)+" "+(y+1));
        tahta.yükx=x;
        tahta.yüky=y;
        tablo.setContentPane(kareh);
        tablo.setVisible(true);
        }
       }
    }
}