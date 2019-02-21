package ExercicioRevisão;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[]gbf){
        int cont=0;
        double[]notas = new double[4];
        double soma=0, media;

        while(cont<4){
            Scanner sc = new Scanner(System.in);
            notas[cont] = sc.nextDouble();

            soma += notas[cont];
            cont++;
        }
        media = soma/4;
        System.out.println(media);
    }
}
