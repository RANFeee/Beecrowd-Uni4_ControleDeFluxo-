package beecrowdUni4;

import java.util.Scanner;

public class Uri1046 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horaI = teclado.nextInt();
        int horaF = teclado.nextInt();
        int duracao;
        if (horaI == horaF) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            if (horaF > horaI) {
                duracao = horaF - horaI;
                System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
            }else{
                duracao = (24 - horaI) + horaF;
                System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
            }
        }
        teclado.close();
    }
}
