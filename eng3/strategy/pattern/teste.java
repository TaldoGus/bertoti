public class teste {
    
    public static void main(String[] args) {

        
        Animal baleia = new Animal("Baleia Azul");

        baleia.setMovimento(new Nadar());

        baleia.mover();
    
    }

}