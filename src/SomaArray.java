import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SomaArray implements IExercicio {
    //Soma de Elementos em um Array: Escreva um programa que some todos os elementos de um array de inteiros.

    @Override
    public String getNome(){
        return "Somar elementos de Array";
    }

    @Override
    public void executar()  {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;

        System.out.println("-----SOMA ARRAY-----");

        while (true) {

            try {
                System.out.println("\nSua lista atual: " + numeros);
                System.out.print("Digite o próximo número: ");
                numero = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Letras não são aceitas nesse programa. Tente novamente.");
                scanner.nextLine();
                continue;

            }
            if(numero == 0){
                int resultado = somaArray(numeros);
                System.out.printf("A soma dos elementos do array de %s, é igual a %d. \n", numeros, resultado);
                break;
            }
            numeros.add(numero);

        }
        System.out.println("Programa encerrado...");
    }


    public static int somaArray (ArrayList<Integer> numeros){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        return soma;
        }
}
