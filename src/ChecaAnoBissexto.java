import java.util.Scanner;

public class ChecaAnoBissexto implements IExercicio{

    @Override
    public String getNome(){
        return "Checa se um ano é Bissexto";
    }

    public void executar(){

        Scanner scanner = new Scanner(System.in);


        while (true) {

            int ano = inicializador(scanner);
            if (ano == -1){
                System.out.println("Programa encerrando...");
                break;
            }

            boolean eBissexto = checaAnoBissexto(ano);

            if (eBissexto){
                System.out.printf("O ano %d é bissexto!", ano);
        } else {
                System.out.printf("O ano %d NÃO é bissexto!", ano);
            }
        }

    }

    public static int inicializador(Scanner scanner){
        int ano;

        System.out.println("\nCHECADOR DE ANO BISSEXTO!");
        System.out.println("Digite um ano para checagem:");
        ano = scanner.nextInt();
        if (ano == 0){
            return -1;
        }
        return ano;
    }

    public static boolean checaAnoBissexto(int ano){
        return (ano % 4 == 0 && ano % 100 != 0 || (ano % 400 == 0));
    }

}
