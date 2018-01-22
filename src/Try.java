import static java.lang.System.out;
import java.util.Scanner;
import java.text.NumberFormat;

public class Try {

    public static void main(String[] args){
        
    @SuppressWarnings("serial")
    class ExcecaoNumeroMuitoGrande extends Exception {
        
    }
        
        Scanner tecla = new Scanner(System.in);
        
        out.print("Favor, digite um numero ? ");
        String numIn = tecla.next();
 
    try  {
       int num = Integer.parseInt(numIn);
       
       if (num > 100) {
          throw new ExcecaoNumeroMuitoGrande();
       }
       
       if (num != Integer.parseInt(numIn)) {
          throw new ExcecaoNumeroMuitoGrande();
       }
     
       out.println("Numero escolhido é acessível!");
    }
       
    catch (NumberFormatException e) {
        out.println("Essa inserção não é válida");
    }
    
    catch (Exception e) {
        out.println("Número muito grande");
    }
    out.println("Finaliza aqui");
       
    }
}   

    

