package EstruturaCondicional;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe F - Feminino ou M - Masculino: ");
        char letra = sc.next().charAt(0);

        if (letra == 'F' || letra == 'f') {
            System.out.println("Feminino");
        } else if (letra == 'M' || letra == 'm') {
            System.out.println("Masculino");
        } else {
            System.out.println("Letra inválido");
        }
    }
}
