package beecrowdUni4;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float valor = teclado.nextFloat();
        if (valor >= 0 && valor <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        } else {
            if (valor > 25.00000 && valor <= 50.0000000) {
                System.out.println("Intervalo (25,50]");
            } else {
                if (valor > 50.0000000 && valor <= 75.0000000) {
                    System.out.println("Intervalo (50,75]");
                } else {
                    if (valor > 75.0000000 && valor <= 100.0000000) {
                        System.out.println("Intervalo (75,100]");
                    } else {
                        System.out.println("Fora de intervalo");
                    }
                }
            }
        }


        teclado.close();
    }
}
