import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SalãoPrincipal  {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        List<IExercicio> meusExercicios = new ArrayList<>();

        meusExercicios.add(new ArrayCrescente());
        meusExercicios.add(new BuscaLinear());
        meusExercicios.add(new CalculoFatorial());
        meusExercicios.add(new ChecaAnoBissexto());
        meusExercicios.add(new InverterString());
        meusExercicios.add(new MaiorDoArray());
        meusExercicios.add(new MediaArray());
        meusExercicios.add(new SomaArray());
        meusExercicios.add(new VerificaPalindromo());
        meusExercicios.add(new RemoveArrayDuplicado());

        while (true){
            System.out.println("SEJA BEM VINDO AO SALÃO PRINCIPAL!");
            System.out.println("Aqui você pode acessar e testar qualquer um dos meus exercícios.");
            for (int i = 0; i < meusExercicios.size(); i++){
                System.out.printf("%d. %s%n", i + 1, meusExercicios.get(i).getNome());
            }
            System.out.println("0. Sair");
            System.out.print("> ");

            int escolha = scanner.nextInt();

            if (escolha == 0){
                break;
            }

            if (escolha > 0 && escolha <= meusExercicios.size()){
                IExercicio exercicioEscolhido = meusExercicios.get(escolha - 1);
                exercicioEscolhido.executar();
                try{
                    System.out.print("Digite enter para continuar");
                    Thread.sleep(2500);
                    System.out.print(".");
                    Thread.sleep(2500);
                    System.out.print(".");
                    Thread.sleep(2500);
                    System.out.print(".");
                    Thread.sleep(2500);

                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println("Opção Inválida. Tente novamente.");
            }

            System.out.println("\nAté a próxima!");
        }

    }
}
