public class Fornecedor extends Usuario {
    String cnpj;

    @Override
    public void imprimir() {
        System.out.println("-----------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("-----------------------------");
    }
}
