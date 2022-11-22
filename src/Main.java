import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static ArrayList<Produto> produtos = new ArrayList<Produto>();
    static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    static ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente();
        cliente.set("Pedro", 23);
        menu();
    }

    public static void menu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite a opção desejada:");

        System.out.println(" 1 - Cadastrar");
        System.out.println(" 2 - Imprimir");

        Integer option = Integer.parseInt(reader.readLine());

        switch (option) {
            case 1:
                menuCadastro();
                break;
            case 2:
                menuImprimir();
                break;
        }
    }

    public static void menuCadastro() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite a opção desejada:");

        System.out.println(" 1 - Cadastro de cliente");
        System.out.println(" 2 - Cadastro de funcionário");
        System.out.println(" 3 - Cadastro de fornecedor");
        System.out.println(" 4 - Cadastro de produto");
        Integer option = Integer.parseInt(reader.readLine());

        switch (option) {
            case 1:
                cadastroCliente();
                break;
            case 2:
                cadastroFuncionario();
                break;
            case 3:
                cadastroFornecedor();
                break;
            case 4:
                cadastroProduto();
                break;
        }
    }

    public static void menuImprimir() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite a opção que deseja imprimir:");

        System.out.println(" 1 - Clientes");
        System.out.println(" 2 - Funcionários");
        System.out.println(" 3 - Fornecedores");
        System.out.println(" 4 - Produtos");

        Integer option = Integer.parseInt(reader.readLine());

        switch (option) {
            case 1:
                for(Cliente i: clientes) {
                    i.imprimir();
                }
                break;
            case 2:
                for(Funcionario i: funcionarios) {
                    i.imprimir();
                }
                break;
            case 3:
                for(Fornecedor i: fornecedores) {
                    i.imprimir();
                }
                break;
            case 4:
                for(Produto i: produtos) {
                    i.imprimir();
                }
                System.out.println(produtos);
                break;
        }
        menu();
    }
    public static void cadastroCliente() throws IOException {
        Cliente cliente = new Cliente();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Digite o nome do cliente:");
        String name = reader.readLine();

        System.out.printf("Digite a idade do cliente:");
        Integer idade = Integer.parseInt(reader.readLine());

        cliente.nome = name;
        cliente.idade = idade;

        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso");
        menu();
    }

    public static void cadastroFuncionario() throws IOException {
        Funcionario funcionario = new Funcionario();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Digite o nome do funcionário:");
        String name = reader.readLine();

        System.out.printf("Digite a idade do funcionário:");
        Integer idade = Integer.parseInt(reader.readLine());

        funcionario.nome = name;
        funcionario.idade = idade;
        funcionarios.add(funcionario);

        System.out.println("Funcionário cadastrado com sucesso");
        menu();
    }

    public static void cadastroProduto() throws IOException {
        Produto produto = new Produto();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("Digite o nome do produto:");
        String name = reader.readLine();

        System.out.printf("Digite o valor do produto:");
        Double value = Double.parseDouble(reader.readLine());

        produto.nome = name;
        produto.valor = value;
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso");
        menu();
    }

    public static void cadastroFornecedor() throws IOException {
        Fornecedor fornecedor = new Fornecedor();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("Digite o nome do fornecedor:");
        String name = reader.readLine();

        System.out.printf("Digite o cnpj do fornecedor:");
        String cnpj = reader.readLine();

        fornecedor.nome = name;
        fornecedor.cnpj = cnpj;
        fornecedores.add(fornecedor);
        menu();
    }
}