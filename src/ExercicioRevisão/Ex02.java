package ExercicioRevisão;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[]gbf){
        int val_fol;
        double rsl = 0;

        Scanner sc = new Scanner(System.in);
        val_fol = sc.nextInt();

        if(val_fol <= 100){
            rsl = val_fol*0.25;
        }if(val_fol > 100){
            rsl = val_fol*0.20;
        }
        System.out.println(rsl);
    }
}
