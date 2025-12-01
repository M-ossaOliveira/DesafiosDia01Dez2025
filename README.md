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
