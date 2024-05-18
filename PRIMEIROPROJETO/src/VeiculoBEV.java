    public class VeiculoBEV {
        // Atributos
        private String marca;
        private String modelo;
        private int anoFabricacao;
        private String cor;
        private double capacidadeBateria; // em kWh
        private double autonomia; // em km
        private double nivelBateria; // em %
    
        // Construtor
        public VeiculoBEV(String marca, String modelo, int anoFabricacao, String cor, double capacidadeBateria, double autonomia) {
            this.marca = marca;
            this.modelo = modelo;
            this.anoFabricacao = anoFabricacao;
            this.cor = cor;
            this.capacidadeBateria = capacidadeBateria;
            this.autonomia = autonomia;
            this.nivelBateria = 100; // Ao criar, a bateria está totalmente carregada
        }
    
        // Métodos
        public void carregarBateria(double quantidade) {
            if (quantidade < 0) {
                System.out.println("Quantidade de carga inválida. Deve ser positiva.");
                return;
            }
            nivelBateria = Math.min(100, nivelBateria + quantidade);
            System.out.println("Carregando " + quantidade + "%. Nível de bateria atual: " + nivelBateria + "%");
        }
    
        public void dirigir(double distancia) {
            if (distancia < 0) {
                System.out.println("Distância inválida. Deve ser positiva.");
                return;
            }
            double consumo = distancia / autonomia * 100; // % de bateria consumida
            if (nivelBateria >= consumo) {
                nivelBateria -= consumo;
                System.out.println("Dirigindo " + distancia + " km. Nível de bateria restante: " + nivelBateria + "%");
            } else {
                System.out.println("Bateria insuficiente para percorrer " + distancia + " km.");
            }
        }
    
        // Método para exibir informações do veículo
        public void exibirInformacoes() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano de fabricação: " + anoFabricacao);
            System.out.println("Cor: " + cor);
            System.out.println("Capacidade da bateria: " + capacidadeBateria + " kWh");
            System.out.println("Autonomia: " + autonomia + " km");
            System.out.println("Nível da bateria: " + nivelBateria + "%");
        }
    
        // Método principal para teste
        public static void main(String[] args) {
            // Criando um veículo BEV
            VeiculoBEV veiculo1 = new VeiculoBEV("Tesla", "Model S", 2022, "Preto", 100, 400);
    
            // Exibindo informações do veículo
            veiculo1.exibirInformacoes();
    
            // Carregando a bateria
            veiculo1.carregarBateria(50); // Carrega 50% da bateria
            veiculo1.exibirInformacoes();
    
            // Dirigindo o veículo
            veiculo1.dirigir(200); // Dirige 200 km
            veiculo1.exibirInformacoes();
        }
    }