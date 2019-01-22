import java.security.Provider;
import java.util.Random;
import java.util.Scanner;
public class SecureRandom{

//**************************************************************************************
//** Wykorzystanie biblioteki Random z konstruktorem                                  **
//**************************************************************************************
    //static SecureRandom rand = new SecureRandom(Provider);
    static java.security.SecureRandom rand = new java.security.SecureRandom();
    int nextInt = 1+rand.nextInt(); // musi być nowy konstruktora

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[6];
        //boolean[] test = new boolean[tab.length];
        //    static Random rand = new Random(6);
        int [] multik = new int[10];
        //Scanner in = new Scanner();
        System.out.println("Wylosuję Ci 3 zakłady na dużego lotka");
        int licznik=0;
        for (byte b = 0; b < 3; b++) {
            for (byte a = 0; a < tab.length; a++) {
               /*int spr;
                do
                    spr = rand.nextInt(tab.length);
                while (test[spr]) ;

                    spr = tab[a];
                    //spr[a] = test[spr];
                    test[spr] = true;
                    // while (test[spr]=);*/


                tab[a] = 1+rand.nextInt(49)-1;
                licznik=a-1;


                if ((a>0) && (tab[a] == tab[licznik])) tab[a] = 1+rand.nextInt(49)-1;

                System.out.print(" | " + tab[a]);
            }
            System.out.println();
            // System.out.println("Pewnie się udało");


        }
        System.out.println();
        System.out.println("Pewnie się udało");
        System.out.println();
        System.out.println("Ile losowań multilotka?");
        int z= sc.nextInt();

        for (byte b = 0; b < z; b++) {
            System.out.print("Los nr  |   " + b + "  |  ");
            for (byte a = 0; a < multik.length; a++) {
                multik[a] = 1+rand.nextInt(80);

                if (multik[a] == 0) multik[a] = 1+rand.nextInt(80);

                System.out.print(" | " + multik[a]);

            }
            System.out.println();
        }
    }
}




