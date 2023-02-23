package be.technifutur.decouverte.primitif;

public class Decouverte {
    public static void main(String[] args){
        // boolean
        testboolean();
        // entier signé
        testByte();
        testShort();
        testInteger();
        testLong();
        // caractères
        testChar();
        // numérique flottant
        testFloat();
        testDouble();
    }

    private static void testDouble() {
        double test= 5.3;
        System.out.println("to " + test / 0 + " and beyond");
        System.out.println("division par 0 " + (0.0/0.0));
        System.out.println((test/0)/2);

        test = Long.MAX_VALUE;

//        for (int i = 0; i < 200; i++) {
//            test -= 1000;
//            long l = (long)test;
//            System.out.printf("double : %s long : %s %n", test,l);
//        }
    }

    private static void testFloat() {
        float test = 5.3f;
    }

    private static void testChar() {
        char car = 'r';             //peut être considerer comme un entier en 16 bit
        char car2 = 'a';
        int res = car + car2;
        System.out.println(res);    //resultat 211 aka la valeur ASCII de r et a additionnée
        car = '\n';                 //carriage return, passe à la ligne

    }

    private static void testLong() {
        long test = Long.MAX_VALUE; // millard de millard
        test = 9_223_372_036_854_775_807L;
        int val = 5;
        test = test - val; //long - int => long - long
    }

    private static void testInteger() {
        // -2.000.000.000 à 2.000.000.000
        int test = Integer.MIN_VALUE;
        //int test_ = Integer.MAX_VALUE;
        int test2 = 3; // 3 est un int

        //Opérateurs
        test = test / test2; //div
        // / est un div quand les deux opérantes sont des entiers
        test = test % test2; // modulo
        test %= test2;


        //écriture en binaire
        test = 0b00110; // 6
        System.out.println("0b00110 = "+ test ); // 6
        System.out.println("test & test2 " + (test & test2)); // 2                                                      car 00110 & 00010 = 00010
        System.out.println("test | test2 " + (test | test2)); // 7 | = or                                               car 00110 & 00010 = 00111
        System.out.println("test ^ test2 " + (test ^ test2)); // 5 // xor                                               car 00110 & 00010 = 00101
        System.out.println("~test +1 =" + (~test + 1 ));// -6 fait le complément (change les 1 en 0 et inversement)     car ~00110 = 11001

        System.out.println("test << 2 = " + (test << 2)); // 24 (décalage de bits vers la gauche)                       car 00110 = 11000
        System.out.println("test >> 2 = " + (test >> 2)); // 1 (décalage de bits vers la droite) // propage le bit de signe car 00110 = 00001
        System.out.println("test >>> 2 = " + (test >>> 2)); //

        test = -6;
        System.out.println("test << 2 = " + (test << 2)); // -24 (décalage de bits vers la gauche)
        System.out.println("test >> 2 = " + (test >> 2)); // -2 (décalage de bits vers la droite) // propage le bit de signe
        System.out.println("test >>> 2 = " + (test >>> 2)); // 1073741822 // ne propage pas le bit de signe

        System.out.println(Integer.toBinaryString(test));

        Integer.bitCount(test);
    }

    private static void testShort() {
        //same that byte
        // limite -32768 to 32767 // -30.000 a 30.000
        short test = -32000;
        short test1 = Short.MIN_VALUE;
        short test3 = Short.MAX_VALUE;

        //Opérateurs
        short test2 = 2;
        int i = test2;
        //test = i;
        test1 = (short) i; //force l'écriture du int en short
        test1 = (short) (test1 + test2);
        test1 += test2; // test1 = (short) (test1 + test2);
    }

    private static void testByte() {
        //limite -100 à + 100
        byte test = -128;
        byte test4 = Byte.MIN_VALUE;
        byte test5 = Byte.MAX_VALUE;

        //Opérateurs
        byte test2 = 2;
        int i = test2;
        // test = i;
        test4 = (byte)i; //force l'écriture du int en byte
        test4 = (byte) (test4 + test2);
        test4 += test2; // test = (byte) (test + test2);
    }

    private static void testboolean() {
        boolean test = true;
        boolean test2 = false;
        test = false;
        // impossible de transformer un boolean en un autre type
        // int i = test;
        // int i = (int)test;
        // test = 0;

        //Opérateurs
        test = ! test; // not
        test = test & test2; // et évaluation longue
        test = test && test2; // et évaluation courte
        test = test | test2; // ou évaluation longue
        test = test || test2; // ou évaluation courte
        test = test ^ test2; // xor

        //Opérateurs d'assignation
        test &= test2; // test = test & test2;
        test |= test2; // test = test | test2;
        test ^= test2; // test = test ^ test2;

        Boolean object = Boolean.TRUE;
        test = object; // auto unboxing
        test = object.booleanValue(); // vieille méthode pour l'unboxing

        object = test; // autoboxing
        object = Boolean.valueOf(test); // boxing

        if (test == false){
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        test2 = test = true;
        test2 = test = (5+4 > 7);
    }


}
