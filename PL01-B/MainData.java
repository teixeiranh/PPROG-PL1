public class MainData {

    public static void main(String[] args) {
        // a)
        Data data1 = new Data(2022, 3, 8);
        // b)
        System.out.println(data1.toString());
        // c)
        Data data2 = new Data(1974, 4, 25);
        // d)
        System.out.println(data2.toAnoMesDiaString());
        // e)
        if (data1.isMaior(data2)) {System.out.println("é maior");}
        // f)
        int dias1 = 0;
        dias1 = data1.calcularDiferenca(data2);
        System.out.println(dias1);
        // g)
        int dias2 = 0;
        dias2 = data1.calcularDiferenca(2022, 12, 25);
        System.out.println(dias2);
        // h)
        System.out.println(data2.determinarDiaDaSemana());
        // i)
        System.out.println(Data.isAnoBissexto(data2.getAno()));
        System.out.println(Data.isAnoBissexto(1974));
    }
}
