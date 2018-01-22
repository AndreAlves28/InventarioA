import static java.lang.System.out;

public class DemoFinally {

    public static void main(String[] args) {
        
        try {
            FazAlgo();
            
        } catch (Exception e) {
            out.println("Exceção capturada em main");
        }

    }
    
    static void FazAlgo() {
        try {
            out.println(0 / 0);
        } catch (Exception e) {
            out.println("Exceção capturada em FazAlgo");
            out.println(0 / 0);
        } finally {
            out.println("Serei mostrada");
        }
        
        out.println("Não serei mostrada");
    }
}
