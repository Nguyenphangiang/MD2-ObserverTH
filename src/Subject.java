import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<>();
    private int state;

    public void add(Observer o){
        observerList.add(o);
    }
    public int getState(){
        return state;
    }
    public void setState(int state){
        this.state = state;
        execute();
    }
    public void execute(){
        for (Observer o : observerList){
            o.update();
        }
    }
}
