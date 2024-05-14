package EstruturaSequencial;

import java.util.*;

public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da área do quadrado");
        double area = sc.nextDouble();

        double dobro = area * 2;

        System.out.format("O dobro do valor informado é %.2f", dobro);

        sc.close();

    }
}
