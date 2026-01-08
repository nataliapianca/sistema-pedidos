# Projeto de Sistema de Pedidos

## Visão Geral
Este projeto representa um **sistema de pedidos**, desenvolvido para simular o funcionamento básico de uma aplicação de vendas. O sistema permite o cadastro de usuários, produtos e categorias, além do registro de pedidos compostos por múltiplos itens.

O foco do projeto está na modelagem do domínio e no entendimento do fluxo de um pedido, desde sua criação até o cálculo do valor total e o registro do pagamento.

## Funcionalidades Principais
- Cadastro e gerenciamento de usuários
- Cadastro de produtos e categorias
- Criação de pedidos associados a usuários
- Inclusão de vários itens em um pedido
- Cálculo automático do subtotal de cada item
- Cálculo do valor total do pedido
- Controle do status do pedido
- Registro de pagamento vinculado ao pedido

## Modelagem do Domínio
O sistema é composto por entidades que representam um cenário real de vendas:

- **Usuário**: responsável por realizar pedidos no sistema.
- **Pedido**: representa uma compra realizada por um usuário em uma data específica.
- **Item do Pedido**: faz a ligação entre o pedido e o produto, armazenando quantidade e preço.
- **Produto**: item disponível para venda.
- **Categoria**: utilizada para classificar os produtos.
- **Pagamento**: registra as informações de quitação de um pedido.

Essas entidades se relacionam de forma estruturada para garantir a integridade das informações e refletir um processo real de compra.

## Regras de Negócio
- Um usuário pode possuir vários pedidos.
- Cada pedido pertence a um único usuário.
- Um pedido pode conter vários itens.
- Cada item do pedido está associado a apenas um produto.
- O subtotal do item é calculado com base na quantidade e no preço.
- O valor total do pedido é a soma dos subtotais dos itens.
- Um pedido possui um status que indica sua situação atual.
- O pagamento está vinculado a um único pedido.

## Objetivo do Projeto
Este projeto tem como objetivo principal o aprendizado e a prática de conceitos fundamentais, como:
- Modelagem de sistemas de pedidos
- Relacionamento entre entidades
- Organização das regras de negócio
- Compreensão do fluxo completo de uma venda

## Considerações Finais
O sistema de pedidos apresentado serve como base para aplicações mais complexas. Ele pode ser expandido com novas funcionalidades, como controle de estoque, relatórios, autenticação de usuários ou integração com outros módulos, sendo um excelente ponto de partida para projetos acadêmicos ou de estudo.
