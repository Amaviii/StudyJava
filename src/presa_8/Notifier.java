//Принцип работы последней части кода я понял плохо!!!

package presa_8;

interface Notifier {
    void sendNotification(String message);
}

class EmailNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Отправляем email: " + message);
    }
}

class SMSNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Отправляем SMS: " + message);
    }
}

class PushNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Отправляем push-уведомление: " + message);
    }
}

// Сервис для работы с уведомлениями
class NotificationService {
    private final Notifier notifier;

    //Конструктор класса NotificationService
    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(String message) {
        notifier.sendNotification(message);
    }
}

class ResultNotifier {
    public static void main(String[] args) {
        // Создаем разные типы уведомлений
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier();
        Notifier pushNotifier = new PushNotifier();

        // Используем сервис с разными реализациями
        NotificationService emailService = new NotificationService(emailNotifier);
        emailService.notifyUser("Ваш заказ готов!");

        NotificationService smsService = new NotificationService(smsNotifier);
        smsService.notifyUser("Баланс пополнен на 1000 руб.");

        NotificationService pushService = new NotificationService(pushNotifier);
        pushService.notifyUser("У вас новое сообщение");
    }
}