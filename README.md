Desafio 1: Refatoração de Sintaxe e Semântica – O "Organizador de Código"
Motivação: "Um código limpo é um código feliz e eficiente." A sintaxe correta e a semântica clara tornam seu código fácil de ler e manter.
O Desafio:
Pegue um dos exercícios que você já fez (como o 1, 2, 3 ou 4 da sua lista de exercícios) e refatore-o com foco total nas boas práticas:
1.	Nomes Significativos: Garanta que todas as variáveis, métodos e classes tenham nomes autoexplicativos (ex: numeroDeAlunos em vez de numA).
2.	Comentários Úteis: Remova comentários óbvios (// Loop para...) e adicione comentários apenas onde a lógica é complexa ou abstrata.
3.	Indentação e Formatação: Use a formatação padrão do IntelliJ/Eclipse para garantir um estilo consistente.
4.	Uso de final: Marque variáveis que não mudam após a inicialização como final.
Objetivo: Seu código deve ser tão legível que uma pessoa que nunca viu o exercício entenda a lógica apenas lendo os nomes.

__________________
Desafio 2: Métodos Eficientes e Encapsulamento (P.O.O. - Parte 1)
Motivação: "A excelência não é um ato, mas um hábito." Métodos bem definidos e o encapsulamento correto protegem seus dados e facilitam a manutenção.
O Desafio:
Crie uma classe simples chamada ContaBancaria.
•	Use variáveis privadas (private double saldo, private String titular).
•	Crie métodos públicos (public void depositar(double valor), public void sacar(double valor)) para manipular esses dados.
•	Implemente getters e setters (se necessário, de forma controlada) e garanta que o método sacar valide se há saldo suficiente antes de permitir a operação.
Objetivo: Dominar o encapsulamento, garantindo que os dados internos da classe só possam ser acessados de forma controlada através de métodos.
_________________
Desafio 3: Herança – A "Biblioteca Digital" (P.O.O. - Parte 2)
Motivação: "Não reinvente a roda. Construa sobre ombros de gigantes." A herança permite reutilizar código e modelar relações do mundo real (é-um).
O Desafio:
Aprimore o seu exercício 5 ("Livros"):
1.	Crie uma classe base abstrata chamada ItemBiblioteca com atributos comuns como titulo, anoPublicacao, e métodos como emprestar() e devolver().
2.	Crie duas classes filhas que herdam de ItemBiblioteca: LivroFisico e Ebook.
3.	LivroFisico pode ter um atributo extra localizacaoPrateleira.
4.	Ebook pode ter um atributo extra formatoArquivo.
Objetivo: Usar a palavra-chave extends e entender como atributos e métodos são compartilhados entre classes relacionadas.
________________________________________
Desafio 4: Polimorfismo e Interfaces – O "Controle Universal" (P.O.O. - Parte 3)
Motivação: "A flexibilidade é a chave para a adaptabilidade e o sucesso a longo prazo." Polimorfismo permite que objetos de classes diferentes sejam tratados de forma uniforme.
O Desafio:
Crie uma Interface chamada AcaoVeiculo com métodos acelerar(), frear(), e ligar().
1.	Implemente essa interface em duas classes distintas: Carro e Moto.
2.	Na sua classe principal (Main), crie uma lista genérica de List<AcaoVeiculo>.
3.	Adicione instâncias de Carro e Moto a essa mesma lista.
4.	Percorra a lista com um for-each e chame o método acelerar() para cada item.
Objetivo: Observar como o mesmo comando (acelerar()) executa comportamentos diferentes dependendo do objeto real em tempo de execução (polimorfismo).
________________________________________
Desafio 5: Aplicando Generics e Wildcards – O "Gerenciador Flexível"
Motivação: "Ouse ir além da sua zona de conforto. É lá que a magia acontece." Este desafio aborda exatamente o ponto onde você teve dúvidas!
O Desafio:
Crie uma classe GerenciadorObjetos<T> que pode armazenar e gerenciar qualquer tipo de objeto (indicado por T).
1.	Ela deve ter um método adicionar(T item) e um método listarTodos().
2.	No seu método principal, crie um GerenciadorObjetos<Livro> e um GerenciadorObjetos<Aluno>.
3.	Em seguida, crie um método estático separado que aceite uma lista usando um coringa delimitado (? extends ItemBiblioteca ou ? super Ebook) para processar itens de forma flexível.
Objetivo: Solidificar o entendimento de como usar T para criar classes reutilizáveis e como os coringas (?) oferecem flexibilidade de tipo.

