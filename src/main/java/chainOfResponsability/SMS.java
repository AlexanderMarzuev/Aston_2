package chainOfResponsability;

public class SMS extends Notifier{
    @Override
    public void write(String message) {
        System.out.println("Sending SMS" + message);
    }

    public SMS(int priority) {
        super(priority);
    }
}
