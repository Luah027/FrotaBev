import java.util.Scanner;

    public class MonitoramentoMeta {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Definindo metas de aluguel para cada ano
            int[] metas = {0, 41118, 82236, 164472, 328944};
            
            // Contadores para acompanhar o total de veículos alugados em cada ano
            int[] veiculosAlugados = new int[5];
            
            // Loop para monitorar o aumento diário de veículos alugados
            for (int ano = 1; ano <= 5; ano++) {
                int metaAno = metas[ano - 1]; // Meta de aluguel para o ano atual
                int totalAlugado = 0; // Total de veículos alugados até o momento no ano
                
                while (totalAlugado < metaAno) {
                    System.out.println("Ano " + ano + " - Dia " + (totalAlugado + 1));
                    System.out.print("Informe o número de veículos BEV alugados hoje: ");
                    int novosAlugueis = scanner.nextInt();
                    
                    // Adiciona o número de veículos alugados hoje ao total do ano
                    totalAlugado += novosAlugueis;
                    veiculosAlugados[ano - 1] += novosAlugueis;
                }
                
                System.out.println("Meta de " + metaAno + " veículos BEV alugados alcançada para o ano " + ano);
            }
            
            // Exibe o total de veículos alugados em cada ano
            System.out.println("\nTotal de veículos BEV alugados em cada ano:");
            for (int ano = 1; ano <= 5; ano++) {
                System.out.println("Ano " + ano + ": " + veiculosAlugados[ano - 1]);
            }
            
            scanner.close();
        }
    }
    

