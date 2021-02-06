package View;

public class CapTabel {
    public static void linii(int nr, String s) {
        for (int i=0;i<nr;i++)
            System.out.print(s);
        System.out.println();
    }
    public CapTabel() {     //constructor implicit
    }

    public static void capTabel1() {        //capul de tabel pentru tabelul care afiseaza procentul de lungime
        String sir = "| Denumire      | Tip           | Disponibile  | PretUnit   | ValoareDisponibile |";
        linii(sir.length(),"=");
        System.out.println(sir);
        linii(sir.length(),"=");
    }

    public static void capTabel2() {        //capul de tabel pentru tabelul care afiseaza procentul de lungime
        String sir = "| Denumire      | Tip           | StocInit | Vandute    | PretUnit    | ValoareDisponibile|";
        linii(sir.length(),"=");
        System.out.println(sir);
        linii(sir.length(),"=");
    }
}