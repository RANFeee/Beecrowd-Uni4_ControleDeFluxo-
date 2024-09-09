package beecrowdUni4;

import java.util.Scanner;

public class Uri1042 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();
        int valor3 = teclado.nextInt();

        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println(valor1);
            if (valor2 < valor3) {
                System.out.println(valor2);
                System.out.println(valor3 + "\n");
            }else{
                System.out.println(valor3);
                System.out.println(valor2 + "\n");
            } 

        } else if (valor2 < valor1 && valor2 < valor3){
                System.out.println(valor2);
             if (valor1 < valor3) {
                System.out.println(valor1);
                System.out.println(valor3 + "\n");
            } else {
                System.out.println(valor3);
                System.out.println(valor1 + "\n");
            }
        } else {
            System.out.println(valor3);
            if (valor1 < valor2){
                System.out.println(valor1);
                System.out.println(valor2 + "\n");
            } else {
                System.out.println(valor2);
                System.out.println(valor1 + "\n");
            }
        } 

        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        teclado.close();

    }
}
