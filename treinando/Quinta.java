package treinando;

import java.util.Scanner;

public class Quinta {
    public static void main(String[] args) {

        int Va[] = new int[10];
        int Vb[] = new int[10];

        Scanner in = new Scanner(System.in);

        System.out.println("\n");
        for(int i = 0; i <Vb.length; i++){
            System.out.print("Digite os números do Vetor: ");
            Vb[i] = in.nextInt();
        }

        for(int i = 0; i< Vb.length; i++){
            Va[i] = Vb[i] * i;
        }

        System.out.print("\nNúmeros: ");
        for(int i: Va){
            System.out.print(i + " ");
        }
        System.out.println("\n");

    }
}
