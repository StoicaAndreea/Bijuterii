package Repository;

import Domain.Bijuterie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Repository {
    private ArrayList<Bijuterie> objects;

    public Repository() {      //constructor implicit
        objects = new ArrayList<>();
    }

    public Repository(ArrayList<Bijuterie> objects) {      //constructor cu parametru
        this.objects = new ArrayList<>(objects);
    }

    public Repository(Repository repo) {       //constructor de copiere
        this.objects = new ArrayList<Bijuterie>(repo.getObjects());
    }

    public ArrayList<Bijuterie> getObjects() {     //returneaza lista de objects
        return objects;
    }

    public Bijuterie getBijuterie(int i) {       //returneaza un obiect in functie de index
        return objects.get(i);
    }

    public int getLungime() {        //cate objects avem in repo
        return objects.size();
    }

    public void setObjects(ArrayList<Bijuterie> c) {       //modifica lista de obiecte
        objects = c;
    }

    public void setBijuterie(int i, Bijuterie c) {        //modifica un obiect
        objects.set(i, c);
    }

    public void add(Bijuterie c) {       //adauga un obiect in lista
        objects.add(c);
    }

    public void delete(int i) {      //sterge un obiect
        objects.remove(i);
    }

    public void update(int i, Bijuterie c) {     //modifica un obiect
        setBijuterie(i, c);
    }

    public void clearEl() {      //sterge tot
        objects.clear();
    }

    public int contains(Bijuterie c) {
        for (int i = 0; i < objects.size(); i++)
            if (getBijuterie(i).equals(c)) {
                return i;
            }
        return -1;
    }

    public void citireDinFisier() {     //functie care realizeaza citirea din fisier
        this.clearEl();
        try {
            BufferedReader fisIn = new BufferedReader(new FileReader("C:\\Users\\Andreea\\IdeaProjects\\Examen\\src\\InFis"));
            String s; //= fisIn.readLine();

            for (int i = 0; (s = fisIn.readLine()) != null; ++i) {
                String[] felii = s.split(",");
                String denumire = felii[0];
                String tip = felii[1];
                int stocInitial = Integer.parseInt(felii[2]);
                int vandute = Integer.parseInt(felii[3]);
                int pret = Integer.parseInt(felii[4]);
                Bijuterie c = new Bijuterie(denumire, tip, stocInitial, vandute, pret);
                this.add(c);
            }
            fisIn.close();
        } catch (Exception var9) {
            System.out.println(var9.getMessage());
            var9.printStackTrace();
        }
    }
}
