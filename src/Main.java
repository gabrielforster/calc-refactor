import operations.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do{
            System.out.println("Qual operação você deseja realizar?\n"
                + "1 - Soma\n"
                + "2 - Subtração\n"
                + "3 - Divisão\n"
                + "4 - Multiplicação\n"
                + "5 - Potenciação\n"
                    + "6 - Raiz Quadrada\n"
                    + "7 - Porcentagem\n"
                    + "8 - Sair da calculadora"
            );

            int option = scanner.nextInt();
            int quantityOfNumbers;

            switch (option) {
                case(1): {
                    Sum calc = new Sum();
                    System.out.println("Quantos números você deseja somar?");
                    quantityOfNumbers = scanner.nextInt();
                    ArrayList<Integer> numList = new ArrayList();

                    for (int i = 0; quantityOfNumbers > i; i++){
                        System.out.println("Digite um número a ser somado:");
                        numList.add(scanner.nextInt());
                    }

                    calc.doTheSum(numList);

                    System.out.println("Resultado: " + calc.getResult());
                    break;
                }
                case(2): {
                    Subtraction calc = new Subtraction();
                    System.out.println("Quantos números você deseja subtrair?");
                    quantityOfNumbers = scanner.nextInt();
                    ArrayList<Integer> numList = new ArrayList();

                    for (int i = 0; quantityOfNumbers > i; i++){
                        System.out.println("Digite um número a ser subtraido:");
                        numList.add(scanner.nextInt());
                    }

                    calc.doTheSubtraction(numList);

                    System.out.println("Resultado: " + calc.getResult());
                    break;
                }
                case(3):{
                    System.out.println("Primeiro digite o valor a ser dividido e depois por qual quer dividir:" +
                            "Número a ser dividido: ");
                    double divider = scanner.nextDouble();
                    System.out.println(divider + " dividido por: ");
                    double dividend = scanner.nextDouble();

                    Division calc = new Division(divider, dividend);

                    System.out.println("Resultado: " + calc.getResult());
                    break;
                }
                case(4):{
                    Multiplication calc = new Multiplication();
                    System.out.println("Quantos números você deseja multiplicar?");
                    quantityOfNumbers = scanner.nextInt();
                    ArrayList<Integer> numList = new ArrayList();

                    for (int i = 0; quantityOfNumbers > i; i++){
                        System.out.println("Digite um número a ser multiplicado:");
                        numList.add(scanner.nextInt());
                    }

                    calc.doTheMultiplication(numList);

                    System.out.println("Resultado: " + calc.getResult());
                    break;
                }
                case(5):{
                    System.out.println("Primeiro digite o valor a ser elevado, e depois a potência:" +
                            "Número a ser elevado: ");
                    double base = scanner.nextDouble();
                    System.out.println(base + " elevado á: ");
                    double potency = scanner.nextDouble();

                    Potentiation calc = new Potentiation(base, potency);

                    System.out.println("Resultado: " + calc.getResult());
                    break;
                }
                case(6): {
                    SquareRoot calc = new SquareRoot();
                    System.out.println("Qual número você deseja descobrir a raiz quadrada?");

                    calc.doTheSquareRoot(scanner.nextDouble());

                    System.out.println("Resultado: " + calc.getResult());
                    break;
                }
                case(7): {
                    System.out.println("Digite o total e depois a sua quantidade." +
                            "Total: ");
                    double total = scanner.nextDouble();
                    System.out.println("Sua quantidade: ");
                    double amount = scanner.nextDouble();

                    Percentage calc = new Percentage(total, amount);

                    System.out.println("Resultado: " + calc.getResult() + "%");
                    break;
                }
                case(8):{
                    System.out.println("Saindo da calculadora");
                    System.exit(0);
                }
                default: {
                    System.out.println("Opção escolhida não existe, BURRO!\n");
                    break;
                }
            }
        }while(true);
    }
}
