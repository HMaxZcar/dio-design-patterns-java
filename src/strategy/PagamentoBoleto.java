package strategy;

public class PagamentoBoleto implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {

        System.out.printf(
            "Boleto de R$ %.2f gerado com sucesso.%n",
            valor
        );
    }
}