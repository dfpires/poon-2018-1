package fatec.exe1;
public class Testa {
    
    public static void contribui(Contribuinte camaleao){
        System.out.println(camaleao.declaraIR() + " " + 
                camaleao.pagaIR());
    }
    
    public static void cidadao(Cidadao camaleao){
        System.out.println(camaleao.tiraIdentidade() + " " + 
                camaleao.vota());
    }
    
    public static void main(String[] args) {
        
        Brasileiro pele = new Brasileiro("23455", 93);
        
        Americano jordan = new Americano("34556", 46);
        
        contribui(pele); contribui(jordan); 
        cidadao(pele); cidadao(jordan);
        
    }
    
}
