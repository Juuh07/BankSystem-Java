<div align="center">
  
  # Exercício de Java ☕
  ### *Sistema de Gestão de Contas Bancárias*
  Este exercício foi projetado para praticar os conceitos de herança, encapsulamento, sobrecarga e sobrescrita de métodos em Java. O sistema simula um gerenciamento simplificado de contas bancárias.
</div>

---

### 1. ContaBancaria (Classe base): Define a estrutura e o comportamento básicos de qualquer conta.

- Encapsulamento: Atributos privados (numero, saldo, titular).
- Métodos:
  - depositar(double valor): Adiciona um valor ao saldo.
  - sacar(double valor): Subtrai um valor do saldo. Deve verificar se há saldo suficiente.
  - Sobrecarga de Método: sacar(double valor, String motivo): Permite sacar e registrar um motivo para a transação.
  - getNumero(), getSaldo(), getTitular(): Métodos getter para acessar os atributos privados.
  - exibirDetalhes(): Imprime os detalhes básicos da conta.

### 2. ContaCorrente (Classe derivada): Estende ContaBancaria e adiciona funcionalidades específicas de uma conta corrente.

- Herança: Herda todos os atributos e métodos de ContaBancaria.
- Encapsulamento: Adiciona um atributo privado para o limite de cheque especial (limiteChequeEspecial).
- Sobrescrita de Método: Sobrescreve o método sacar(double valor) para permitir saques que excedam o saldo, utilizando o limite do cheque especial. O saldo pode ficar negativo até o valor do limite.
- Sobrescrita de Método: Sobrescreve o método exibirDetalhes() para incluir o limite do cheque especial na exibição.

### 3. ContaPoupanca (Classe derivada): Estende ContaBancaria e implementa o conceito de juros.

- Herança: Herda de ContaBancaria.
- Encapsulamento: Adiciona um atributo privado para a taxa de juros (taxaJuros).
- Método: calcularJuros(): Adiciona os juros ao saldo da conta.
- Sobrescrita de Método: Sobrescreve o método exibirDetalhes() para incluir a taxa de juros na exibição.

---

by **[Júlia Martins](https://github.com/Juuh07)**  

---
