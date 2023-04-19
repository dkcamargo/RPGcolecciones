public class TesteCaldero {
    public void ejecutarTests () {
        testCalderoPrecheck();
    }
    
    public void testCalderoPrecheck() {
        try {
            Caldero caldero = new Caldero("Caldero chico",5);
            
            System.out.println(caldero.toString());
            
            Receta receta = new Receta("voladora");
            receta.addIngrediente("Pluma");
            receta.addIngrediente("Sangre");
            receta.addIngrediente("Hueso");
            receta.cerrarReceta();
            
            caldero.setReceta(receta);
            
            System.out.println(caldero.toString());
            
            caldero.addIngrediente(new Elemento("Pluma", 1));
            
            System.out.println(caldero.getIngredientesFaltantes());
            
            caldero.addIngrediente(new Elemento("Hueso", 1));
            caldero.addIngrediente(new Elemento("Sangre", 1));
            caldero.prepararPocima();
            
            System.out.println(caldero.toString());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
