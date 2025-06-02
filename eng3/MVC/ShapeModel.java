package estruturaMVC;

import java.util.ArrayList;
import java.util.List;

public class ShapeModel implements Subject{

    private List<Observer> observers = new ArrayList<>();
    
    public void drawShapes(){
        System.out.println("Desenhando formas no modelo...");
    }

    public void changeState(){
        System.out.println("O estado do modelo foi alterado!");
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    
    @Override
    public void notifyObservers(){
        for (Observer o : observers){
            o.update();
        }
    }

}