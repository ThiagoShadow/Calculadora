package calc;

import java.util.Scanner;

public class Exe {

	public static void main(String[] args) {
		
		String op;

        while(true) {
        
        	System.out.println("1 = Adição");
        	System.out.println("2 = Subtração");
        	System.out.println("3 = Multiplicação");
        	System.out.println("4 = Divisão \n");
        
        	Scanner entrada = new Scanner(System.in);      
        	System.out.print("Escolha uma opção: \n");
        	op = entrada.nextLine();
       
        	switch (op) {		
        	case "1":
        		Scanner val1 = new Scanner(System.in);
        		System.out.println("Digite o primeiro valor: \n");
        		int v1 = val1.nextInt();		
        		System.out.println("Digite o segundo valor: \n");
        		int v2 = val1.nextInt();
        		System.out.println("Soma = " + Modulos.soma(v1, v2));
        		break;
        	case "2":
        		Scanner val2 = new Scanner(System.in);
        		System.out.println("Digite o primeiro valor: \n");
        		int v3 = val2.nextInt();		
        		System.out.println("Digite o segundo valor: \n");
        		int v4 = val2.nextInt();
        		System.out.println("Subtração =  " + Modulos.sub(v3, v4));
        		break;
        	case "3":
        		Scanner val3 = new Scanner(System.in);
        		System.out.println("Digite o primeiro valor: \n");
        		int v5 = val3.nextInt();		
        		System.out.println("Digite o segundo valor: \n");
        		int v6 = val3.nextInt();
        		System.out.println("Multiplicação =  " + Modulos.mul(v5, v6));
        		break;
        	case "4":
        		Scanner val4 = new Scanner(System.in);
        		System.out.println("Digite o primeiro valor: \n");
        		int v7 = val4.nextInt();
        		System.out.println("Digite o segundo valor: \n");
        		int v8 = val4.nextInt();
        		if (v8 != 0){
        		System.out.println("Divisão =  " + Modulos.div(v7, v8));
        		break;
        		}
        		else{
        			System.out.println("Não pode dividir por 0. \n");
        		break;
        		}
        	default:
        		System.out.println("Informe um valor válido. \n");
        		System.out.println("\n");
        	}
        }
	}
}
