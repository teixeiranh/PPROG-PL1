// 2)
public class Pessoa {

    private String name;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String name) {
        this.name = name;
    }

    public Pessoa(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String toStringName() {
        return String.format("O nome é " + this.name);
    }

    public String toStringNameAndAge() {
        return String.format(this.name + " tem "+this.idade+" anos.");
    }

}
