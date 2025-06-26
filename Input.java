import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in); //instancia de uma classe (Classe --> objeto)
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: "+nome);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Seu nome é "+nome+" e você tem "+idade+" anos.");

        //saída de informação
        System.out.println("Happy Happy Happy");
        System.out.println("Está MUITO frio");
    }
    
}