package UI;
import Domain.Bijuterie;
import Repository.Repository;
import Service.Service;
import View.Rapoarte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UI {
    private Service serv;
    public UI(Service s){serv=s;}       //constructor implicit

    public static int printMenu(){      //function that prints the menu and receives the option
        System.out.println("\n MENU:");
        System.out.println("    1) Toate ");
        System.out.println("    2) Tabel afişat la cumpărător ");
        System.out.println("    3) Tabel cu mărfurile care s-au vandut sub 50% din StocInit");
        System.out.println("    4) Adauga mai multe, separate prin ';'");
        //System.out.println("    7) Modifica");
        //System.out.println("    8) Sterge");
        System.out.println("    0) Exit");
        System.out.print("Optiunea ta:");
        Scanner s=new Scanner(System.in);
        int option;
        try{option=s.nextInt();
            return option;}
        catch(Exception var) {
            System.out.print("Wrong! give integer");
            return printMenu();}
    }

    public int citireInt(){     //reads an integer
        System.out.print("Da un index");
        Scanner s=new Scanner(System.in);
        int option;
        try{option=s.nextInt();
            return option;}
        catch(Exception var) {
            System.out.print("Wrong! give integer");
            return citireInt();
        }
    }
    public Bijuterie citireBijuterie(){     //reads
        try
        {System.out.print("    Da o carte:");
            String input;
            Scanner s=new Scanner(System.in);
            input=s.nextLine();
            String[] list= (input.split(" "));
            String denumire=list[0];
            String tip=list[1];
            int stocInitial=(Integer.parseInt(list[2]));
            int vandute=Integer.parseInt(list[3]);
            int pret=Integer.parseInt(list[4]);
            if(stocInitial>0 && vandute>=0 && pret>0)
                return new Bijuterie(denumire, tip,stocInitial,vandute,pret);
            System.out.println("Aualeuuu, eroareee, nu ai citit bine");
            return citireBijuterie();

        }
        catch(Exception var){System.out.println("Aualeuuu, eroareee, nu ai citit bine");
            return citireBijuterie();
        }
    }

    public ArrayList<Bijuterie> citireBijuterii(){      //reads multiplw books
        ArrayList<Bijuterie>obj=new ArrayList<Bijuterie>();
        try
        {System.out.print("    Da obiectele separate prin ';' , :");
            String input;
            Scanner s=new Scanner(System.in);
            input=s.nextLine();
            String[] o= (input.split(";"));
            for(String ob : o){
                String[] list = (ob.split(","));
                String denumire=list[0];
                String tip=list[1];
                int stocInitial=(Integer.parseInt(list[2]));
                int vandute=Integer.parseInt(list[3]);
                int pret=Integer.parseInt(list[4]);
                if(stocInitial>0 && vandute>=0 && pret>0)
                    obj.add( new Bijuterie(denumire, tip,stocInitial,vandute,pret));

            }
            return obj;
        }
        catch(Exception var){System.out.println("Aualeuuu, eroareee, nu ai citit bine un rau");
            return citireBijuterii();
        }
    }

    public void Main(){     //control
        int opt=printMenu();
        while(opt!=0){
            switch(opt){
                case 1:{
                    serv.afisTot();
                    break;
                }
                case 2: {
                    serv.afis1();
                    break;
                }
                case 3: {
                    serv.afis2();
                    break;
                }
                case 4: {
                    ArrayList<Bijuterie> obj=new ArrayList<Bijuterie>(citireBijuterii());
                    for (Bijuterie c:obj) {
                        if (serv.add(c)==-1) {
                            System.out.println("nu am putut citi " + c.toString());
                            break;
                        }
                    }
                    break;
                }
                default: {System.out.println("wrong option");}
            }
            opt=printMenu();
        }
        System.out.println("bye...");

    }
}


