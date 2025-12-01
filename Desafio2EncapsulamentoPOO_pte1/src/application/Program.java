package application;

import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("Maria Silva",3003,1000.00,100.00,5.0);
        ContaPoupanca cp = new ContaPoupanca("Joao Jose", 1111,2000.00,100.00,0.01);

        //Aqui mostrará o saldo da conta poupança com taxa de 0.01 por 12 meses
        System.out.println(cp.rendimentoAposXMeses(12));


        //Aqui imprimirá o valor de saldo restanten após tentar efetuar um saque
        // nas contas poupança e corrente respectivamente
        System.out.println(cp.ImprimeSaldo(100.00));
        System.out.println(cc.ImprimeSaldo( 50.00));;

    }
}
