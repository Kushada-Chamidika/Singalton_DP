package game;

public class Balla {

    private Balla() {
    }

    private static Balla b;

    public static synchronized Balla getBalla() {
        if (b == null) {
            b = new Balla();
        }
        return b;
    }

    public String nama;

    public void burnawa() {

        System.out.println(nama + " -> Baw Baw");

    }

}

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
