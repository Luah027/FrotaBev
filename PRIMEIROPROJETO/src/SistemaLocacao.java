import java.util.ArrayList;
import java.util.List;

class Cliente {
    String nome;
    @SuppressWarnings("unused")
    private String endereco;
    @SuppressWarnings("unused")
    private String email;

    public Cliente(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public void solicitarLocacao(String tipoCarro) {
        // Lógica para solicitar locação de carro
        System.out.println(nome + " solicitou a locação de um carro do tipo: " + tipoCarro);
    }

    public void consultarLocacao() {
        // Lógica para consultar locações ativas
        System.out.println("Consultando locações ativas para o cliente: " + nome);
    }
}

class Funcionario {
    protected String nome;
    @SuppressWarnings("unused")
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void cadastrarCliente(Cliente cliente) {
        // Lógica para cadastrar novo cliente
        System.out.println("Cliente cadastrado por " + nome);
    }

    public void emitirNotaPagamento(Cliente cliente, double valor) {
        // Lógica para emitir nota de pagamento
        System.out.println("Emitindo nota de pagamento para o cliente: " + cliente.nome + ", no valor de: " + valor);
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, String cargo) {
        super(nome, cargo);
    }

    public void atualizarCadastroFuncionario(Funcionario funcionario, String novosDados) {
        // Lógica para atualizar cadastro de funcionário
        System.out.println("Cadastro do funcionário " + funcionario.nome + " atualizado com sucesso.");
    }

    public void gerarRelatorioLocacao(String periodo) {
        // Lógica para gerar relatório de locação
        System.out.println("Gerando relatório de locação para o período: " + periodo);
    }

    public void gerarRelatorioSatisfacao(String periodo) {
        // Lógica para gerar relatório de satisfação
        System.out.println("Gerando relatório de satisfação para o período: " + periodo);
    }
}

class Veiculo {
    @SuppressWarnings("unused")
    private String marca;
    @SuppressWarnings("unused")
    private String modelo;
    @SuppressWarnings("unused")
    private int ano;
    @SuppressWarnings("unused")
    private String placa;

    public Veiculo(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public boolean disponivelParaLocacao() {
        // Verificar se o veículo está disponível para locação
        return true;
    }
}

public class SistemaLocacao {
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;
    private List<Veiculo> veiculos;

    public SistemaLocacao() {
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.veiculos = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        // Lógica para adicionar cliente à lista de clientes
        clientes.add(cliente);
        System.out.println("Cliente adicionado com sucesso.");
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        // Lógica para adicionar funcionário à lista de funcionários
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso.");
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        // Lógica para adicionar veículo à lista de veículos
        veiculos.add(veiculo);
        System.out.println("Veículo adicionado com sucesso.");
    }

    public static void main(String[] args) {
        SistemaLocacao sistema = new SistemaLocacao();
        Cliente cliente1 = new Cliente("João", "Rua A, 123", "joao@email.com");
        Funcionario funcionario1 = new Funcionario("Maria", "Atendente");
        Gerente gerente1 = new Gerente("José", "Gerente");
        Veiculo veiculo1 = new Veiculo("MarcaA", "ModeloA", 2022, "ABC1234");

        sistema.adicionarCliente(cliente1);
        sistema.adicionarFuncionario(funcionario1);
        sistema.adicionarFuncionario(gerente1);
        sistema.adicionarVeiculo(veiculo1);

        cliente1.solicitarLocacao("Sedan");
        funcionario1.cadastrarCliente(cliente1);
        gerente1.atualizarCadastroFuncionario(funcionario1, "Novos dados");
        gerente1.gerarRelatorioLocacao("2024-05-15");
    }
}
