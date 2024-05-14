package EstruturaSequencial;

import java.util.*;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe a primeira nota:");
        double primeiraNota = sc.nextDouble();

        System.out.println("Por favor, informe a segunda nota:");
        double segundaNota = sc.nextDouble();

        System.out.println("Por favor, informe a terceira nota:");
        double terceiraNota = sc.nextDouble();

        System.out.println("Por favor, informe a quarta nota:");
        double quartaNota = sc.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
        System.out.format("A media das notas informadas foi %.2f", media);

        sc.close();

    }
}
