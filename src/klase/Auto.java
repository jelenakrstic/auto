package klase;

public class Auto {

    private int kubikaza;
    private int konjaza;
    private int brVrata;
    private String proizvodjac;
    private String model;
    private double cena;

    public Auto(int kubikaza, int konjaza, int brVrata, String proizvodjac, String model, double cena) {
        this.kubikaza = kubikaza;
        this.konjaza = konjaza;
        this.brVrata = brVrata;
        this.proizvodjac = proizvodjac;
        this.model = model;
        this.cena = cena;
    }

    public Auto() {
        this.kubikaza = 0;
        this.konjaza = 0;
        this.brVrata = 0;
        this.proizvodjac = " ";
        this.model = " ";
        this.cena = 0;
    }

    public Auto(String proizvodjac, String model, double cena) {
        this.proizvodjac = proizvodjac;
        this.model = model;
        this.cena = cena;
        this.kubikaza = 1000;
        this.konjaza = 0;
        this.brVrata = 0;
    }

    public Auto(String model) {
        this.kubikaza = 0;
        this.konjaza = 0;
        this.brVrata = 0;
        this.proizvodjac = " ";
        this.model = model;
        this.cena = 0;
    }

    public Auto(String model, String proizvodjac) {
        this.kubikaza = 0;
        this.konjaza = 0;
        this.brVrata = 0;
        this.proizvodjac = proizvodjac;
        this.model = model;
        this.cena = 0;
    }

    public int getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(int kubikaza) {
        this.kubikaza = kubikaza;
    }

    public int getKonjaza() {
        return konjaza;
    }

    public void setKonjaza(int konjaza) {
        this.konjaza = konjaza;
    }

    public int getBrVrata() {
        return brVrata;
    }

    public void setBrVrata(int brVrata) {
        this.brVrata = brVrata;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }


}


