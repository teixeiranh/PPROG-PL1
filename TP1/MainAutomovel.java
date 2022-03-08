public class MainAutomovel {
    public static void main(String[] args) {

        // a)
        Automovel a1 = new Automovel("11-11-AA", "Toyota", 1400);

        // b)
        System.out.println(a1.toString());

        // c)
        System.out.println(a1.getMatricula());

        // d)
        System.out.println(Automovel.getTotalAutomoveis());

        // e)
        Automovel a2 = new Automovel("22-22-BB", "Audi");

        // f)
        System.out.println(a2.toString());

        // g)
        a2.setCilindrada(1800);

        // h)
        System.out.println(a2.toString());

        // i)
        System.out.println(Automovel.getTotalAutomoveis());

        // j)
        int dif  = a1.getCilindrada() - a2.getCilindrada();
        System.out.println(Math.abs(dif));

        // k)
        if (dif > 0) {
            System.out.println(a1.getMatricula());
        } else {
            System.out.println(a2.getMatricula());
        }

        // l)
        if (a1.getCilindrada() > 2000) {
            System.out.println("é maior que 2000");
        } else {
            System.out.println("não é maior que 2000");
        }







    }
}
