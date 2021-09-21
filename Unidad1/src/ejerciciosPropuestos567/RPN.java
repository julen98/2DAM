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
        Scanner teclado = new Scanner(System.in);
    	String expresion;
    	int resultado;
  		RPN evaluador = new RPN();
  		
  		evaluador.vaciarStack();
  		System.out.println("Introduce la expresion: ");
  		expresion = teclado.nextLine();
  		
  		resultado = evaluador.calc(expresion);
        System.out.println();
        System.out.println("Resultado: " + resultado);

    }
    
    public int calc (String expresion) {
    	Scanner parser = new Scanner (expresion);
    	String token;
    	int operador1, operador2, resultado = 0;
    	
    	while (parser.hasNext()) {
    		token = parser.next();
    		
    		if (esOperador(token)) {
    			operador2 = (stack.pop()).intValue();
    			operador1 = (stack.pop()).intValue();
    			resultado = evaluadorOperador(token.charAt(0), operador1, operador2);
    		} else {
    			stack.push(new Integer(Integer.parseInt(token)));
    		}
    	}
    	
    	return resultado;
    }
    
    public boolean esOperador (String token) {
    	return (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("%"));
    }
    
    public int evaluadorOperador(char operacion, int operador1, int operador2) {
        int resultado = 0;

        if (operacion == '+')
            	resultado = operador1 + operador2;
        if (operacion == '-')
            	resultado = operador1 - operador2;
        if (operacion == '*')
            	resultado = operador1 * operador2;
        if (operacion == '/')
            	resultado = operador1 / operador2;
        if (operacion == '%')
            	resultado = operador1 % operador2;
        
        return resultado;
    }
}