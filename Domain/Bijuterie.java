package Domain;

import java.util.ArrayList;
import java.util.Objects;

public class Bijuterie {
    private String denumire;
    private String tip;
    private int stocInitial;
    private int vandute;
    private int pret;

    public Bijuterie(){       //constructor implicit
        denumire="";
        tip="";
        stocInitial=0;
        vandute=0;
        pret=0;
    }

    public Bijuterie(String denumire,String tip, int stocInitial, int vandute, int pret){       //constructor cu parametri
        this.denumire=denumire;
        this.tip=tip;
        this.stocInitial=stocInitial;
        this.vandute=vandute;
        this.pret=pret;
    }


    public Bijuterie(Bijuterie g){      //construcotr de copiere
        denumire=g.getDenumire();
        tip=g.getTip();
        this.stocInitial=g.getStocInitial();
        this.vandute=g.getVandute();
        this.pret=g.getPret();
    }

    public void setBijuterie(Bijuterie g){
        denumire=g.getDenumire();
        tip=g.getTip();
        this.stocInitial=g.getStocInitial();
        this.vandute=g.getVandute();
        this.pret=g.getPret();
    }
    public String getDenumire() {       //returneaza denumirea
        return denumire;
    }

    public String getTip(){
        return tip;
    }

    public int getStocInitial() {
        return stocInitial;
    }

    public int getVandute() {
        return vandute;
    }

    public int getPret() {
        return pret;
    }


    public void setDenumire(String denumire) {      //modifica denumirele genului
        this.denumire = denumire;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setStocInitial(int stocInitial){
        this.stocInitial=stocInitial;
   }

    public void setVandute(int vandute) {
        this.vandute = vandute;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Bijuterie{" +
                "denumire='" + denumire + '\'' +
                ", stocInitial=" + stocInitial +
                ", vandute=" + vandute +
                ", pret=" + pret +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bijuterie)) return false;
        Bijuterie bijuterie = (Bijuterie) o;
        return getStocInitial() == bijuterie.getStocInitial() &&
                getVandute() == bijuterie.getVandute() &&
                getPret() == bijuterie.getPret() &&
                Objects.equals(getDenumire(), bijuterie.getDenumire());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDenumire(), getStocInitial(), getVandute(), getPret());
    }
}

