package AulacomJava;

import java.util.Scanner;
import java.util.scaner;



public class Aula { 
    public static void main(String[] args) {
        System.out.println("Um novo começo ");

    /*Forma mais comun de declarar uma variavel */  
    int idade = 20; 

    /* Segunda forma de declarar uma variavel  */
      double Primeriosalario = 2500.95; 
       int salarioInteiro = (int) Primeriosalario; 

      System.out.println("O salario inteiro é: " + salarioInteiro );  

    /*Esse modelo chamado de Typecast
     *onde o tipo de variavel que fica dentro dos
     *parentes formaça uma mudanca de tipo de variavel
     */

    
    /* Terceira forma de declarar uma variavel com objetos */
    Scanner Pessoa = new Scanner(System.in); 
      System.out.println("Digite o nome do funcionario: ");  
        String nome = Pessoa.nextLine();
      System.out.println("Digite a idade do funcionario: ");  
        int idade4 = Pessoa.nextInt();
      System.out.println("O nome do funcionario é: " + nome + " e a idade é: " + idade4);
    /*
     *Esse modelo de Classe é chamado de Wrapper, que representa um objeto  
     *que encapsula um tipo de dado primitivo.  
     */

    /* Declarando variavel em Flout */
      Float SegundoSalario = 4600.5f;
       System.out.println ("O Segundo salario do funcionario com uma casa decimal é: " + SegundoSalario );
       System.out.printf("O Segundo salario do funcionario com duas casas decimais é: %.2f%n", SegundoSalario);
       System.out.format("O Segundo salario do funcionario Com cinco casas decimais é: %.5f%n", SegundoSalario);
    /*
     *Quando declarada a variavel em Float, Precisa colocar o f no final dos numeros. 
     *Junto também tem 3 possibilidades de imprimir o valor da variavel,
     *sendo elas: System.out.println, System.out.printf e System.out.Format
     */ 

    /* Classes involucras */
      int quantidade = 5;
      String Pessoas = Integer.toString(quantidade); 
      String Pessoas2 = "5";
      int quantidade2 = Integer.parseInt(Pessoas2);
    /*Usado para fazer trocas de Tipos de variaveis de Numericos para string */ 
    }    
}