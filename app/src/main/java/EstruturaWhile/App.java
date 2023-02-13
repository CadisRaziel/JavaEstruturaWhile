package EstruturaWhile;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int totalAlunos = 10;
        Scanner leitor = new Scanner(System.in);
        while (totalAlunos > 0) {
            System.out.print("Digite o nome do aluno: ");

            String nomeAluno = leitor.nextLine();
            int idadeAluno = leitor.nextInt();

            System.out.println("O nome do aluno é: " + nomeAluno
                    + "E sua idade é : " + idadeAluno);
          totalAlunos--;
        }
          

    }
}
