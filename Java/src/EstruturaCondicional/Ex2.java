package EstruturaCondicional;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe um número: ");
        int valor = sc.nextInt();

        if (valor > 0) {
            System.out.println("O número informado é positivo");
        } else if (valor < 0) {
            System.out.println("O número informado é negativo");
        } else {
            System.out.println("O número informado é zero");
        }

        sc.close();


    }
}
