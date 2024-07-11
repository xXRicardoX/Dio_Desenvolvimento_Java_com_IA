```markdown
# Sistema Bancário Digital com Spring Boot

Este projeto demonstra a implementação de um sistema bancário digital simplificado usando os padrões de projeto Facade, Strategy e Singleton em Java com Spring Boot.

## Padrões de Projeto Utilizados

- **Singleton**: Garante que o `BankDatabase` tenha apenas uma única instância durante toda a aplicação.
- **Strategy**: Permite a troca de estratégias de autenticação, como autenticação por senha ou por token.
- **Facade**: Fornece uma interface simplificada para as operações bancárias, escondendo a complexidade do sistema.

## Estrutura de Pacotes

- **model**: Contém as classes relacionadas ao modelo, como `BankAccount` e `BankDatabase`.
- **view**: Contém as classes relacionadas à interface do usuário.
- **presenter**: Contém as classes que implementam a lógica de negócios e interagem com a camada de modelo.
- **config**: Contém as classes de configuração do Spring Boot.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/sistema-bancario-digital.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd sistema-bancario-digital
   ```
3. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

## Funcionalidades

- **Autenticação**: Suporte para autenticação por senha ou por token.
- **Operações Bancárias**: Depósito, saque, transferência de fundos e consulta de saldo.

## Exemplo de Uso

Após a execução, use as seguintes URLs para interagir com o sistema:
- `POST /bank/authenticate?accountNumber=123456&credentials=senha123&method=password`
- `POST /bank/deposit?accountNumber=123456&amount=200.0`
- `POST /bank/withdraw?accountNumber=123456&amount=150.0`
- `POST /bank/transfer?fromAccountNumber=123456&toAccountNumber=654321&amount=300.0`
- `GET /bank/balance?accountNumber=123456`
