# Design Patterns com Java

Projeto desenvolvido para o desafio da plataforma DIO
**Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework**.

## Objetivo

Aplicar na prática alguns dos principais padrões de projeto
utilizados no desenvolvimento de software com Java.

Neste projeto foram implementados os padrões:

- Singleton
- Strategy
- Facade

## Design Patterns utilizados

### Singleton

O padrão Singleton foi utilizado para garantir que exista
apenas uma instância da configuração da aplicação.

### Strategy

O padrão Strategy foi utilizado para permitir diferentes
formas de pagamento:

- PIX
- Cartão
- Boleto

Cada forma de pagamento implementa a interface
`PagamentoStrategy`.

### Facade

O padrão Facade foi utilizado para simplificar o processo
de realização de pedidos.

A classe `PedidoFacade` centraliza chamadas para:

- Estoque
- Pagamento
- Entrega

## Estrutura do projeto

```text
src/
├── Main.java
├── singleton/
│   └── Configuracao.java
├── strategy/
│   ├── PagamentoStrategy.java
│   ├── PagamentoPix.java
│   ├── PagamentoCartao.java
│   └── PagamentoBoleto.java
└── facade/
    ├── EstoqueService.java
    ├── PagamentoService.java
    ├── EntregaService.java
    └── PedidoFacade.java