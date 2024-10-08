import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa = 0;
        boolean adivinhou = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("tente adivinhar o número entre 1 e 100.");

        while (!adivinhou){
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();

            if (tentativa <1 || tentativa >100){
                System.out.println("Por favor digite um número entre 1 e 100:  ");
            }  else if (tentativa < numeroSecreto){
                System.out.println("Muito baixo! Tente novamente!");

            } else if (tentativa > numeroSecreto){
                System.out.println("Muito alto! Tente novamente!");

            } else {
                adivinhou = true;
                System.out.println("Parabéns! Você adivinhou o número:  " + numeroSecreto);;
            }
        }
             scanner.close();


        }
    }
