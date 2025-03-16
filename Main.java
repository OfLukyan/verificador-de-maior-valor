import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("quantos números vão ser somados?");

        int valor1, valor2, valor3;
        System.out.println("digite 3 números para avaliar entre os 3 qual o maior");
        valor1 = entrada.nextInt();
        valor2 = entrada.nextInt();
        valor3 = entrada.nextInt();
        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("o valor 1 que representa o número: "+ valor1 +", e o maior");
        } else if (valor2 > valor1 && valor2 >valor3) {
            System.out.println("o valor 2 que representa o número: "+ valor2 +", e o maior");
        } else {
            System.out.println("o valor 3 que representa o número: "+ valor3 +", e o maior");
        }


        entrada.close();
    }
}