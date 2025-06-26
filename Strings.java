public class Strings {
    public static void main(String[] args){
        String senha = "ABC";

        if (senha.length() > 3){
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida. Tamanho: "+senha.length());
        }

        System.out.println("LowerCase: "+senha.toLowerCase());
        System.out.println("UppserCase: "+senha.toUpperCase());
        System.out.println("NormalCase: "+senha);

//localizar caracteres
    String texto = "Hoje e terça-feira";
    
        System.out.println(texto.indexOf("terça"));

//concatenar
    String nome = "Marcelo";
    String sobrenome = "Petri";
     System.out.println(nome+" "+sobrenome);
     System.out.println(nome.concat(" ").concat(sobrenome));      

     String num1 = "10";
     String num2 = "20" ;

     System.out.println(num1+num2);

     System.out.println("Hoje esta fazendo \"calor\" e frio");
     System.out.println("Hoje esta fazendo \t\tcalor\t\t e frio");
     System.out.println("Hoje esta fazendo \ncalor e frio");
     
    }
}