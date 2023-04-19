public class TesteBolsa {
    public void ejecutarTests () {
        testBolsaPrecheck();
    }
    
    public void testBolsaPrecheck() {
        try {
            Bolsa bolsa = new Bolsa("Mochila",50);
            
            System.out.println("Peso libre: " + bolsa.getPesoLibre());
            
            Elemento e = new Elemento ("Hueso", 1);
            bolsa.addElemento(e);
            e = new Elemento ("Espada", 10);
            bolsa.addElemento(e);
            
            System.out.println("Peso libre: " + bolsa.getPesoLibre());
            System.out.println(bolsa.getElementosEnLaBolsa());
            
            bolsa.delElemento("Hueso");
            
            System.out.println("Peso libre: " + bolsa.getPesoLibre());
            System.out.println(bolsa.getElementosEnLaBolsa());
        }
            catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
