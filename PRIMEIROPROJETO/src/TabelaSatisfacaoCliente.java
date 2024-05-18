import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TabelaSatisfacaoCliente {

    public static void main(String[] args) {
        // Dados fictícios dos resultados das pesquisas de satisfação do cliente
        String[] perguntas = {"Facilidade de Uso", "Desempenho", "Confiabilidade", "Design"};
        double[] antes = {4.5, 4.3, 4.6, 4.4}; // Pontuações antes da introdução dos veículos elétricos
        double[] depois = {4.8, 4.6, 4.7, 4.5}; // Pontuações após a introdução dos veículos elétricos
        
        // Criando a tabela de dados
        String[] colunas = {"Pergunta", "Antes", "Após"};
        Object[][] dados = new Object[perguntas.length][3];
        for (int i = 0; i < perguntas.length; i++) {
            dados[i][0] = perguntas[i];
            dados[i][1] = antes[i];
            dados[i][2] = depois[i];
        }
        
        // Criando o modelo da tabela
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        
        // Criando a tabela e configurando o modelo
        JTable tabela = new JTable(modelo);
        tabela.setEnabled(false); // Para evitar edição dos dados
        
        // Exibindo a tabela em uma janela
        JFrame frame = new JFrame("Resultados das Pesquisas de Satisfação do Cliente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(tabela));
        frame.pack();
        frame.setVisible(true);
    }
}
