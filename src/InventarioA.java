import static java.lang.System.out;
import java.util.Scanner;
import java.text.NumberFormat;

public class InventarioA {

    public static void main(String[] args) {
        
        final double precoCaixa = 3.25;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        out.print("Quantas caixas ainda temos ?");
        String numCaixaIn = keyboard.next();
        
        try {
            int numCaixa = Integer.parseInt(numCaixaIn);
        
            out.print("O valor é ");
            out.println(currency.format(numCaixa * precoCaixa));
        
        } catch (NumberFormatException e) {
            out.println("Mensagem: ***" + e.getMessage() + "***");
            e.printStackTrace();
    }

    }
    
}
