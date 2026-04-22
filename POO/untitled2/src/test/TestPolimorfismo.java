package test;

import clases.polimorismo.*;

public class TestPolimorfismo {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Moto moto = new Moto();
        Trole trole  = new Trole(); // alcanza todos los métodos de la clase
        Furgoneta furgoneta = new Furgoneta();

        InterfaceAuto objeto = new Trole(); // alcanza sólo los métodos de la interfaz

        // imprimrir
//        System.out.println(auto.devolverNumLlantas());
//        System.out.println(moto.devolverNumLlantas());
//        System.out.println(trole.devolverNumLlantas());
//        System.out.println(furgoneta.devolverNumLlantas());
//        System.out.println(auto.devolverNumAsientos());
        System.out.println(objeto.devolverNumLlantas());
        System.out.println(objeto.devolverNumAsientos());
        System.out.println(trole.devolverNumLlantas());
    }
}
