package Test;

import game.Balla;

class Test {

    public static void main(String[] args) {

        Balla b1 = Balla.getBalla();
        b1.nama = "Tutu";
        b1.burnawa();

        Balla b2 = Balla.getBalla();
        b2.nama = "Lulu";
        b2.burnawa();

    }

}
