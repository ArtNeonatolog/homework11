import java.time.LocalDate;

public class Main {
    public static int distance (int deliveryDistance, int deliveryPerFirstDay, int deliveryNextDays, int daysForDeliveryAfter20km){
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Птребуется 1 день, чтобы доставить карту");
            return day;
        } else if(deliveryDistance > 20 && (deliveryDistance - deliveryPerFirstDay) % deliveryNextDays == 0) {
            System.out.println("Потребуется " + daysForDeliveryAfter20km + " дней(я), чтобы доставить карту");
            return daysForDeliveryAfter20km;
        } else {
            System.out.println("Потребуется " + (daysForDeliveryAfter20km + 1) + " дней(я), чтобы доставить карту");
            return daysForDeliveryAfter20km + 1;
        }
    }
    public static void checkDevices(int clientOS, int currentYear, int clientDeviceYear){ //метод для 2 задачи
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void checkYear(int year) { //метод для 1 задачи
        if (year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " - високосный год");
        }else{
            System.out.println(year + " - не високосный год");
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    private static void task3() {  //метод для разделения заданий
        System.out.println("Задание 3");
        int deliveryDistance = 120; //Расстояние до клиента
        int deliveryPerFirstDay = 20; //За сутки до 20 км
        int deliveryNextDays = 40; //Каждые следующие до 40 км плюс сутки
        int daysForDeliveryAfter20km = ((deliveryDistance - deliveryPerFirstDay) / deliveryNextDays + 1);
        distance(deliveryDistance, deliveryPerFirstDay, deliveryNextDays, daysForDeliveryAfter20km);
    }
    private static void task2() {
        System.out.println("Задание 2");
        int clientOS = 0;
        int clientDeviceYear = 2020;
        int currentYear = LocalDate.now().getYear();
        checkDevices(clientOS, currentYear, clientDeviceYear);
        System.out.println();
        }
    private static void task1() {
        System.out.println("Задание 1");
        int year = 1607;
        checkYear(year);
        System.out.println();
    }
}




