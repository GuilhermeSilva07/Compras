# Simulador de Cartão de Crédito

**Descrição:**
Este projeto em Java simula um cartão de crédito, permitindo ao usuário realizar compras, verificar o saldo e visualizar o histórico de transações.

**Funcionalidades:**
* **Cadastro de compras:** Permite adicionar novas compras com descrição e valor.
* **Verificação de saldo:** Mostra o saldo disponível do cartão.
* **Histórico de compras:** Exibe um histórico ordenado das compras realizadas.
* **Limite de crédito:** Impede que o usuário realize compras que excedam o limite do cartão.

**Tecnologias:**
* **Java:** Linguagem de programação utilizada.
* **Collections Framework:** Utilizado para armazenar e ordenar as compras.

**Como usar:**
1. **Compilar:** Compile as classes `Principal`, `Compra` e `cartaoDeCredito` utilizando um compilador Java.
2. **Executar:** Execute a classe `Principal`.
3. **Interagir:** Siga as instruções no terminal para realizar compras, verificar o saldo e sair do programa.

**Estrutura do código:**
* **Principal:** Classe principal que contém a lógica da aplicação, incluindo a interação com o usuário.
* **Compra:** Representa uma compra individual, com atributos como descrição e valor.
* **cartaoDeCredito:** Representa o cartão de crédito, com atributos como limite, saldo e uma lista de compras.

**Contribuições:**
Contribuições são bem-vindas! Para contribuir, siga estes passos:
1. Fork este repositório.
2. Crie uma nova branch.
3. Faça suas alterações e commit.
4. Envie um pull request.


**Próximos passos:**
* **Interface gráfica:** Implementar uma interface gráfica para melhorar a experiência do usuário.
* **Persistência de dados:** Salvar os dados do cartão em um arquivo ou banco de dados para persistir as informações entre as execuções.
* **Relatórios:** Gerar relatórios com informações mais detalhadas sobre as compras, como gastos por categoria.

**Observações:**
* **Classes:** As classes estão bem definidas e com responsabilidades claras.
* **Comentários:** Os comentários ajudam a entender o código e a sua lógica.
* **Collections:** O uso da classe `ArrayList` para armazenar as compras é eficiente.
* **Ordenação:** A implementação do método `compareTo` na classe `Compra` permite ordenar as compras por valor de forma simples.

