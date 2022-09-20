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
                    Soma calc = new Soma();
                    System.out.println("Quantos números você deseja somar?");
                    quantityOfNumbers = scanner.nextInt();
                    ArrayList<Integer> numList = new ArrayList();

                    for (int i = 0; quantityOfNumbers > i; i++){
                        System.out.println("Digite um número para somar");
                        numList.add(scanner.nextInt());
                    }

                    calc.doTheSum(numList);

                    System.out.println("Resultado: " + calc.getResult());
                    break;
                }
                case(2): {

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
