import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;

public class FrotaBEV {

    public static void main(String[] args) {
        // Definindo os dados da frota BEV ao longo dos anos
        double[] proporcaoBEV = {0, 0, 0.2, 0.5, 0.5, 1.0}; // proporção de BEV na frota
        int[] anos = {0, 1, 2, 3, 4, 5}; // anos

        // Criando o conjunto de dados para o gráfico
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < proporcaoBEV.length; i++) {
            dataset.addValue(proporcaoBEV[i] * 100, "BEV", String.valueOf(anos[i]));
        }

        // Criando o gráfico
        JFreeChart chart = ChartFactory.createLineChart(
                "Proporção da Frota Composta por Veículos BEV",
                "Ano",
                "Proporção (%)",
                dataset
        );

        // Exibindo o gráfico em uma janela
        JFrame frame = new JFrame("Gráfico da Frota BEV");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.getContentPane().add(chartPanel);
        frame.setVisible(true);

        // Verificando se as metas foram alcançadas
        boolean metaAlcancada = true;
        for (int i = 0; i < proporcaoBEV.length; i++) {
            if (i == 2 && proporcaoBEV[i] < 0.2) {
                metaAlcancada = false;
                break;
            } else if (i == 3 && proporcaoBEV[i] < 0.5) {
                metaAlcancada = false;
                break;
            } else if (i == 5 && proporcaoBEV[i] < 1.0) {
                metaAlcancada = false;
                break;
            }
        }

        // Exibindo mensagem sobre as metas
        if (metaAlcancada) {
            System.out.println("A empresa alcançou todas as metas de proporção da frota BEV nos primeiros 5 anos.");
        } else {
            System.out.println("A empresa não alcançou todas as metas de proporção da frota BEV nos primeiros 5 anos.");
            // Aqui você pode adicionar código para registrar a informação para fins de regulamentações futuras
        }
    }
}