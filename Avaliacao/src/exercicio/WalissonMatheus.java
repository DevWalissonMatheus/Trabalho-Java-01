package exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class WalissonMatheus {
    public static void main(String[] args) {

        /* Fiz o trabalho utilizando o VS Code 
        com o JDK na versão 19.0.2 */

        WalissonMatheus walisson = new WalissonMatheus();
        walisson.metodo1();
        walisson.metodo2();
        walisson.metodo3();

    }

    private void metodo1() {

        System.out.println("Sequência de Fibonacci");

        int num1 = 1;
        int num2 = 0;
        int numAnterior;

        for (int i = 0; i < 10; i++) {
            System.out.println(num1);
            numAnterior = num1;
            num1 = num1 + num2;
            num2 = numAnterior;
        }
        System.out.println("Método 1 encerrado!");
    }

    private void metodo2() {

        System.out.println("\nNúmero de Notas");

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor: ");
        int valor = sc.nextInt();
        System.out.println(valor / 10 + " notas de 10");
        valor = valor % 10;
        System.out.println(valor / 5 + " notas de 5");
        valor = valor % 5;
        System.out.println(valor / 2 + " notas de 2");
        valor = valor % 2;
        System.out.println(valor / 1 + " notas de 1");
        valor = valor % 1;

        System.out.println("Método 2 encerrado!\n");
        /* sc.close(); */
        /* Fiquei preso por mais de 1 hora achando
        que o método 3 estava errado por causa desse .close */
    }

    private void metodo3() {
        System.out.println("Nomes em ordem alfabética");
        Scanner sc1 = new Scanner(System.in);
        String nomes[] = new String[10];

        for (int i = 0; i <= 9; i++) {
            System.out.print("Insira o " + (i + 1) + "° nome: ");
            String dados = sc1.nextLine();
            nomes[i] = dados;
        }

        Arrays.sort(nomes);
        System.out.print("\nOs nomes ordenados ficaram assim:");

        for (int i = 0; i <= 9; i++) {
            System.out.print("\n" + nomes[i]);
        }
        System.out.print("\nMétodo 3 encerrado!");
    }
}
