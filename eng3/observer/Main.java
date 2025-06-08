// Interface Observer 

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String news);
}

// Interface Subject
interface Subject{
    void addObserver(Observer o );
    void removeObserver(Observer o);
    void notifyObserver();
}


// Classe concreta do Subject
class NewsAgency implements Subject {

    private String news;
    private List<Observer> observers = new ArrayList<>();


    public void setNews(String news){
        this.news = news;
        notifyObserver();
    }


    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o :observers){
            o.update(news);
        }
    }
}

// Classe concreta do observer
class NewsChannel implements Observer {

    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println("Urgente, " + news);
    }
}


// Classe main para testar
public class Main{
    public static void main(String[] args) {
          
        NewsAgency agency  = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();
        NewsChannel channel2 = new NewsChannel();  
        NewsChannel channel3 = new NewsChannel();          
        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);

        agency.setNews("Google Veo3 a mais nova tecnologia IA de criação de videos em 3D foi lançada!");
        agency.setNews("Palmeiras ganha de 6x0 e Continua SEM MUNDIAL!");
        agency.setNews("Portugal de CRL7 e Espanha de Lamine Yamal jogam dia 08/06/2024 ");

    }
}