package View;

import Domain.Bijuterie;

import java.util.ArrayList;

public class Rapoarte {

    public static void Tabel(ArrayList<Bijuterie> b) {
        System.out.println("Tabel afisat la cumparator:");
        CapTabel.capTabel2();
        int suma=0;
        for(int i=0;i<b.size(); i++) {
            int disp=b.get(i).getStocInitial()-b.get(i).getVandute();
            int pret   =b.get(i).getPret();
            int valDisp =disp*pret;
            suma+=valDisp;
            System.out.format("|%-15s|%-15s|%10d|%12d|%13d|%19d|\n",
                    b.get(i).getDenumire(),b.get(i).getTip(),b.get(i).getStocInitial(),b.get(i).getVandute(),
                    pret,valDisp);
        }
        CapTabel.linii(91,"=");
        System.out.println("\t\t\t\t\tTotal disponibile valoric:"+suma);
    }

    public static void Tabel2(ArrayList<Bijuterie> b) {
        System.out.println("Marfa vanduta sub 50% din StocInit");
        CapTabel.capTabel2();
        int suma=0;
        for(int i=0;i<b.size(); i++) {
            float proc=(float)50;
            proc=proc/100;
            proc=proc*b.get(i).getStocInitial();
            if(b.get(i).getVandute()<proc) {
                int vandute=b.get(i).getVandute();
                int pret   =b.get(i).getPret();
                int valVand  =vandute*pret;
                suma+=valVand;
                System.out.format("|%-15s|%-15s|%10d|%12d|%13d|%19d|\n",
                        b.get(i).getDenumire(),b.get(i).getTip(),b.get(i).getStocInitial(),
                        vandute,pret,valVand);
            }
        }
        CapTabel.linii(91,"=");
        System.out.println("\t\t\t\t\tTotal vandute valoric:"+suma);
    }

    public static void Tabel1(ArrayList<Bijuterie> b) {
        System.out.println("Tabel afisat la cumparator:");
        CapTabel.capTabel1();
        int suma=0;
        for(int i=0;i<b.size(); i++) {
            int disp=b.get(i).getStocInitial()-b.get(i).getVandute();
;
            if(disp>0) {
                int pret   =b.get(i).getPret();
                int valDisp =disp*pret;
                suma+=valDisp;
                System.out.format("|%-15s|%-15s|%14d|%12d|%20d|\n",
                        b.get(i).getDenumire(),b.get(i).getTip(),disp,
                        pret,valDisp);
            }
        }
        CapTabel.linii(82,"=");
        System.out.println("\t\t\t\t\tTotal disponibile valoric:"+suma);
    }
}
