import static java.lang.System.out;
import java.util.Scanner;
import java.text.NumberFormat;

public class InventarioC {

    public static void main(String[] args) {
        
        @SuppressWarnings("serial")
        class ExcecaoForaDoPadrao extends Exception {
        }
        
         final double precoCaixa = 3.25;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        out.print("Quantas caixas ainda temos ?");
        String numCaixasIn = keyboard.next();
        
        try {
            int numCaixas = Integer.parseInt(numCaixasIn);
            
            if (numCaixas < 0) {
                throw new ExcecaoForaDoPadrao();
            }
            
            out.print("O valor é ");
            out.println(currency.format(numCaixas * precoCaixa));
        }
        
        catch (NumberFormatException e) {
            out.println("Isto não é um número!");
            
        }
        
        catch (ExcecaoForaDoPadrao e) {
            out.print(numCaixasIn);
            out.print("? Isto é impossivel");
        }
       
    }

 
}
