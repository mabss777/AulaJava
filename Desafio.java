import java.util.Scanner;
public class Desafio {
    public static void main(String[] args){

         int numeroAleatorio = (int)(Math.random()*1001);
         int numeroDigitado = 0;
         int tentativas = 0;
        do {
            
            Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 0 a 100: ");
         numeroDigitado = scanner.nextInt();
         tentativas = tentativas + 1;
        
         if (numeroDigitado < numeroAleatorio){
            System.out.println("Humm, acho que é um numero maior que esse! Tente novamente: ");
             
         } else if (numeroDigitado > numeroAleatorio){
            System.out.println("Humm, acho que é um numero menor que esse! Tente novamente: ");
         
         }
             
        } while (numeroDigitado != numeroAleatorio);

        System.out.println("\t\tVOCE ACERTOU! O NUMERO ERA: "+numeroAleatorio+" \t\t \n\t\tPARA BEINS\t\t Voce tentou: "+tentativas+" vezes.");


        

         
    }
}