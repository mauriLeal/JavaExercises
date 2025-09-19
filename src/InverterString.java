import java.util.InputMismatchException;
import java.util.Scanner;

public class InverterString implements IExercicio {

    @Override
    public String getNome(){
        return "Inverter uma String";
    }

    public void executar(){

        Scanner scanner = new Scanner(System.in);

        String input = "";
        while (true) {
            System.out.println("-------Inversor de String!-------");
            System.out.println("Para encerrar, digite \"0\"");
            System.out.print("Escreva algo: ");
            input = scanner.nextLine();
                if (input.equals("0")) {
                    System.out.println("Programa encerrando...");
                    break;
                }

            input = inverteString(input);
            System.out.println("Sua string invertida é: "+ input);
        }

    }

    public static String inverteString(String input) {
        String invertida = new StringBuilder(input).reverse().toString();
        return invertida;
    }
}
