package treinando;

import java.util.Scanner;

public class DecimoSegundo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Va[] = new int[10];
        int soma = 0;

        System.out.print("\n");
        for( int i = 0; i< Va.length; i++){
            System.out.print("Digite o valor do Vetor: ");
            Va[i] = in.nextInt();
        }

        for(int i = 0; i< Va.length; i++){
            soma += Va[i];
        }

        System.out.println("\nTotal: " + soma);
    }
}
