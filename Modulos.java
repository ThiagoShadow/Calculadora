package calc;

public class Modulos {
	
	// Adição:
	
	public static int soma(int v1, int v2) {
		return (v1 + v2);
	}
	public static int soma(String v1, String v2) {
		int resultado = Integer.parseInt(v1) + Integer.parseInt(v2);
		return resultado;
	}
		
	// Subtração:
		
	public static int sub(int v3, int v4) {
		return (v3 - v4);
				
	}
	public static int sub(String v3, String v4) {
		int resultado = Integer.parseInt(v3) - Integer.parseInt(v4);
		return resultado;
	}
	
	// Multiplicação:
	
	public static int mul(int v5, int v6) {
		return (v5 * v6);
	}
	public static int mul(String v5, String v6) {
		int resultado = Integer.parseInt(v5) * Integer.parseInt(v6);
		return resultado;
	}
	
	// Divisão
	
	public static int div(int v7, int v8) {
		return (v7 / v8);
	}
	public static int div(String v7, String v8) {
		int resultado = Integer.parseInt(v7) / Integer.parseInt(v8);
		return resultado;
	}
}