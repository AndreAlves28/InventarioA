import static java.lang.System.out;
import java.util.Scanner;
import java.text.NumberFormat;

public class InventarioD {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("serial")
        class ExcecaoNumeroMuitGrande extends Exception {
        
    }
    
        final double precoCaixa = 3.25;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        out.print("Quantas caixas ainda temos ?");
        int numCaixasIn = keyboard.nextInt();
    
    try {
        if (numCaixasIn > 100) {
            throw new ExcecaoNumeroMuitGrande();
        } 
        
        if (numCaixasIn < 100) {
            out.println("O número de caixas hoje é: " + numCaixasIn);
            out.println("Estoque tem em média: " + precoCaixa * numCaixasIn);
        }
    }
    
    catch (ExcecaoNumeroMuitGrande e) {
        out.println("Número excedeu o permitido.");
    }
    
    out.println("Verificação realizada com sucesso.");
    
    }
}
