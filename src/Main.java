import facade.PedidoFacade;
import singleton.Configuracao;
import strategy.PagamentoCartao;
import strategy.PagamentoPix;
import strategy.PagamentoStrategy;

public class Main {

    public static void main(String[] args) {

        /*
         * SINGLETON
         */

        Configuracao config1 =
            Configuracao.getInstancia();

        Configuracao config2 =
            Configuracao.getInstancia();

        System.out.println(
            "=== SINGLETON ==="
        );

        System.out.println(
            config1.getNomeSistema()
        );

        System.out.println(
            "Mesma instância: "
            + (config1 == config2)
        );


        /*
         * STRATEGY
         */

        System.out.println();
        System.out.println(
            "=== STRATEGY ==="
        );

        PagamentoStrategy pix =
            new PagamentoPix();

        pix.pagar(100.00);

        PagamentoStrategy cartao =
            new PagamentoCartao();

        cartao.pagar(250.00);


        /*
         * FACADE
         */

        System.out.println();
        System.out.println(
            "=== FACADE ==="
        );

        PedidoFacade pedido =
            new PedidoFacade();

        pedido.realizarPedido(
            "Notebook",
            3500.00,
            "Lima - Peru",
            new PagamentoPix()
        );
    }
}