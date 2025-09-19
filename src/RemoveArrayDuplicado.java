import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveArrayDuplicado implements IExercicio {

    @Override
    public String getNome(){
        return "Remover duplicatas em Array.";
    }

    @Override
    public void executar(){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;

        while(true){
            System.out.println("-----REMOVER DUPLICATAS DE ARRAY-----");
            System.out.println("Digite 0 para encerrar a lista");

            System.out.print("Digite os números: ");
            System.out.println("Sua lista atual: "+ numeros);
            try{
                numero = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Palavras não são aceitas. Tente novamente");
                scanner.nextLine();
                continue;
            }
            if (numero == 0){
                break;
            }
            numeros.add(numero);

        }

        ArrayList<Integer> arrayNovo = removerElementos(numeros);
        System.out.println("O Array anterior era:"+ numeros);
        System.out.println("O Array atual é: "+ arrayNovo);
        System.out.println("O Array atual em ordem crescente é "+ ArrayCrescente.arrayCrescente(arrayNovo));
        System.out.println("Programa encerrado...");

    }

    public static ArrayList<Integer> removerElementos(ArrayList<Integer> numeros){

        return new ArrayList<>(new LinkedHashSet<>(numeros));
    }
}
