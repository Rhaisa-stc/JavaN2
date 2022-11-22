public class Usuario {
    String nome;
    int idade;

    public static void main(String args[]) { }

    public void set(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimir() {
        System.out.println("-----------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("-----------------------------");
    }
}
