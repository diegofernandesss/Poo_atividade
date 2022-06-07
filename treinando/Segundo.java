package treinando;

import java.util.Scanner;

public class Segundo {

    public static void main(String[] args){
        int Va[] = new int[8];
        int Vb[] = new int[8];

        Scanner in = new Scanner(System.in);

        System.out.print("\n");
        for(int i = 0; i< Va.length; i++){
            System.out.print("Adicionar Número: ");
            Va[i] = in.nextInt();
        }

        for(int i = 0; i< Va.length; i++){
            Va[i] = Va[i]*2;
            Vb[i] = Va[i];
        }

        System.out.print("\nNúmeros: ");
        for(int i: Va){
            System.out.print(i + " ");
        }
        System.out.print("\n");

    }
    
}
