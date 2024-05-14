package EstruturaSequencial;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe um número:");
        int primeiroNumero = sc.nextInt();

        System.out.println("Por favor, informe o segundo número:");
        int segundoNumero = sc.nextInt();

        int soma = primeiroNumero + segundoNumero;
        System.out.println("A soma dos dois números informados foi " + soma);

        sc.close();

    }
}
