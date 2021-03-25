# design-patterns

## Desafio:
Utilizando os domínios criados neste projeto, crie um esquema de atualização de status de pedido com base
em status de pagamento e de entrega, isto é, teremos duas fontes de dados que criarão eventos de atualização de
status de pedido com base nos status de outros dominios (shipping e payment). Dica, teremos mais dois endpoints
para atualizar 1 = status de entrega e 2 = status de pedido e, com base nessa atualização, serão gerados eventos
de atualização de pedido para um ***observador***. Imagine os design patterns que conseguiria utilizar e aproveite
o uso das anotações do Spring para criar as classes de forma mais desacoplada e testável possível.

