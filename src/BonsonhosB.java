import static java.lang.System.out;

public class BonsonhosB {

    public static void main(String[] args) {
        out.print("Com lincença, vou tirar ");
        out.println("uma soneca por dez segundos...");
        
        try {
           tirarSoneca();
            
        } catch (InterruptedException e) {
            out.println("Ei, quem me acordou ?!");
        }
        
        out.println("Ah, que rivigorante !");
    }
    
   static void tirarSoneca() throws InterruptedException {
       Thread.sleep(10000);
   }
}

