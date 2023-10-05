<h1 align="center">📚 Livraria Boa Leitura</h1>
<h3 align="center">Relatório Avaliação Prática Algoritmos 3</h3>



### 📝 Descrição do Projeto
Esse sistema de gerenciamento é uma aplicação abrangente e eficiente criada para facilitar as operações de uma livraria fictícia, garantindo um controle preciso do estoque, atendimento ao cliente e 
administração interna. Desenvolvido com base em conceitos de programação orientada a objetos, o sistema oferece um conjunto de classes bem definidas para gerenciar todas as áreas relevantes do negócio.

## ✔️ Tecnologias Utilizadas
- ``Java``

## 🧑‍💻 Autores
| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/69803631?v=4" width=115><br><sub>Enzo Bondan de Lima</sub>](https://github.com/enzobondan) |  [<img loading="lazy" src="https://avatars.githubusercontent.com/u/97066868?v=4" width=115><br><sub>Asafe Belo Borges</sub>](https://github.com/asafebelo) |  [<img loading="lazy" src="https://avatars.githubusercontent.com/u/145792879?v=4" width=115><br><sub>Carlos Eduardo Rehbein</sub>](https://github.com/cadurehbein) |
| :---: | :---: | :---: |

## ✒️ Classes
- `Autor:` A classe Autor armazena informações cruciais sobre os autores dos livros vendidos na livraria, promovendo um controle completo sobre o catálogo.
- `Boa Leitura:` A classe central, representando a própria livraria, coordena todas as operações. Ela é o núcleo que permite cadastrar e gerenciar livros, autores, clientes, funcionários, editoras e o estoque.
- `Cliente:` Registrando informações detalhadas sobre os clientes, esta classe promove o relacionamento com o público, mantendo um histórico de compras e empréstimos.
- `Editora:` A classe Editora rastreia informações essenciais sobre as editoras de livros, permitindo que a livraria tenha controle sobre as origens de seus produtos.
- `Funcionário:` Gerenciando dados sobre os funcionários da livraria, como nome, função e remuneração, esta classe ajuda na administração de recursos humanos.
- `Livro:` Contendo dados específicos sobre os livros disponíveis na livraria, como título, autor, ISBN, preço e estoque, esta classe é fundamental para a gestão do catálogo.
- `Vendável:` A classe Vendável é uma interface que padroniza operações comuns, como obtenção de preço e descrição, para objetos de classes diferentes, como Livro e Autor. Isso promove a consistência no sistema.
- `Pessoa:` A classe Pessoa é uma classe base que encapsula informações compartilhadas entre Autor, Cliente, Funcionário e outras classes relacionadas.
- `Estoque:` A classe Estoque garante um controle efetivo sobre o inventário da livraria, possibilitando a adição, remoção e atualização de itens.

## 🕵️‍♂️ Funcionalidades
- `Cadastro de Livros:` Os funcionários da livraria podem cadastrar novos livros no estoque. Eles inserem informações como título, autor e editora do livro.
- `Registro de Vendas:` Os funcionários podem registrar vendas de livros, removendo o livro vendido do estoque e adicionando-o a um histórico de vendas. Isso permite o acompanhamento das transações de vendas.
- `Verificação de Histórico de Vendas:` Permite verificar o histórico de vendas desde a última limpeza, e o sistema lê e grava essas informações em arquivos ao iniciar e encerrar.
- `Verificação de Estoque:` Os funcionários podem verificar o estoque disponível na livraria, incluindo o título de cada livro e a quantidade total de livros em estoque.
- `Limpeza do Arquivo de Vendas:` Existe a opção de limpar o arquivo de vendas, o que pode ser útil para manter registros organizados.
- `Encerramento do Sistema:` Os funcionários podem encerrar o sistema, o que aciona a gravação do estoque atualizado e do histórico de vendas em arquivos físicos para preservar os dados.

## 🔦 Princípios da POO no sistema da Livraria
- `Encapsulamento:` O encapsulamento é aplicado de forma consistente, onde os atributos das classes são declarados como privados, e os métodos getters e setters são utilizados para controlar o acesso a esses atributos. Por exemplo, na classe Autor, o atributo nome é privado, e o método getNome() permite acesso a ele.
- `Herança:` A classe Autor herda de Pessoa, demonstrando um exemplo de herança. A classe Pessoa é uma superclasse que fornece atributos e métodos comuns, que são compartilhados pelas subclasses, como Autor, Cliente e Funcionário. Isso promove a reutilização de código.
- `Classe Abstrata:` A classe Pessoa é definida como abstrata, indicando que não pode ser instanciada diretamente. Ela serve como uma classe base para outras classes, como Autor, Cliente e Funcionário, que herdam seus atributos e métodos. A classe abstrata define uma estrutura comum, mas não pode ser usada como uma instância isolada.
- `Sobrescrita/Polimorfismo:` As classes Autor, Cliente e Funcionário sobrescrevem o método getNome() da classe base Pessoa. Cada uma fornece sua própria implementação desse método, permitindo que objetos de diferentes classes sejam tratados de maneira uniforme. Por exemplo, quando se chama getNome() em um objeto Autor, ele retorna "Autor [Nome do Autor]". Isso é um exemplo de polimorfismo, onde o mesmo método pode se comportar de maneiras diferentes dependendo do tipo do objeto.
- `Uso de Interface:` É criada a interface Vendavel, que define métodos como getPreco(), getDescricao() e setPreco(). As classes Livro e Autor implementam essa interface, garantindo que esses métodos estejam disponíveis em cada classe. Isso permite que objetos de diferentes classes sejam tratados de maneira uniforme quando têm comportamento semelhante.
- `Modificadores de Acesso:` Os modificadores de acesso, como private, protected, public, são usados adequadamente para controlar a visibilidade dos atributos e métodos em todas as classes. Por exemplo, os atributos são frequentemente declarados como private para proteger os dados, enquanto os métodos getters e setters são usados para acessar e modificar esses atributos de forma controlada.
- `Composição:` O sistema usa composição para criar relacionamentos entre objetos. Por exemplo, a classe BoaLeitura contém listas de objetos de diferentes classes, como estoque, funcionários, clientes e vendas. Essa composição permite que o sistema organize e gerencie esses objetos em conjunto.
- `Persistência de Dados:` O sistema implementa a persistência de dados em arquivos para manter registros seguros e recuperáveis. Isso é um exemplo de como a POO é usada para lidar com o armazenamento e a recuperação de dados de maneira organizada e eficiente.
- `Abstração:` A POO incentiva a abstração, ou seja, a representação de objetos do mundo real em classes que encapsulam seus atributos e comportamentos essenciais. Isso ajuda a modelar o mundo real de forma mais clara e facilita a criação de sistemas mais eficientes e compreensíveis.

## 🖊️ Classe Autor
A classe Autor é uma das classes principais do sistema de gerenciamento da livraria. Ela representa um autor de livros e herda da classe Pessoa, o que implica que um autor é uma pessoa com atributos específicos relacionados à autoria de livros. 

- `Herança:` A classe Autor herda da classe Pessoa. Isso significa que ela adquire todos os atributos e métodos da classe Pessoa e pode adicionar atributos e métodos específicos para representar um autor. A herança é uma forma de reutilização de código e reflete a relação "é um" entre um autor e uma pessoa.
- `Atributos:` A classe Autor possui os seguintes atributos:
  - int id: Este atributo representa o identificador único de um autor. Cada autor tem um ID único.
  - private String livro: Representa o livro escrito pelo autor. No entanto, pode haver várias instâncias dessa classe, cada uma representando um autor diferente com seu próprio livro.
  - private double precoLivro: Este atributo armazena o preço do livro escrito pelo autor.
- `Construtor:` A classe Autor possui um construtor que aceita parâmetros para inicializar seus atributos. Os parâmetros incluem id, nome, CPF, endereço e telefone, que são herdados da classe Pessoa. O construtor permite criar instâncias de autor com informações específicas.
- `Métodos:`
  - getNome(): Este método é uma sobrecarga do método getNome() da classe Pessoa. Ele retorna o nome do autor, precedido pela palavra "Autor", para indicar que se trata de um autor.
  - getId(): Retorna o ID único do autor.
  - setPreco(double preco): Este método permite definir o preço do livro escrito pelo autor.
  - getPreco(): Retorna o preço do livro escrito pelo autor.
  - getDescricao(): Retorna uma descrição do livro escrito pelo autor, incluindo o nome do autor e o título do livro.
- `Interface Vendavel:` A classe Autor implementa a interface Vendavel, o que significa que ela fornece implementações para os métodos definidos na interface. Isso permite que um autor seja tratado como um item vendável no sistema de gerenciamento da livraria.

## 📖 Classe Boa Leitura
A classe BoaLeitura é a classe principal do sistema de gerenciamento da livraria. Ela contém o método main, que é o ponto de entrada do programa. Esta classe é responsável por controlar o fluxo principal do sistema, incluindo o menu de interação com o usuário e a manipulação de dados relacionados aos livros, vendas, funcionários e estoque. 
Método main: O método main é o ponto de partida do programa. Ele contém um loop do-while que permite ao usuário interagir com o sistema por meio de um menu de opções. O loop continua até que o usuário escolha encerrar o programa (opção 6).

- `Atributos e Coleções:`
  - ArrayList<Livro> estoque: Esta coleção armazena objetos da classe Livro, representando o estoque de livros da livraria.
  - ArrayList<Funcionario> funcionarios: Esta coleção armazena objetos da classe Funcionario, representando os funcionários da livraria.
  - ArrayList<Cliente> clientes: Esta coleção armazena objetos da classe Cliente, representando os clientes da livraria.
  - ArrayList<Livro> vendas: Esta coleção armazena objetos da classe Livro, representando as vendas realizadas.
  - Path path_vendas e Path path_estoque: Esses objetos Path representam os caminhos para os arquivos físicos onde os dados de vendas e estoque são armazenados.
  - Leitura de Dados: A classe lê dados de estoque e vendas de arquivos físicos (como "estoque.txt" e "vendas.txt") e os carrega nas coleções correspondentes (estoque e vendas) durante a inicialização do programa. Isso permite que o sistema mantenha registros persistentes das operações.
- `Menu de Opções:` O programa exibe um menu de opções para o usuário, permitindo que ele escolha entre várias ações, como cadastrar um livro, registrar uma venda, verificar o histórico de vendas, verificar o estoque, limpar o arquivo de vendas e encerrar o programa.
O usuário seleciona uma opção digitando um número correspondente no console.
- `Funcionalidades Principais:`
  - Cadastrar Livro: Permite ao usuário cadastrar um novo livro, fornecendo informações como nome do livro, autor e editora. O livro é adicionado ao estoque.
  - Registrar uma Venda: Permite ao usuário registrar uma venda, escolhendo um livro do estoque para venda. O livro é removido do estoque e adicionado ao registro de vendas.
  - Verificar Histórico de Vendas: Exibe uma lista dos livros vendidos durante a sessão atual.
  - Verificar Estoque: Exibe uma lista dos livros disponíveis no estoque e a quantidade total.
  - Limpar Arquivo de Vendas: Limpa o arquivo de registro de vendas, permitindo começar um novo dia de vendas com um arquivo vazio.
- `Persistência de Dados:` Ao encerrar o programa, os dados do estoque e das vendas são escritos de volta nos arquivos físicos correspondentes. Isso garante que as informações sejam mantidas entre sessões de execução do programa.
Tratamento de Exceções: A classe lida com exceções, como erros de entrada e problemas ao ler ou gravar arquivos, garantindo uma experiência mais robusta para o usuário.

## 💰 Classe Cliente
A classe Cliente representa os clientes que frequentam a livraria. Ela contém informações sobre os clientes, como nome, CPF, endereço, telefone e um identificador único. 

- `Atributos:`
  - String nome: Armazena o nome do cliente.
  - String CPF: Armazena o número do CPF do cliente.
  - int id: Representa um identificador único para cada cliente.
  - String endereco: Armazena o endereço do cliente.
  - String telefone: Armazena o número de telefone do cliente.
- `Construtor:` A classe Cliente possui um construtor que aceita parâmetros para inicializar seus atributos. Os parâmetros incluem nome, CPF, id, endereço e telefone. Isso permite criar instâncias de clientes com informações específicas.
- `Método getNome():` Este método é uma sobrecarga do método getNome() da classe Pessoa, da qual Cliente herda. Ele retorna o nome do cliente, precedido pela palavra "Cliente", para indicar que se trata de um cliente.
- `Método getId():` Retorna o identificador único do cliente.
- `Método setId():` Permite definir o identificador único do cliente. Isso pode ser útil para atribuir ou modificar o identificador do cliente, por exemplo, ao criar uma nova instância de cliente.
- `Herança:` A classe Cliente herda atributos e métodos da classe Pessoa. Isso reflete a relação "é um" entre um cliente e uma pessoa, ou seja, um cliente é um tipo específico de pessoa com atributos adicionais relacionados ao cadastro na livraria.
- `Encapsulamento:` Os atributos da classe Cliente são encapsulados, o que significa que eles são privados (private) e só podem ser acessados e modificados por métodos públicos da classe, como os métodos getNome(), getId(), e setId(). Isso ajuda a proteger os dados do cliente e a manter a integridade dos atributos.

## 📗 Classe Editora
A classe Editora representa as editoras de livros que publicam os títulos vendidos na livraria. Ela armazena informações sobre as editoras, como nome, endereço e telefone. 

- `Atributos:`
  - int id: Representa um identificador único para cada editora.
  - String nome: Armazena o nome da editora.
  - String endereco: Armazena o endereço da editora.
  - String telefone: Armazena o número de telefone da editora.

- `Construtor:` A classe Editora possui um construtor que aceita parâmetros para inicializar seus atributos. Os parâmetros incluem id, nome, endereco e telefone. Isso permite criar instâncias de editoras com informações específicas.
- `Métodos getId() e setId():` Esses métodos permitem obter o identificador único da editora e definir um novo identificador, respectivamente. O identificador único é útil para identificar de forma exclusiva cada editora no sistema.
- `Métodos getNome(), getEndereco() e getTelefone():` Esses métodos retornam o nome, endereço e telefone da editora, respectivamente. Eles permitem acessar os detalhes da editora de forma controlada, seguindo o princípio de encapsulamento.
- `Métodos setNome(), setEndereco() e setTelefone():` Esses métodos permitem definir o nome, endereço e telefone da editora, respectivamente. Eles fornecem uma maneira de atualizar as informações da editora, seguindo as práticas de encapsulamento.
- `Herança e Encapsulamento:` A classe Editora não herda de outras classes além da classe Object padrão do Java. No entanto, ela encapsula informações importantes relacionadas à editora, tornando os atributos privados (private) e fornecendo métodos públicos para acessá-los e modificá-los. Isso protege os dados da editora e mantém a integridade dos atributos.

## 👨‍💼 Classe Funcionário
A classe Funcionario representa os funcionários da livraria, como vendedores, caixas, gerentes, etc. Ela armazena informações sobre os funcionários, incluindo nome, CPF, identificador único, endereço, telefone, função e data de contratação. 

- `Atributos:`
  - String nome: Armazena o nome do funcionário.
  - String CPF: Armazena o número do CPF do funcionário.
  - int id: Representa um identificador único para cada funcionário.
  - String endereco: Armazena o endereço do funcionário.
  - String telefone: Armazena o número de telefone do funcionário.
  - String funcao: Indica a função ou cargo do funcionário na livraria.
  - String dataContratacao: Armazena a data de contratação do funcionário.
- `Construtor:` A classe Funcionario possui um construtor que aceita parâmetros para inicializar seus atributos. Os parâmetros incluem nome, CPF, id, endereco, telefone, funcao e dataContratacao. Isso permite criar instâncias de funcionários com informações específicas.
- `Método getNome():` Este método é uma sobrecarga do método getNome() da classe Pessoa, da qual Funcionario herda. Ele retorna o nome do funcionário, precedido pela palavra "Funcionário", para indicar que se trata de um funcionário.
- `Método getId():` Retorna o identificador único do funcionário.
- `Método setId():` Permite definir o identificador único do funcionário. Isso pode ser útil para atribuir ou modificar o identificador do funcionário, por exemplo, ao criar uma nova instância de funcionário.
- `Método getFuncao():` Retorna a função ou cargo do funcionário na livraria.
- `Método setFuncao():` Permite definir a função ou cargo do funcionário. Isso pode ser usado para atualizar as informações do funcionário, como mudanças de cargo.
- `Método getDataContratacao():` Retorna a data de contratação do funcionário.
- `Método setDataContratacao():` Permite definir a data de contratação do funcionário. Isso é útil para registrar quando o funcionário foi contratado.
- `Herança e Encapsulamento:` A classe Funcionario herda atributos e métodos da classe Pessoa. Ela encapsula informações importantes relacionadas ao funcionário, tornando os atributos privados (private) e fornecendo métodos públicos para acessá-los e modificá-los. Isso protege os dados do funcionário e mantém a integridade dos atributos.

## 📚 Classe Livro
A classe Livro representa os livros disponíveis na livraria. Ela armazena informações sobre os livros, incluindo título, identificador único, autor, editora e preço. 

- `Atributos:`
  - String title: Armazena o título do livro.
  - int id: Representa um identificador único para cada livro.
  - String autor: Armazena o nome do autor do livro.
  - String editora: Armazena o nome da editora do livro.
  - double preco: Indica o preço do livro.

- `Construtor:` A classe Livro possui um construtor que aceita parâmetros para inicializar seus atributos. Os parâmetros incluem title, id, autor, editora e preco. Isso permite criar instâncias de livros com informações específicas.
- `Método getTitle():` Retorna o título do livro.
- `Método setTitle():` Permite definir o título do livro. Isso pode ser útil para atualizar as informações do livro, como mudanças de título.
- `Método getId():` Retorna o identificador único do livro.
- `Método setId():` Permite definir o identificador único do livro. Isso pode ser usado para atribuir ou modificar o identificador do livro, por exemplo, ao criar uma nova instância de livro.
- `Método getAutor():` Retorna o nome do autor do livro.
- `Método setAutor():` Permite definir o nome do autor do livro. Isso é útil para atualizar as informações do livro, como o autor.
- `Método getEditora():` Retorna o nome da editora do livro.
- `Método setEditora():` Permite definir o nome da editora do livro. Isso pode ser usado para atualizar as informações do livro, como a editora.
- `Método getPreco():` Retorna o preço do livro.
- `Método setPreco():` Permite definir o preço do livro. Isso é útil para atualizar o preço do livro, por exemplo, se houver alterações nos preços.
- `Herança e Implementação de Interface:` A classe Livro implementa a interface Vendavel. Isso significa que ela deve fornecer implementações para os métodos definidos na interface, como getPreco(). Além disso, a classe Livro não herda de outras classes específicas além da classe Object padrão do Java.
- `Encapsulamento:` Os atributos da classe Livro são encapsulados, o que significa que eles são privados (private) e só podem ser acessados e modificados por métodos públicos da classe, como os métodos getTitle(), getPreco(), setPreco(), etc. Isso ajuda a proteger os dados do livro e a manter a integridade dos atributos.

## 🧑 Classe Pessoa
A classe Pessoa é uma classe abstrata que serve como uma base para outras classes relacionadas a pessoas, como Autor, Cliente e Funcionario. Ela armazena informações comuns a todas essas classes, como nome, CPF, endereço e telefone, e fornece métodos básicos para acessar e modificar essas informações. 

- `Atributos:`
  - String nome: Armazena o nome da pessoa.
  - String CPF: Armazena o número do CPF da pessoa.
  - String endereco: Armazena o endereço da pessoa.
  - String telefone: Armazena o número de telefone da pessoa.
- `Construtor:` A classe Pessoa possui um construtor que aceita parâmetros para inicializar seus atributos. Os parâmetros incluem nome, CPF, endereco e telefone. Isso permite criar instâncias de pessoas com informações específicas.
- `Métodos getNome():` Retorna o nome da pessoa.
- `Método setNome():` Permite definir o nome da pessoa. Isso pode ser útil para atualizar as informações da pessoa, como mudanças de nome.
- `Método getCpf():` Retorna o número do CPF da pessoa.
- `Método setCpf():` Permite definir o número do CPF da pessoa. Isso é útil para atualizar as informações da pessoa, como um novo número de CPF.
- `Método getEndereco():` Retorna o endereço da pessoa.
- `Método setEndereco():` Permite definir o endereço da pessoa. Isso pode ser usado para atualizar o endereço da pessoa.
- `Método getTelefone():` Retorna o número de telefone da pessoa.
- `Método setTelefone():` Permite definir o número de telefone da pessoa. Isso é útil para atualizar as informações de contato da pessoa.
- `Classe Abstrata:` A classe Pessoa é uma classe abstrata, o que significa que não pode ser instanciada diretamente. Ela serve como um modelo para outras classes que representam diferentes tipos de pessoas, como autores, clientes e funcionários.
- `Herança:` As classes Autor, Cliente e Funcionario herdam atributos e métodos da classe Pessoa. Isso reflete a relação "é um" entre essas classes e uma pessoa genérica.
- `Encapsulamento:` Os atributos da classe Pessoa são encapsulados, o que significa que eles são privados (private) e só podem ser acessados e modificados por métodos públicos da classe, como os métodos getNome(), getCPF(), setTelefone(), etc. Isso ajuda a proteger os dados da pessoa e a manter a integridade dos atributos.

# 🏪 Interface Vendavel
A interface Vendável define um contrato para objetos que podem ser vendidos. Ela desempenha um papel importante na implementação do sistema de gerenciamento da livraria, onde objetos como Livro e Autor precisam ser tratados como itens vendáveis. 

- `Interface:` A interface Vendável é definida por meio da palavra-chave interface. Interfaces são usadas em POO para definir contratos que as classes devem seguir. Neste caso, a interface Vendável define três métodos que qualquer classe que a implemente deve fornecer: getPreco(), getDescricao(), e setPreco(double preco).
- `Métodos da Interface:`
  - getPreco(): Este método é responsável por retornar o preço do item vendável. É declarado sem uma implementação específica na interface, o que significa que as classes que implementam Vendável devem fornecer sua própria implementação desse método.
  - getDescricao(): Este método retorna uma descrição do item vendável. Assim como getPreco(), ele é declarado na interface sem uma implementação específica.
  - setPreco(double preco): Este método permite definir o preço do item vendável. Ele recebe um argumento do tipo double, que representa o novo preço a ser definido para o item. A implementação deste método também é deixada para as classes que implementam a interface.
- `Implementação nas Classes:` As classes Livro e Autor implementam a interface Vendável. Isso significa que elas devem fornecer uma implementação concreta para os métodos getPreco(), getDescricao(), e setPreco(double preco) conforme exigido pela interface.
  - Por exemplo, na classe Livro, o método getPreco() deve retornar o preço do livro, e o método getDescricao() retorna uma descrição do livro.
  - Na classe Autor, esses métodos também devem ser implementados, permitindo que objetos Autor sejam tratados como itens vendáveis no contexto do sistema.
- `Uso no Sistema:` O uso da interface Vendável permite que o sistema de gerenciamento da livraria trate objetos de diferentes classes, como Livro e Autor, de maneira uniforme quando eles são itens vendáveis. Por exemplo, ao adicionar um livro ao carrinho de compras ou exibir uma lista de itens vendáveis, o sistema pode usar os métodos definidos na interface Vendável para obter informações sobre os itens independentemente de sua classe específica.
