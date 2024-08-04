import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class adivinhacao {
    public static void main(String[] args) {
        int tentativas = 1;
        int numeroSorteado =  new Random().nextInt(10);

        Scanner scanner = new Scanner(System.in);
            while(tentativas <= 5) {
                System.out.print("Digite um numero entre 0 e 10");
                int numeroEscolhido = scanner.nextInt();

                if (numeroEscolhido == numeroSorteado) {
                    ++tentativas;
                    System.out.println("Parabéns, você acertou o número sorteado");
                    break;
                } else {
                    ++tentativas;
                    if(numeroEscolhido > numeroSorteado) {
                        System.out.println("o Numero sorteado é menor");

                    }
                    else {
                        System.out.println("o Numero sorteado é maior");
                    }
                    if(tentativas == 5){
                        System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroSorteado);
                    }

                }
            }


        }





    }

