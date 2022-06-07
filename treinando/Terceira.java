package treinando;

import java.util.Scanner;

public class Terceira {
    public static void main(String[] args){
        int Va[] = new int[15];
        int Vb[] = new int[15];

        Scanner in = new Scanner(System.in);

        System.out.print("\n");
        for(int i = 0; i< Vb.length; i++){
            System.out.print("Digite o Valor do vetor: ");
            Va[i] = in.nextInt();
        }

        for(int i = 0; i< Vb.length; i++){
            Vb[i] = Va[i] * Va[i];
        }

        System.out.print("\nNúmeros ao quadrado: ");
        for(int i: Vb){
            System.out.print(i + " ");
        }
        System.out.println("\n");

    }
}
