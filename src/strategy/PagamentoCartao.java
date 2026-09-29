package strategy;

public class PagamentoCartao implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {

        System.out.printf(
            "Pagamento de R$ %.2f realizado via Cartão.%n",
            valor
        );
    }
}