import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      // ENUNCIADO
      
      //Escreva um código que deve imprimir a tabela de multiplicação desse algum número fornecido, 
      //e deve exibir um cabeçalho com o nome Tabela de multiplicação de X, 
      //onde X é o número a ser multiplicado.
      
      Scanner input = new Scanner(System.in);
      System.out.println("Digite um número para ser multiplicado:");
      
      int number = input.nextInt();
      System.out.println("Tabela de multiplicação de" + " " + number);

      int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

      for(int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i] * number);
      }


    }
}
