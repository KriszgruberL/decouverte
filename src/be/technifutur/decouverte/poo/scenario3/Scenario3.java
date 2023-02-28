package be.technifutur.decouverte.poo.scenario3;

public class Scenario3 {
    public static void main(String[] args) {
        Millenium m = new Millenium();
        Xwing x1 = new Xwing(12);
        Xwing x2 = new Xwing(12);
        Lukywa l = new Lukywa("Luky1");

        System.out.println(l.getNom());

        System.out.println(m.getNom());
        System.out.println(x1.getNom());

        m.addMissile(4);

        m.tirer(5);
        m.tirer();
        {System.out.println("-------------");
        l.tirer();
        l.tirer();
        l.tirer();
        l.tirer();
        l.tirer();
        l.tirer();}

        System.out.println(x1);
        System.out.println(x2);
//        be.technifutur.decouverte.poo.scenario3.Xwing@7291c18f // code hexadecimal representant le hashcode de l'objet
//        montre l'état d'un objet

        System.out.println(x1.equals(x2));
    }
}
