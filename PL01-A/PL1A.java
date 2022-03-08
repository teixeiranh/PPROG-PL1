import java.util.Scanner;

public class PL1A {
    public static void main(String[] args) {
        // 1)
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = in.next();

        System.out.println("Olá " + nome);
        //in.close();
        // 2)
        Scanner in2 = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        System.out.println("Qual o seu nome?");
        pessoa1.setName(in2.next());

        System.out.println("Olá " + pessoa1.getName());

        // 3)
        Scanner in3 = new Scanner(System.in);
        Pessoa pessoa2 = new Pessoa();
        System.out.println("Qual o seu nome?");
        pessoa2.setName(in3.next());
        System.out.println("Qual a sua idade?");
        pessoa2.setIdade(in3.nextInt());

        System.out.println(pessoa2.toStringNameAndAge());




    }
}
