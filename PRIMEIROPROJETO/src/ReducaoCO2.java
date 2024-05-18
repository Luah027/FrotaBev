    import org.jfree.chart.ChartFactory;
    import org.jfree.chart.ChartPanel;
    import org.jfree.chart.JFreeChart;
    import org.jfree.data.category.DefaultCategoryDataset;
    import javax.swing.*;
    
    public class ReducaoCO2 {
    
        public static void main(String[] args) {
            // Dados fictícios de emissões de CO2 ao longo dos anos
            double[] emissaoCO2 = {1000, 800, 600, 400, 200}; // em toneladas
            int[] anos = {1, 2, 3, 4, 5}; // anos
    
            // Criando o conjunto de dados para o gráfico
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (int i = 0; i < emissaoCO2.length; i++) {
                dataset.addValue(emissaoCO2[i], "Emissões de CO2", String.valueOf(anos[i]));
            }
    
            // Criando o gráfico
            JFreeChart chart = ChartFactory.createLineChart(
                    "Redução Progressiva das Emissões de CO2",
                    "Ano",
                    "Emissões de CO2 (toneladas)",
                    dataset
            );
    
            // Exibindo o gráfico em uma janela
            JFrame frame = new JFrame("Gráfico de Redução de Emissões de CO2");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            ChartPanel chartPanel = new ChartPanel(chart);
            frame.getContentPane().add(chartPanel);
            frame.setVisible(true);
        }
    }
    

