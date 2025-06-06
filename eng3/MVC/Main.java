package MVC;


public class Main {
    public static void main(String[] args) {
        ShapeModel model = new ShapeModel();
        ShapeView view = new ShapeView(model);

        model.changeState();  // Dispara notificação para a view
    }
}