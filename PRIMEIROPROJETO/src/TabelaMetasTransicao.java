import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TabelaMetasTransicao {

    public static void main(String[] args) {
        // Metas de transição da frota
        int[] anos = {1, 2, 3, 4, 5}; // anos
        int[] metasTransicao = {41118, 82236, 164472, 328944,657888}; // metas de veículos BEV alugados
        
        // Criando a tabela de dados
        String[] colunas = {"Ano", "Meta de Veículos BEV"};
        Object[][] dados = new Object[metasTransicao.length][2];
        for (int i = 0; i < metasTransicao.length; i++) {
            dados[i][0] = anos[i];
            dados[i][1] = metasTransicao[i];
        }
        
        // Criando o modelo da tabela
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        
        // Criando a tabela e configurando o modelo
        JTable tabela = new JTable(modelo);
        tabela.setEnabled(false); // Para evitar edição dos dados
        
        // Exibindo a tabela em uma janela
        JFrame frame = new JFrame("Metas de Transição da Frota por Ano");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(tabela));
        frame.pack();
        frame.setVisible(true);
    }
}
