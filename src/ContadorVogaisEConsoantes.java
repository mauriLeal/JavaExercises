import java.util.Scanner;

public class ContadorVogaisEConsoantes implements IExercicio {

    @Override
    public String getNome(){
        return "Número de Vogais e Consoantes de uma String";
    }

    public void executar(){

        Scanner scanner = new Scanner(System.in);

        String input;

        while (true) {

                System.out.println("-----CONTADOR DE VOGAL/CONSOANTE-----");
                System.out.print("Digite algo:");
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("sair")){
                System.out.println("Programa encerrando...");
                break;
                }

            int[] resultado = contaVogalConsoante(input);
            System.out.println("O número de vogais é: " + resultado[0]);
            System.out.println("O número de consoantes é: " + resultado[1]);
        }
    }

    public static int[] contaVogalConsoante(String input){

        int consoante= 0;
        int vogal = 0;
        input.toLowerCase();
        for(int i = 0; i < input.length(); i++){
            char caractere = input.charAt(i);
            if (Character.isLetter(caractere)) {
                if (caractere == ('a') || caractere == ('e') || caractere == ('i') || caractere == ('o') || caractere == ('u')) {
                    vogal++;
                } else {
                    consoante++;
                }
            }
        }

        int[] result = new int[2];
        result[0] = vogal;
        result[1] = consoante;
        return result;
    }
}
