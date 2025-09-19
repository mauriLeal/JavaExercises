import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoFatorial implements IExercicio{

    @Override
    public String getNome(){
        return "Calcula quanto é um Número !Fatorial";
    }

    public void executar(){
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n------CALCULO FATORIAL------");
            System.out.println("Digite 0 para encerrar o programa");
            System.out.print("Digite um número para cálculo: ");
            try {
                int numero = scanner.nextInt();
                if(numero == 0){
                    System.out.println("Programa encerrando...!");
                    break;
                }
                long[] resultado = calculaFatorial(numero);

                System.out.printf("%d fatorial é igual a %d", numero, resultado[1]);
            }
            catch (InputMismatchException e){
                System.out.println("Programa encerrando...!");
                break;
            }

        }
    }

    public static long[] calculaFatorial(int numero){


        long novoNumero = 1;
        for (int i = numero; i > 0; i--){
            novoNumero *= i;
        }

        long[] retorno = new long[2];

        retorno[0] = numero;
        retorno[1] = novoNumero;
        return retorno;
    }

}
