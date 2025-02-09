# Cenários de Teste para Sistema de Pagamentos e Reembolsos

## Cenário 1: Compra com Cartão Válido e Saldo Suficiente
- **Descrição**: O usuário adiciona produtos ao carrinho e paga com um cartão válido e saldo suficiente.
- **Resultado Esperado**: O pagamento é aprovado e o sistema envia uma confirmação de compra.
- **Como Testar**: Teste manual ou automatizado com ferramentas como Selenium ou Cypress.

## Cenário 2: Compra com Cartão Inválido ou Saldo Insuficiente
- **Descrição**: O usuário tenta comprar com um cartão inválido ou saldo insuficiente.
- **Resultado Esperado**: O pagamento é negado, e o sistema exibe uma mensagem de erro, como "Cartão inválido" ou "Saldo insuficiente".
- **Como Testar**: Teste manual ou automatizado com mocks para simular o erro no pagamento.

## Cenário 3: Solicitação de Reembolso Após 7 Dias
- **Descrição**: O usuário tenta solicitar um reembolso após o prazo de 7 dias.
- **Resultado Esperado**: O sistema impede o reembolso e exibe uma mensagem informando que o prazo expirou.
- **Como Testar**: Teste manual ou automatizado com JUnit 5.

## Cenário 4: Reembolso para Transação Concluída
- **Descrição**: O usuário solicita reembolso dentro do prazo de 7 dias após a compra, que foi concluída com sucesso.
- **Resultado Esperado**: O sistema processa o reembolso e devolve o valor ao mesmo cartão utilizado.
- **Como Testar**: Teste de integração.

## Cenário 5: Histórico de Transações e Reembolsos
- **Descrição**: O sistema deve registrar todas as transações e reembolsos.
- **Resultado Esperado**: O histórico de compras e reembolsos deve estar acessível para administradores ou usuários.
- **Como Testar**: Verifique diretamente no banco de dados para garantir que as transações e reembolsos estão sendo corretamente registrados.
