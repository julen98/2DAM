package ejerciciosPropuestos567;

import java.util.Scanner;
import java.util.Stack;

public class RPN {
    private Stack <Integer> stack;

    public RPN() {
        stack = new Stack <>();
    }

    protected void vaciarStack() {
        stack.clear();
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
    	String expresion, repetir = "";
    	int resultado;
  		RPN evaluador = new RPN();
  		
  		do {
	  		evaluador.vaciarStack();
	  		System.out.println("Introduce la expresion: ");
	  		expresion = teclado.nextLine();
	  		
	  		resultado = evaluador.calc(expresion);
	        System.out.println("\nResultado: " + resultado);
	        System.out.println("Quieres volver a hacer otra operacion? [S/N]");
	        repetir = teclado.nextLine();
	        
  		} while (repetir.equalsIgnoreCase("S"));
    }
    
    public int calc (String expresion) {
    	@SuppressWarnings("resource")
		Scanner parser = new Scanner (expresion);
    	String token;
    	int num1, num2, resultado = 0;
    	
    	while (parser.hasNext()) {
    		token = parser.next();
    		
    		if (esOperador(token)) {
    			num2 = (stack.pop()).intValue();
    			num1 = (stack.pop()).intValue();
    			resultado = evaluadorOperador(token.charAt(0), num1, num2);
    			stack.push(Integer.valueOf(resultado));
    		} else {
    			stack.push(Integer.valueOf((Integer.parseInt(token))));
    		}
    	}
    	
    	return resultado;
    }
    
    public boolean esOperador (String token) {
    	if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("%")) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public int evaluadorOperador(char operacion, int num1, int num2) {
        int resultado = 0;

        if (operacion == '+')
            	resultado = num1 + num2;
        if (operacion == '-')
            	resultado = num1 - num2;
        if (operacion == '*')
            	resultado = num1 * num2;
        if (operacion == '/')
            	resultado = num1 / num2;
        if (operacion == '%')
            	resultado = num1 % num2;
        
        return resultado;
    }
}