import static java.lang.System.out;

public class BomSonhoA {
    
    public static void main(String[] args) {
        out.print("Com linceça vou tirar ");
        out.println("uma soneca por cinco segundos...");
        
        tirarSoneca();
        
        out.println("Ah, que revigorante.");
    }
    static void tirarSoneca() {
        try {
            Thread.sleep(5000);
        
        } catch (InterruptedException e) {
            out.println("Ei, quem me acordou ?!");
        }
    }
    
}
