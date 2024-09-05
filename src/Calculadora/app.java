package Calculadora;
import java.util.Scanner;

public class app {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            boolean continuar = true;

            while (continuar) {
                System.out.println("Menu:\n[1] Adição\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[5] Módulo\n[6] Sair\n");
                System.out.println("O que você deseja? ");
                int opcao = lerOpcao(input);

                switch (opcao) {
                    case 1:
                        adicao(input);
                        break;
                    case 2:
                        subtracao(input);
                        break;
                    case 3:
                        multiplicacao(input);
                        break;
                    case 4:
                        divisao(input);
                        break;
                    case 5:
                        modulo(input);
                        break;
                    case 6:
                        System.out.println("Deseja mesmo sair? (s/n)");
                        String sair = input.next();
                        if (sair.equalsIgnoreCase("s")) {
                            continuar = false;
                            break;
                        }else{
                            System.out.println("Continuando...");
                            continue;
                        }
                    default:
                        System.out.println("Opção inválida... Tente de novo...");
                }
            }
        }
        //módulo -> Lê e valida se o valor digitado é um numero inteiro
        private static int lerOpcao (Scanner input) {
            try {
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro ao ler. Por favor, tente novamente...");
                return lerOpcao(input);
            }
        }

        // módulo -> adição
        private static void adicao (Scanner input) {
           int num1 = lerNumero(input, "Digite o primeiro número: ");
           int num2 = lerNumero(input, "Digite o segundo número: ");
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        // módulo -> Subtração
        private static void subtracao (Scanner input) {
           int num1 = lerNumero(input, "Digite o primeiro número: ");
           int num2 = lerNumero(input, "Digite o segundo número: ");
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        //módulo -> Multiplicação
        private static void multiplicacao (Scanner input) {
           int num1 = lerNumero(input, "Digite o primeiro número: ");
           int num2 = lerNumero(input, "Digite o segundo número: ");
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        //módulo -> Divisão
        private static void divisao (Scanner input) {
           int num1 = lerNumero(input, "Digite o primeiro número: ");
           int num2 = lerNumero(input, "Digite o segundo número: ");
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        //Módulo
        private static void modulo (Scanner input) {
           int num1 = lerNumero(input, "Digite o primeiro número: ");
           int num2 = lerNumero(input, "Digite o segundo número: ");
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        }

        //valida se o número digitado é inteiro ou não ( dentro das operações )
        private static int lerNumero(Scanner input, String mensagem) {
            try {
                System.out.println(mensagem);
                return Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Erro ao ler número...");
                return lerNumero(input, mensagem);
            }
        }
}

