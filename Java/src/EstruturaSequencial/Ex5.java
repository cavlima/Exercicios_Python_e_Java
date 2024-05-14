package EstruturaSequencial;

import java.util.*;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em metros:");
        double valor = sc.nextDouble();

        double centimetros = valor * 100;

        System.out.format("O valor em centímetros é %.2f", centimetros);

        sc.close();
    }
}
