package treinando;

import java.util.Scanner;

public class Quarta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Va[] = new int[15];
        double Vb[] = new double[15];

        System.out.print("\n");
        for(int i = 0; i< Vb.length; i ++){
            System.out.print("Digite os números do vetor: ");
            Va[i] = in.nextInt();
        }

        for(int i = 0; i < Vb.length; i++){
            double raiz= Math.sqrt(Va[i]);
            Vb[i] = raiz;
        }   
        
        System.out.print("\nNúmeros raiz quadrada: ");
        for(double i: Vb){
            System.out.printf("%.2f  ", i);
        }
        System.out.print("\n");
    }
}
