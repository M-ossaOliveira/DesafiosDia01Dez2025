import java.util.Scanner;
import java.lang.String;

public class ContadorDeCaracteres {
    public static void main(String[] args) {

        Scanner L = new Scanner(System.in);
        char bucaCaractereDesejado;
        String conjuntoDeCaracteres;
        int contador=0;//quantas vezes meu char aparece na String

        System.out.println("Digite sua String");
        conjuntoDeCaracteres=L.nextLine();
        System.out.println("Digite o char desejado / trata-se de case sensitive");
        System.out.println("Não computará maiúsculo e minúsculo ao mesmo tempo");
        bucaCaractereDesejado=L.next().charAt(0);
        L.close();
        for (int i=0;i<conjuntoDeCaracteres.length();i++){
            if (conjuntoDeCaracteres.charAt(i)==bucaCaractereDesejado){
                contador+=1;
            }
        }
        System.out.println("O caracter "+bucaCaractereDesejado+" aparece "+contador+ " vezes na String");

    }
}
