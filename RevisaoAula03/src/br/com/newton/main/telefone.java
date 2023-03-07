package br.com.newton.main;

import java.util.Scanner;

import br.com.newton.agenda.contato;

public class telefone extends contato{
	
    public telefone(String nome, String telefone) {
		super(nome, telefone);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de telefone: ");
        String telefone = scanner.nextLine();

        if (telefone.length() != 9) {
            System.out.println("Telefone inválido");
        } else {
            contato Contato = new contato(nome, telefone);
            System.out.println("Contato adicionado: " + Contato.getNome() + " - " + Contato.getTelefone());
        }

        scanner.close();
    }
}
