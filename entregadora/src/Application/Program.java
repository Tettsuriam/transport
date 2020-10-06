package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entitis.Cliente;
import entitis.OrdemS;
import entitis.Ordium;
import entitis.Product;
import entitis.Enum.Ordem;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//Coleta de dados do cliente;
		
		System.out.println("Enter client data: ");
		System.out.print("\nName: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email =sc.nextLine();
		System.out.println("Birth date (dd/mm/yyyy): ");
		Date birth = sdf.parse(sc.next());
		
		
		Cliente cli = new Cliente(name, email, birth);
		
		// até aqui ok
		
		//AQUI INTRO E VALOR ORDEM
		System.out.println("\n\nEnter worker data:");
		Ordem ord = Ordem.valueOf("PROCESSANDO");
		
		Ordium urd = new Ordium(new Date(),ord,cli);
		
		//AQUI ENTRADA DO ITEM
		
		System.out.println("Quantos produtos diferentes serão? ");
		int pp = sc.nextInt();
		
		for(int i = 0; i<pp;i++) {
			
			System.out.print("\n\tPRODUTO #"+(i+1)+": ");
			System.out.println("\n\nnome do produto: ");
			
			String nprod = sc.nextLine();
			sc.nextLine();
			
			System.out.println("entre com o preco: ");
			Double preco = sc.nextDouble();
			
			System.out.println("Entre com a quantidade: ");
			Integer quant = sc.nextInt();
			
			Product pord = new Product (preco, nprod);
			
			OrdemS OrdiS = new OrdemS(preco, quant, pord, nprod);
			
			urd.addProduct(OrdiS);
			

		}
		
		
		System.out.println("\n\n\tPEDIDO\n");
		System.out.println(urd);
		
		
		
		sc.close();
		
		
	}


}
