package klase;

public class AutoGlavni {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Auto a1 = new Auto(1000, 100, 5, "ford", "focus", 20000);
        Auto a2 = new Auto(1200, 120, 4, "yugo", "45", 5000);
        Auto a3 = new Auto(1300, 120, 5, "lada", "niva", 4500);

        System.out.println("Info o automobilu 1 " + a1.getProizvodjac() + " " + a1.getModel() + ", " + a1.getKubikaza()
                + "ccm, " + a1.getKonjaza() + ", " + a1.getBrVrata() + ", " + a1.getCena());
        System.out.println("Info o automobilu 2 " + a2.getProizvodjac() + " " + a2.getModel() + ", " + a2.getKubikaza()
                + "ccm, " + a2.getKonjaza() + ", " + a2.getBrVrata() + ", " + a2.getCena());
        System.out.println("Info o automobilu 3 " + a3.getProizvodjac() + " " + a3.getModel() + ", " + a3.getKubikaza()
                + "ccm, " + a3.getKonjaza() + ", " + a3.getBrVrata() + ", " + a3.getCena());

        a2.setProizvodjac("Zastava");
        a2.setModel("Yugo 45");
        System.out.println("Info o izmenjenom automobilu 2 " + a2.getProizvodjac() + " " + a2.getModel() + ", " + a2.getKubikaza()
                + "ccm, " + a2.getKonjaza() + ", " + a2.getBrVrata() + ", " + a2.getCena());
    }

}


