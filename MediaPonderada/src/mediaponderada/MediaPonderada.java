package mediaponderada;

/*
2) Faça um algoritmo para calcular e exibir a média ponderada de 2 notas. As notas devem ser
 solicitadas ao usuário. O peso para cálculo deve ser o seguinte

60% para primeira nota
40% para os trabalhos (segunda nota)

Fórmula da média ponderada:
*/

import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

       double nota1,nota2,trabalho1,trabalho2,total;

    System.out.print("1 nota: ");

    nota1 = sc.nextDouble();

    System.out.print("trabalho: ");

    nota2 = sc.nextInt();

    double n1 = nota1 * 6;
    double trab = nota2 * 4;

    total = (n1+trab)/10;

    System.out.print("\nResultado : ");
    System.out.print( total);
    System.out.println("\n");

}
}