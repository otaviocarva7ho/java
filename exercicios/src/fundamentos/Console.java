package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        // print() imprime sem quebrar a linha
        System.out.print("Bom");
        System.out.print(" dia!\n\n");

        // println() imprime e quebra a linha automaticamente
        System.out.println("Bom");
        System.out.println("dia!");

        // printf() permite formatar a saída
        // %d = inteiro
        System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);

        // %.1f = número decimal com 1 casa após a vírgula
        System.out.printf("Salário: %.1f\n", 1234.5678);

        // formatted() é outra forma de formatar Strings (Java 15+)
        System.out.println("Nome: %s\n".formatted("João"));

        // Scanner permite ler dados digitados pelo usuário
        Scanner entrada = new Scanner(System.in);

        // nextLine() lê uma linha inteira digitada
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        // nextInt() lê um número inteiro
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        // %n quebra de linha de forma padrão para qualquer sistema operacional
        System.out.printf("Olá %s %s, você tem %d anos.%n", nome, sobrenome, idade);

        // fechar o Scanner
        entrada.close();
    }
}
