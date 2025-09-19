import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MediaArray implements IExercicio {

    @Override
    public String getNome(){
        return "Média dos elementos de um Array";
    }

    public void executar(){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero = 0;

        System.out.println("-----BUSCA INDICE POR NÚMERO-----");
        System.out.println("(Digite 0 para finalizar o array e conseguir a média!)");

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

        double resultado = mediaArray(numeros);
        System.out.printf("A media entre %s é: ", numeros);
        System.out.print("\n===============================");
        System.out.printf( "\n=============%.2f==============", resultado);
        System.out.println("\n===============================");
    }

    public static double mediaArray(ArrayList<Integer> numeros){

        double media = 0;
        for (int i = 0; i < numeros.size(); i++) {
            media += numeros.get(i);
        }
        return media / numeros.size();
    }
}