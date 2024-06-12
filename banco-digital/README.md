# 🏦 Desafio DIO - Banco Digital em Java e Orientação a Objetos

Este projeto, que faz parte do Bootcamp Santander 2024 - Backend com Java, tem como objetivo reforçar o conhecimento em Programação Orientada a Objetos (POO) utilizando Java, através da implementação de um banco digital. Os conceitos fundamentais da POO, como abstração, encapsulamento, herança e polimorfismo, são aplicados no contexto de uma aplicação bancária.

## 📋 Descrição dos Códigos

### Main.java

Este é o ponto de entrada da aplicação. Ele cria um cliente e duas contas (corrente e poupança), realiza operações de depósito e transferência, e imprime os extratos de ambas as contas.

### IConta.java

Define a interface para as operações básicas de uma conta bancária, como sacar, depositar, transferir e imprimir extrato.

### ContaCorrente.java

Implementa uma conta corrente, herdando de `Conta`. Define o método específico para imprimir o extrato de uma conta corrente.

### ContaPoupanca.java

Implementa uma conta poupança, herdando de `Conta`. Define o método específico para imprimir o extrato de uma conta poupança.

### Conta.java

Classe abstrata que implementa a interface `IConta`. Serve como base para as classes `ContaCorrente` e `ContaPoupanca`, contendo atributos e métodos comuns a todas as contas.

### Cliente.java

Representa um cliente do banco, contendo um atributo `nome` e seus métodos acessores.

### Banco.java

Classe abstrata que implementa a interface `IConta`. Apesar de não ser utilizada diretamente no exemplo, pode servir como base para outras implementações de banco.