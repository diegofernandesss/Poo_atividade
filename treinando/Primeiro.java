package treinando;

import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args){
        int Va[] = new int[5];
        int Vb[] = new int[5];
        Scanner in = new Scanner(System.in);

        System.out.println("\n");
        for(int i = 0; i< Va.length; i++){
            System.out.print("Informe o número A: ");
            Va[i] = in.nextInt();
        }

        System.out.println("\n");
        for(int i = 0; i< Vb.length; i++){
            System.out.print("Informe o número B: ");
            Vb[i] = in.nextInt();
        }

        System.out.print("\nNúmeros iguais: ");
        for(int i= 0; i< Va.length; i++){
            if(Va[i] == Vb[i]){
                System.out.print(Va[i]+ " ");
            } 
        }
        System.out.print("\n");

    }
}
