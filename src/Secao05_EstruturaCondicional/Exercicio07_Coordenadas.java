package Secao05_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio07_Coordenadas {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double x,y;
     System.out.println("De as cordenadas de x(horizontal) e y(vertical)");
     x = sc.nextDouble();
     y = sc.nextDouble();
     /*
      *              q2|q1
      *              -----
      *              q3|q4
      * 
      * */
     if(x ==0 && y ==0) System.out.println("Eixo de origem(centro)");
     else if(x != 0 && y == 0) System.out.println("Eixo X");
     else if(x == 0 && y != 0)System.out.println("Eixo y");
     else if(x > 0 && y > 0) System.out.println("Q1");
     else if(x < 0 && y > 0) System.out.println("q2");
     else if(x > 0 && y < 0) System.out.println("Q4");
     else if(x < 0 && y < 0) System.out.println("q3");
    sc.close();
	}
	
}
