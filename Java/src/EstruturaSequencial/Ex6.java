package EstruturaSequencial;

import java.util.*;

public class Ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.format("A area do círculo é %.4f", area);

        sc.close();

    }
}
