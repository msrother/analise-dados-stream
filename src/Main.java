import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Dado> listaDados = Arrays.asList(
                new Dado(1, 100.0, "Alimentacao", "2024-01-01"),
                new Dado(2, 150.0, "Moradia", "2024-01-02"),
                new Dado(3, 120.0, "Transporte", "2024-01-03"),
                new Dado(4, 100.0, "Alimentacao", "2024-01-01"),
                new Dado(5, 150.0, "Alimentacao", "2024-01-02"),
                new Dado(6, 120.0, "Transporte", "2024-01-03"),
                new Dado(7, 1700.0, "Moradia", "2024-01-01"),
                new Dado(8, 1150.0, "Alimentacao", "2024-01-02"),
                new Dado(9, 1320.0, "Saude", "2024-01-03"),
                new Dado(10, 400.0, "Entretenimento", "2024-01-01"),
                new Dado(11, 100.0, "Transporte", "2024-01-02"),
                new Dado(12, 200.0, "Entretenimento", "2024-01-06")
        );

        AnaliseDados analiseDados = new AnaliseDados(listaDados);

        System.out.println("Filtrar por categoria - Transporte: " + analiseDados.filtrarPorCategoria("Transporte"));
        System.out.println("Soma dos valores da categoria - Moradia: " + analiseDados.calcularSomaValoresCategoria("Moradia"));
        System.out.println("Valor máximo: " + analiseDados.encontrarValorMaximo().orElse(null));
        System.out.println("Agrupar por categoria: " + analiseDados.agruparPorCategoria());
        System.out.println("Ordenar por valor e data: " + analiseDados.ordenarPorValorEData());
    }
}