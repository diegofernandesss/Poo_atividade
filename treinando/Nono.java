package treinando;

import java.util.Scanner;

public class Nono {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int Va[] = new int[10];
        int Vb[] = new int[10];
        float Vc[] = new float[10];


        System.out.print("\n");
        for(int i = 0; i < Va.length; i++){
            System.out.print("Digite o Valor do vetor A: ");
            Va[i] = in.nextInt();
        }

        System.out.print("\n");
        for(int i = 0; i < Vb.length; i++){
            System.out.print("Digite o Valor do vetor B: ");
            Vb[i] = in.nextInt();
        }
        
        for(int i = 0; i < Vc.length; i++){
            Vc[i] = Va[i] / Vb[i];
        }

        System.out.print("\nNúmeros: ");
        for(float i: Vc){
            System.out.print(i + " ");
        }
        System.out.print("\n");


    }
}
