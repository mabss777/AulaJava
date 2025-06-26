import java.util.Scanner;
public class ArraysExemplo3 {

    public static void main(String[] args){
        String[] alunos = new String[5];
        double[] media = new double[5];
        double[][] notas = new double[5][4];
        double soma = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5; i++){

            System.out.println("Digite o nome do aluno "+ (i+1)+": ");
            alunos[i] = scanner.nextLine();
        
            soma = 0;        
            for(int y=0; y < 4; y++){
            System.out.println("Digite a nota "+(y+1)+" do aluno "+alunos[i]+": ");
            notas[i][y] = scanner.nextDouble();
            soma = soma + notas[i][y];
        }     

            scanner.nextLine();

            media[i] = soma / 4;
        }
        
        System.out.println("Resultados: ");
        System.out.println("------------------------------------------");
        
        System.out.println("\n--- Boletim dos Alunos ---");
        for (int i = 0; i < 5; i++) { // Novo laço pra percorrer cada aluno e mostrar os dados.

            System.out.print(alunos[i] + " - Notas: "); //Mostra o nome do aluno.
            
            for (int j = 0; j < 4; j++) { //Mostra as 4 notas do aluno
                System.out.print((notas[i][j])+" ");
            }
            System.out.println("| Media: " + media[i]); // Mostra a média
        }

    }
}