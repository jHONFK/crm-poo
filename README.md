
# CRM - Java

## Descrição do Projeto

Sistema básico de CRM (Customer Relationship Management) desenvolvido em Java.

## Funcionalidades

- **Gerenciamento de Clientes:** Adição e exibição de clientes com nome, e-mail e CPF.
- **Gerenciamento de Funcionários:** Adição e exibição de funcionários com nome, e-mail e matrícula.
- **Gerenciamento de Produtos:** Adição e exibição de produtos com nome e preço.
- **Criação de Pedidos:** Criação de pedidos associando clientes e funcionários, adicionando múltiplos produtos e calculando o total.
- **Persistência de Dados:** Salvamento e carregamento de dados (clientes, funcionários, produtos, pedidos) em arquivos utilizando serialização.


### Interface

- **`IFilePersistence`:**
  - Define a interface para classes que implementam persistência de dados.
  - Métodos: `saveData()`, `loadData()`.

## Aplicação dos Conceitos de Programação Orientada a Objetos

### 1. **Classes e Objetos**
   - As classes `Client`, `Employee`, `Product`, `Purchase`, e `CRM` representam as diferentes entidades do sistema

### 2. **Encapsulamento**
   - Todos os atributos das classes são privados, acessíveis apenas por meio de métodos públicos (`getters` e `setters`). Isso protege os dados da aplicação e promove a segurança do código.

### 3. **Herança**
   - A classe `Person` é uma classe abstrata que serve como base para `Client` e `Employee`. Ambas herdam propriedades e métodos de `Person`, e cada uma implementa seu próprio comportamento específico.

### 4. **Polimorfismo**
   - O método `getData()` é abstrato na classe `Person` e é sobrescrito nas classes `Client` e `Employee`, permitindo que diferentes tipos de `Person` possam ser tratados de forma uniforme.

### 5. **Sobrecarga e Sobrescrita de Métodos**
   - Métodos são sobrescritos em subclasses (`getData()`), e métodos são sobrecarregados conforme necessário para fornecer diferentes implementações (por exemplo, em `CRM` para gerenciar listas de objetos).

### 6. **Classes Abstratas e Interfaces**
   - `Person` é uma classe abstrata que define um conceito genérico de pessoa, e `IFilePersistence` é uma interface que define um contrato para persistência de dados.

### 7. **Coleções**
   - Utilizamos `ArrayList` para armazenar e manipular grupos de objetos, como listas de clientes, funcionários, produtos, e pedidos.

### 8. **Manipulação de Arquivos**
   - A classe `FilePersistence` permite salvar e carregar dados da aplicação para arquivos, garantindo a persistência dos dados entre execuções do programa.

### 9. **Tratamento de Exceções**
   - Exceções são tratadas ao trabalhar com arquivos para garantir que erros de I/O não quebrem o programa, mas sejam adequadamente gerenciados.

## Instruções de Execução

1. **Clonar o Repositório:**
   ```bash
   git clone https://github.com/jHONFK/crm-poo.git
   ```
   
2. **Compilar o Projeto:**
   - Navegue até a pasta do projeto e compile o código-fonte:
   ```bash
   javac src/*.java
   ```

3. **Executar o Programa:**
   - Execute a classe `Main`:
   ```bash
   java src/Main
   ```

