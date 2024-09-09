package beecrowd2;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();
        boolean condicao1 = B > C;
        boolean condicao2 = D > A;
        boolean condicao3 = (C + D) > (A + B);
        boolean condicao4 = C > 0 && D > 0;
        boolean condicao5 = A % 2 == 0;
        if (condicao1 && condicao2 && condicao3 && condicao4 && condicao5) {
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
        teclado.close();
    }
}
