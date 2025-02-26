# MOD2-UC6 Desenvolver Código Orientado a Objetos.

Este repositório reúne os projetos desenvolvidos durante o módulo MOD2-UC6 Desenvolver Código Orientado a Objetos. Foram abordadas diversas situações-problema que exploram conceitos como herança, polimorfismo, encapsulamento e estruturas de dados, implementados em projetos NetBeans do tipo console.

## 📚 *Atividades Incluídas*

### *Atividade 1 - Protótipos para Sistemas Hotéis*

*Contexto:*  
Desenvolvimento de algoritmos em Java para solucionar problemas práticos do setor hoteleiro. Foram abordadas as seguintes funcionalidades:

- *Seleção de Auditórios:*  
  Verificação do número de convidados para determinar o auditório mais adequado (Alfa ou Beta), com cálculo de cadeiras adicionais quando necessário.

- *Troca de Quartos:*  
  Lógica para troca de quartos entre hóspedes, levando em conta a idade dos clientes e aplicando desconto de 40% para idosos (60 anos ou mais).

- *Cálculo de Hospedagem:*  
  Determinação do valor total da hospedagem com regras de gratuidade para hóspedes com menos de 4 anos e meia hospedagem para idosos com mais de 80 anos.

- *Cadastro e Pesquisa de Hóspedes:*  
  Sistema para cadastro (até 15 hóspedes) e pesquisa por nome, retornando o índice de cadastro em caso de sucesso.

- *Controle de Ocupação:*  
  Exibição de uma tabela indicando quais quartos estão ocupados ou desocupados em um hotel com 4 andares e 3 quartos por andar.

*Entregas:*  
Implementação dos algoritmos em projetos Java no NetBeans (tipo console), conforme descrito nos enunciados e problemas propostos.

### *Atividade 2 - Sistema para Agência de Viagens*

*Contexto:*  
Desenvolvimento de um sistema para gerenciamento de pacotes de viagens e vendas para uma agência. O sistema engloba:

- *Transporte:*  
  Cadastro do meio de transporte, especificando tipo (aéreo, rodoviário, marítimo etc.) e valor.

- *Hospedagem:*  
  Registro da hospedagem com descrição e valor da diária.

- *Pacote de Viagem:*  
  Combinação de transporte e hospedagem, definição do destino e quantidade de dias. A classe responsável calcula:
  - O total de hospedagem (valor da diária x número de dias);
  - A aplicação de uma margem de lucro (porcentagem) e taxas adicionais;
  - O valor total do pacote (em dólar).

- *Venda:*  
  Registro da venda do pacote, com dados do cliente, forma de pagamento e conversão de valores entre dólar e real, utilizando a cotação informada.

*Entregas:*  
- Desenvolvimento das classes: Transporte, Hospedagem, PacoteViagem e Venda.  
- Diagrama UML (conforme diagramaAtividade2.pdf).

### *Atividade 3 - Sistema de RH e Folha de Pagamento*

*Contexto:*  
Implementação de um sistema de gerenciamento de funcionários com duas abordagens de remuneração:

- *Funcionários Assalariados:*  
  Recebem um salário fixo mensal.

- *Funcionários Horistas:*  
  O pagamento é calculado multiplicando o número de horas trabalhadas pelo valor da hora.

Utilizando uma classe abstrata para “Funcionário” com métodos para exibição dos dados e cálculo do pagamento, as classes derivadas implementam as regras específicas de cada tipo. O sistema permite:

- Cadastro de até 10 funcionários (independentemente do tipo);
- Exibição dos dados e valores de pagamento;
- Aplicação de um aumento geral (porcentagem informada pelo usuário) para todos os funcionários.

*Entregas:*  
Implementação completa em Java, aplicando conceitos de herança, polimorfismo e encapsulamento.

### *Atividade 4 - Sistema de Cálculo de Impostos*

*Contexto:*  
Desenvolvimento de um sistema contábil para o cálculo de impostos sobre vendas de produtos, com foco nos impostos *PIS* e *IPI*:

- *PIS:*  
  Calculado com base na diferença entre o valor total de débito e crédito, aplicado a uma alíquota fixa de 1,65%.

- *IPI:*  
  Calculado a partir da soma do valor do produto, frete, seguro e outras despesas, multiplicado por uma alíquota variável.

Para facilitar a extensão do sistema, foi utilizada uma hierarquia de classes com interfaces, permitindo a inclusão de novos impostos futuramente. Uma classe “Pagamentos” agrega os impostos a serem pagos e gerencia o cadastramento dinâmico destes.

*Entregas:*  
- Projeto Java no NetBeans com classes, interfaces e métodos para o cálculo e exibição dos impostos.

### *Atividade 5 - Sistema para Pizzaria*

*Contexto:*  
Implementação de um sistema para gerenciamento de uma rede de pizzarias, que abrange:

- *Cadastro de Pizzas:*  
  Cada pizza possui atributos como nome, tamanho (em cm), preço, indicação se é doce ou salgada e uma lista de ingredientes. Cada pizza pode exibir seus próprios dados.

- *Cadastro de Bebidas:*  
  Registro de bebidas com nome, quantidade (em ml) e preço, com funcionalidade para exibir os dados.

- *Cardápio Virtual:*  
  Consolidação de uma lista de pizzas e bebidas disponíveis na pizzaria.

- *Pedidos:*  
  Registro de pedidos contendo número da mesa, pizzas e bebidas solicitadas. O sistema calcula o total do pedido e simula uma fila (FIFO) para a preparação, garantindo que a primeira solicitação seja a primeira a ser atendida.

*Entregas:*  
- Desenvolvimento das classes: Pizza, Bebida, Cardápio e Pedido.  
- Implementação de um menu interativo para cadastro, listagem e gerenciamento dos pedidos.

## 🛠️ *Ferramentas Utilizadas*

- *NetBeans:* Ambiente de desenvolvimento integrado para projetos Java.
- *Java:* Linguagem de programação utilizada para implementar todos os protótipos.
- *Conceitos de Orientação a Objetos e Estruturas de Dados:* Fundamentais para a modelagem e implementação dos sistemas.

## ✨ *Sobre o Repositório*

Este repositório foi criado para consolidar os aprendizados e práticas adquiridas no módulo de Programação Orientada a Objetos. Cada atividade foi desenvolvida para resolver problemas reais e simular cenários práticos, reforçando o uso de herança, polimorfismo, encapsulamento e manipulação de estruturas de dados em Java. Os projetos estão organizados em pastas separadas por atividade, facilitando a consulta e a execução dos mesmos.

*Responsável pelo desenvolvimento:* Ana Beatriz Loureiro
