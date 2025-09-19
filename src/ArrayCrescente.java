import java.util.*;

public class ArrayCrescente implements IExercicio{

    @Override
    public String getNome(){
        return "Array em ordem crescente";
    }

    public void executar(){
        System.out.println("ARRAY EM ORDEM CRESCENTE!");
        System.out.println("(Digite 0 para parar e ordenar)");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero = 0;

        while (true) {
            System.out.print("Digite um número: ");
            try {
                numero = scanner.nextInt();
            } catch (InputMismatchException a) {
                System.out.println("Apenas números são aceitos. Tente novamente.");
                scanner.nextLine();
                break;
            }
            if (numero == 0) break;
            numeros.add(numero);
        }

        System.out.println("Lista original: " + numeros);
        ArrayList<Integer> listaOrdenada = arrayCrescente(numeros);
        System.out.println("Lista ordenada: " + listaOrdenada);

    }

    public static ArrayList<Integer> arrayCrescente(ArrayList<Integer> numeros){

        Collections.sort(numeros);

        return numeros;
    }
}
