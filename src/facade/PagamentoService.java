package facade;

import strategy.PagamentoStrategy;

public class PagamentoService {

    public void processar(
        PagamentoStrategy estrategia,
        double valor
    ) {

        estrategia.pagar(valor);
    }
}