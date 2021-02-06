package Service;

import Domain.Bijuterie;
import Repository.Repository;
import View.Rapoarte;
import java.util.ArrayList;
import java.util.Objects;

public class Service {
    private Repository repo;


    public Service(){      //constructor implicit
        repo=new Repository();
    }

    public Service(Repository r){     //constructor cu parametru
        repo=r;

        r.citireDinFisier();
    }

    public int add(Bijuterie c){        //adauga un obiect
        if(repo.contains(c) != -1) return -1;
        repo.add(c);
        return 0;
    }


    public ArrayList<Bijuterie> tot(){      //returneaza lista de carti
        return repo.getObjects();
    }

    public void afisTot(){
        Rapoarte.Tabel(repo.getObjects());
    }

    public void afis1(){
        Rapoarte.Tabel1(repo.getObjects());
    }
    public void afis2(){
        Rapoarte.Tabel2(repo.getObjects());
    }
}
