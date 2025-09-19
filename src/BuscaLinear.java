import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BuscaLinear implements IExercicio {

    @Override
    public String getNome(){
        return "Busca por Índice do Número requisitado no Array";
    }

    public void executar(){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero = 0;

        System.out.println("-----BUSCA INDICE POR NÚMERO-----");
        System.out.println("(Digite 0 para finalizar o array e pesquisar o Índice)");

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

        System.out.println("Digite um desses números: "+ numeros);
        int inputNumero = scanner.nextInt();
        int indicePedido = buscaIndice(numeros, inputNumero);
        if (indicePedido == -1){
            System.out.println("O valor digitado não foi encontrado dentro da lista. Tente novamente.");
        } else {
            System.out.printf("O número digitado foi encontrado no indice %d ", indicePedido);
        }
        System.out.print("\nPrograma encerrado...");


    }

    public static int buscaIndice(ArrayList<Integer> numeros, int inputNumero){

        for (int i = 0; i < numeros.size(); i++) {
            if (inputNumero == numeros.get(i)) {
                return i;
            }
        }
        return -1;
    }
}
