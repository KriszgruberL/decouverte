package be.technifutur.decouverte.poo.scenario4;

// personnage abstract
//    - nom : string;
//
//    Personnage (nom String);
//    getName() : String;
//    getCamp() : String "abstract";
//    Combattre() "abstract;"

public abstract class Personnage {
    private String nom;

    public Personnage(String nom){
        this.nom = nom;
    }

    public String getName(){
        return this.nom;
    }

    public abstract String getCamp();

    public abstract void combattre();
    }


