package be.technifutur.decouverte.poo.scenario3;

public class EtoileNoire {
    public void attireVaisseau(VaisseauAncetre v){
        if (v instanceof Millenium){
//            attireVaisseau((Millenium) v);
            Millenium m = (Millenium) v;
            attireVaisseau(m);
        } else if (v instanceof Xwing x) {
            attireVaisseau(x);
        } else {
            System.out.println("Vaisseau Mercenaire attiré");
            v.TouchGrass();
            v.afficheCamp();
            v.AirBorn();
        }
    }
    public void attireVaisseau(Millenium m){
        System.out.println(m.getNom()+" attiré");
        m.TouchGrass();
        m.afficheCamp();
        System.out.println("TONIGHT PARTYYYYYYYY !");
        m.tirer(3);
        m.AirBorn();
    }
    public void attireVaisseau(Xwing x){
        System.out.println(x.getNom() +" attiré");
        x.TouchGrass();
        x.afficheCamp();
        System.out.println("Fuck this shit I'm out");
        x.AirBorn();
    }
}
