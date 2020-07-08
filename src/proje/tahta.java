package proje;

import java.awt.*;
import javax.swing.*;

public class tahta extends JPanel {

    public static Integer[] engelx = new Integer[10];
    public static Integer[] engely = new Integer[10];
    public static int robotx = 0;
    public static int roboty = 0;
    public static int yükx=0;
    public static int yüky=0;
    public static int sayı;
    private static int sayac = 0;
    public static String tür;

    @Override
    public void paintComponent(Graphics kare) {
        super.paintComponent(kare);
        int i, j, sayy = 0;
        int x, y;
        if (tür.equalsIgnoreCase("g")) {
            kare.setColor(Color.BLUE);
            kare.fillOval(robotx * 50, roboty * 50, 50, 50);
            kare.setColor(Color.BLACK);
            for (i = 0; i < 20; i++) {
                for (j = 0; j < 20; j++) {

                    kare.drawRect(i * 50, j * 50, 50, 50);

                }

            }
            kare.setColor(Color.RED);
            for (sayy = 0; sayy <= sayı; sayy++) {
                x = tahta.engelx[sayy];
                y = tahta.engely[sayy];
                kare.fillRect(x * 50, y * 50, 50, 50);

            }
           
            sayac++;
        } else if (tür.equalsIgnoreCase("m")) {
            kare.setColor(Color.BLACK);
            for (i = 0; i < 20; i++) {
                for (j = 0; j < 20; j++) {

                    kare.drawRect(i * 50, j * 50, 50, 50);

                }

            }
            
            kare.setColor(Color.YELLOW);
            kare.fillRect(50*yükx,50*yüky, 50, 50);
            kare.setColor(Color.BLUE);
            kare.fillOval(robotx * 50, roboty * 50, 50, 50);
            
        }

    }

}