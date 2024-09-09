package beecrowdUni4;

import java.util.Scanner;

public class Uri1041 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorX = teclado.nextDouble();
        double valorY = teclado.nextDouble();
        if (valorX == 0 && valorY == 0) {
            System.out.println("Origem");
        } else {
            if (valorX > 0 && valorY > 0) {
                System.out.println("Q1");
            } else {
                if (valorX < 0 && valorY > 0) {
                    System.out.println("Q2");
                } else {
                    if (valorX < 0 && valorY < 0) {
                        System.out.println("Q3");
                    } else {
                        if (valorX > 0 && valorY < 0) {
                            System.out.println("Q4");
                        } else {
                            if (valorX == 0) {
                                System.out.println("Eixo Y");
                            } else {
                                if (valorY == 0) {
                                    System.out.println("Eixo X");
                                }
                            }
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}
