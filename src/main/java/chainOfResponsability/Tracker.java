package chainOfResponsability;

public class Tracker {
    public static void main(String[] args) {
        Notifier report = new SimpleReport(Priority.ROUTINE);
        Notifier email = new Email(Priority.IMPORTANT);
        Notifier SMS = new SMS(Priority.ASAP);

        report.setNextNotifier(email);
        email.setNextNotifier(SMS);

        report.notifyManager(" ok", Priority.ROUTINE);
        report.notifyManager(" It's not OK", Priority.IMPORTANT);
        report.notifyManager(" Problem", Priority.ASAP);
    }
}
