public class Animal implements Movimentacao{

    public String nome;
    public Movimentacao movimento;

    public void setMovimento(Movimentacao movimento){

        this.movimento = movimento;

    }

    public Animal(String nome){
        
        this.nome = nome;
    }


    @Override
    public void mover() {
        this.movimento.mover();
    }

}