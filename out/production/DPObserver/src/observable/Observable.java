package observable;

import observers.Observer;

public interface Observable {
    public void subsscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void notifyobservers();
}
