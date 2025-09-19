import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorDoArray implements IExercicio{

    @Override
    public String getNome(){
        return "Maior elemento de um Array";
    }

    public void executar(){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero = 0;

        System.out.println("MAIOR DA LISTA");
        System.out.println("(Digite 0 para parar e calcular)");

        while (true) {
            System.out.println("Sua lista: "+  numeros);
            System.out.print("Digite um número: ");
            try {
                numero = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Resposta inválida. Digite um número!");
                scanner.nextLine();
                continue;
            }
            if (numero == 0){
                break;
            }

            numeros.add(numero);


        }


        int[] resultado = maiorDoArray(numeros);
        System.out.printf("O maior número do array é: %d. ", resultado[0]);
        System.out.printf("Ele foi o %dº dígitado", resultado[1]+1);

        System.out.println("\nPrograma encerrado...");

    }

    public static int[] maiorDoArray(ArrayList<Integer> numeros) {


        int maiorNumero = numeros.get(0);
        int indiceMaior = 0;

        for (int i = 1; i < numeros.size(); i++) {
            int numeroAtual = numeros.get(i);

            if (numeroAtual > maiorNumero){
                maiorNumero = numeroAtual;
                indiceMaior = i;
            }
        }
        System.out.println(maiorNumero + " " + indiceMaior);
        return new int[] {maiorNumero, indiceMaior};
    }
}
