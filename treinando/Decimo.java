package treinando;

import java.util.Scanner;

public class Decimo {
    public static void main(String[] args){
        Scanner in = new Scanner( System.in);

        int Va[] = new int[10];
        int Vb[] = new int[10];


        System.out.print("\n");
        for( int i = 0; i <Va.length; i++){
            System.out.print("Digite os valores do Vetor A: ");
            Va[i] = in.nextInt();
        }

        System.out.print("\n");
        for(int i = 0; i< Vb.length; i++){
            System.out.print("Digite os valores do Vetor B: ");
            Vb[i] = in.nextInt();
        }

        for( int i =0;i< Va.length; i++){
            Va[i] = Vb[i] % 2;
        }

        System.out.print("\nNúmeros: ");
        for(int i: Va){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}
