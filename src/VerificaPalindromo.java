import java.util.Scanner;

public class VerificaPalindromo implements IExercicio {

    @Override
    public String getNome(){
        return "Verificar Palíndromo";
    }

    public void executar(){

        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("-----CHECAR PALÍNDROMO-----");
            System.out.println("Digite \"0\" para sair");
            System.out.print("Input: ");
            input = scanner.nextLine().replace(" ", "");
            boolean palindromo = ePalindromo(input);
            if (input.equals("0")) {
                break;
            }
            System.out.println(palindromo);
        }
    }
    public static boolean ePalindromo(String input){
        boolean palindromo = true;
        String reverso = new StringBuilder(input).reverse().toString().replace(" ", "");
        return input.equalsIgnoreCase(reverso) == palindromo;
    }
}