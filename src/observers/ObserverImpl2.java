package observers;

public class ObserverImpl2 implements Observer {
    double laststate;
    @Override
    public void update(int etat) {
        if (etat-laststate>0)
            System.out.println("observateur 2 = > augumentation de la pression ");
        else if (etat-laststate<0)
            System.out.println("observateur 2 = > depression \"");

    }
}
