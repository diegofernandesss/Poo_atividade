package treinando;

import java.util.Scanner;

public class Oitavo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Va[] = new int[10];
        int Vb[] = new int[10];
        int Vc[] = new int[10];

        System.out.print("\n");
        for(int i = 0; i< Va.length; i++){
            System.out.print("Digite os valores do Vetor A: ");
            Va[i] = in.nextInt();
        }

        System.out.print("\n");
        for(int i = 0; i< Vb.length; i++){
            System.out.print("Digite os Valores do vetor B: ");
            Vb[i] = in.nextInt();
        }

        for(int i = 0; i< Va.length; i++){
            Vc[i] = Va[i] * Vb[i];
        }

        
        System.out.print("\n");
        System.out.print("Números: ");
        for(int i: Vc){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}

