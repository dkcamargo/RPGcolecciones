public class TestReceta {
    public void ejecutarTests () {
        testRecetaPrecheck();
    }
    
    public void testRecetaPrecheck() {
        try {
            Receta receta = new Receta("voladora");
            receta.addIngrediente("Pluma");
            System.out.println(receta.toString());
            
            receta.addIngrediente("Sangre");
            receta.addIngrediente("Hueso");
            System.out.println(receta.toString());
            
            receta.cerrarReceta();
            System.out.println(receta.toString());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
