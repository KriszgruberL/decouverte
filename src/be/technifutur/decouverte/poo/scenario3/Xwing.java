package be.technifutur.decouverte.poo.scenario3;

public class Xwing extends VaisseauAncetre {

    public Xwing(int maxMissile) {
        super(maxMissile, makeName(maxMissile)); //super doit être en première ligne
    }

    private static String makeName(int maxMissile) {
        String name ="X-Wing-";
        int j = 0;
        for (int i = 0; i < maxMissile ; i++) {
            j++;

        }
        name += j;
        return name;
    }
}
