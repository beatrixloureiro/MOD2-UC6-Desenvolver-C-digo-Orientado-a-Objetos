package javabeaatividade1;

import java.util.Scanner;

public class JAVABeaAtividade1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // Solicitação do número de convidados
        System.out.println("Informe o número de convidados do evento:");
        int convidados = scanner.nextInt();
        //Verificação do número de convidados = Convidados inválidos 
        if (convidados > 350 || convidados < 0) {
            System.out.println("Numero de convidados inválido");
    
// Escolha do auditório adequado 
        //Auditorio Alfa
        } else if (convidados <= 150) {
            System.out.println("Use o auditorio Alfa");
        //Auditorio Alfa + Cadeiras
        } else if (convidados <= 220) {
            System.out.println("Use o auditorio Alfa");
            System.out.println("Inclua mais " + (convidados - 150) + " cadeiras");
        //Auditorio Beta
        } else {
            System.out.println("Use o auditório Beta");
        }
    }
}