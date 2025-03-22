import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        int numOperacao = -1;
        float num1, num2;

        while (numOperacao != 0) {
            System.out.println("Digite o número da opreção desejada:");
            System.out.println("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Potência\n6-Raiz quadrada\n0-Sair");
            numOperacao = sc.nextInt();

            if (numOperacao < 4 && numOperacao > 0) {
                System.out.print("Digite o primeiro número: ");
                num1 = sc.nextFloat();
                System.out.print("Digite o segundo número: ");
                num2 = sc.nextFloat();

                calc.setNumber1(num1);
                calc.setNumber2(num2);

                switch (numOperacao) {
                    case 1 -> System.out.printf("%.2f + %.2f = %.2f\n", calc.getNumber1(), calc.getNumber2(), calc.sum());
                    case 2 -> System.out.printf("%.2f - %.2f = %.2f\n", calc.getNumber1(), calc.getNumber2(), calc.sub());
                    default -> System.out.printf("%.2f x %.2f = %.2f\n", calc.getNumber1(), calc.getNumber2(), calc.multiplication());
                }
            }else if (numOperacao == 4) {
                System.out.print("Digite o divisor: ");
                num1 = sc.nextFloat();
                System.out.print("Digite o dividendo: ");
                num2 = sc.nextFloat();

                calc.setNumber1(num1);
                calc.setNumber2(num2);

                try {
                    System.out.printf("%.2f / %.2f = %.2f\n", calc.getNumber1(), calc.getNumber2(), calc.division());
                } catch (ArithmeticException e) {
                    System.out.println("Não é possível dividir por zero!");
                }
            }else if (numOperacao == 5) {
                System.out.print("Digite a base: ");
                num1 = sc.nextFloat();
                System.out.print("Digite o expoente: ");
                num2 = sc.nextFloat();

                calc.setNumber1(num1);
                calc.setNumber2(num2);

                System.out.printf("%.2f ^ %.2f = %.2f\n", calc.getNumber1(), calc.getNumber2(), calc.pow());
            }else if (numOperacao == 6) {
                System.out.print(("Digite o número: "));
                num1 = sc.nextFloat();

                calc.setNumber1(num1);

                System.out.printf("A raiz quadrada de %.2f é %.2f\n", calc.getNumber1(), calc.sqrt());
            }
        }

        sc.close();
    }
}