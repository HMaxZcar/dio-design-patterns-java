package facade;

import strategy.PagamentoStrategy;

public class PedidoFacade {

    private EstoqueService estoqueService;
    private PagamentoService pagamentoService;
    private EntregaService entregaService;

    public PedidoFacade() {

        estoqueService = new EstoqueService();
        pagamentoService = new PagamentoService();
        entregaService = new EntregaService();
    }

    public void realizarPedido(
        String produto,
        double valor,
        String endereco,
        PagamentoStrategy pagamento
    ) {

        System.out.println();
        System.out.println(
            "=== PROCESSANDO PEDIDO ==="
        );

        boolean disponivel =
            estoqueService.verificarEstoque(produto);

        if (!disponivel) {

            System.out.println(
                "Produto indisponível."
            );

            return;
        }

        pagamentoService.processar(
            pagamento,
            valor
        );

        entregaService.solicitarEntrega(
            endereco
        );

        System.out.println(
            "Pedido realizado com sucesso!"
        );
    }
}