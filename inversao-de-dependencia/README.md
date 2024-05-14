# Gerenciamento de Conexão de Internet com Inversão de Dependência (SOLID) 

O princípio D do SOLID, Inversão de Dependência (em inglês, Dependency Inversion Principle), é crucial para a construção de softwares robustos e flexíveis. Em resumo, ele diz:

**Dependa de abstrações, não de implementações concretas.**

Isso significa que seus módulos de alto nível (classes mais importantes e abstratas) não devem depender diretamente dos detalhes de implementação dos módulos de baixo nível (classes mais específicas e concretas). Essa inversão de dependência é obtida através de abstrações como interfaces e classes abstratas.

## Benefícios:

* Flexibilidade: Facilita a troca de implementações sem afetar o código de alto nível, tornando o software mais adaptável a mudanças.

* Testabilidade: Permite testar módulos de forma isolada, sem depender de outras partes do sistema, facilitando o desenvolvimento de testes unitários.
    
* Reuso: Promove o reuso de código, pois as abstrações podem ser utilizadas por diferentes módulos, evitando duplicação de código.

* Manutenabilidade: Torna o código mais fácil de entender, modificar e depurar, pois as dependências são mais claras e bem definidas.

**Como implementar:**

1. Interfaces: Defina interfaces para representar as abstrações que seus módulos de alto nível dependem.

2. Classes abstratas: Implemente as interfaces com classes abstratas que fornecem funcionalidades básicas e comuns.

3. Classes concretas: Crie classes concretas que herdam das classes abstratas e implementem as funcionalidades específicas de cada módulo.
    
4. Injeção de dependência: Utilize técnicas como injeção de dependência para fornecer as instâncias das abstrações aos módulos de alto nível.
    

## Benefícios da Inversão de Dependência (DIP):

* Podemos facilmente trocar o tipo de conexão (Wi-Fi para Ethernet) sem modificar o código principal da Aplicacao.

* A interface IConexaoInternet define o contrato para gerenciar conexões, promovendo modularidade e reuso de código.
