package treinando;

import java.util.Scanner;

public class DecimoPrimeiro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Va[] = new int[10];
        
        System.out.print("\n");
        for( int i = 0; i< Va.length; i++){
            System.out.print("Digite o valor do vetor: ");
            Va[i] = in.nextInt();
        }


        System.out.print("\n");
        System.out.print("Números pares: ");
        for(int i = 0; i<Va.length; i++){
            if(Va[i] % 2 == 0){
                System.out.print(Va[i] + " ");
            } 
        }
        System.out.print("\n");
    }
}
