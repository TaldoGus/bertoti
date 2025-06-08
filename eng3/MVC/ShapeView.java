package MVC;

public class ShapeView implements Observer {

    private ShapeModel model;

    public ShapeView(ShapeModel model){
        this.model = model;
        model.addObserver(this);
    }

    @Override
    public void update(){
        System.out.println("Visualização sendo atualizada...");
        model.drawShapes();
    }
}

