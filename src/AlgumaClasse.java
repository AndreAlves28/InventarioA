import static java.lang.System.out;

class AlgumaClasse {
    public int meuCampo = 10;
}

class AlgumaOutraClasse {
    
    public static void main(String[] args) {
        AlgumaClasse algumObjeto = new AlgumaClasse();
        
        //Isto funciona:
        out.println(algumObjeto.meuCampo);
    }
    
}
