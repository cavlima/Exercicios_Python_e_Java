package EstruturaCondicional;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valorUm = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valorDois = sc.nextInt();


        if (valorUm > valorDois) {
            System.out.println("O primeiro valor é maior");
        } else if (valorDois > valorUm) {
            System.out.println("O segundo valor é maior");
        } else {
            System.out.println("Os valores são iguais");
        }

        sc.close();

    }
}
