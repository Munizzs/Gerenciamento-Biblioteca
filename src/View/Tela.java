package View;

import java.util.Scanner;

public class Tela {
    
    public Scanner sc = new Scanner(System.in);
    
    public void informacoesLivro(){
        
        System.out.println("Digite o titulo:");
        String titulo = sc.nextLine();
        
        System.out.println("Digite o titulo:");
        String autor = sc.nextLine();
        sc.nextLine();
        
        System.out.println("Digite a quantidade de copias:");
        int numeroCopias = sc.nextInt();
        
    }
}
