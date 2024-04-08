public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Комбинация условных операторов.
        System.out.println("exercise 1");

        char color = 'g';

        if (color == 'r') {
            System.out.println("Красный! Ехать нельзя!");
        } else if (color == 'y') {
            System.out.println("Желтый. Внимание!");
        } else {
            System.out.println("Зеленый! Проезд разрешен.");
        }

        System.out.println("\nexercise 2");

        char color2 = 'g';
        switch (color2){
            case 'r':
                System.out.println("Красный! Ехать нельзя!");
                break;
            case 'y':
                System.out.println("Желтый. Внимание");
                break;
            case 'g':
                System.out.println("Зеленый! Проезд разрешен!");
                break;
            case 'l':
                System.out.println("Поворот налево.");
                break;
            default:
                System.out.println("Светофор сломался.");
        }

        System.out.println("\nexercise 3");

        int age = 19;

        if (age == 18) {
            System.out.println("С окончанием школы.");
        } else if (age == 21) {
            System.out.println("Теперь можно пить алкоголь.");
        } else if (age == 7) {
            System.out.println("Иди в школу.");
        } else {
            System.out.println("Пока сказать нечего.");
        }

        System.out.println("\ntraining");

        int salary = 30_000;
        if (salary >= 20_000) {
            System.out.println("Наконец-то я стал богатым.");
            if (salary < 50_000)
                System.out.println("Но все равно мне не хватет на новое авто.");
        } else {
            System.out.println("Я могу позволить себе новый Mercedes.");
        }

        System.out.println("\ntraining 2.1");

        int salary2 = 15000;

        if (salary2 >= 20000) {
            System.out.println("Наконец-то я стал богатым");
            if (salary2 < 50000) {
                System.out.println("Но всё равно мне не хватает на новое авто");
            } else {
                System.out.println("Я могу позволить себе новый Mercedes");
            }
        } else {
            if (salary2 >= 10000) {
                System.out.println("С этим уровнем доходов я останусь без машины");
            } else {
                System.out.println("Пора затянуть пояса");
            }
        }

        System.out.println("\ntraining 2.2");

        int salary3 = 5000;

        if (salary3 >= 20000) {
            System.out.println("Наконец-то я стал богатым");
            if (salary3 < 50000) {
                System.out.println("Но всё равно мне не хватает на новое авто");
            } else {
                System.out.println("Я могу позволить себе новый Mercedes");
            }
        } else if (salary3 >= 10000) {
            System.out.println("С этим уровнем доходов я останусь без машины");
        } else {
            System.out.println("Пора затянуть пояса");
        }

        System.out.println("\nHomework");
        //task1
        System.out.println("\nTask 1");
        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task2
        System.out.println("\nTask 2");
        int clientDeviceYear = 2015;
        int clientDevice = 0;

        if (clientDevice == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientDevice == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientDevice == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientDevice == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Такая система не поддерживается.");
        }

        //task3
        System.out.println("\nTask 3");
        int year = 2021;

        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является вискосным.");
        }

        //task4
        System.out.println("\nTask 4");
        int deliveryDistance = 95;
        int days = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Доставка занимает: " + days + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            days = days + 1;
            System.out.println("Доставка занимает: " + days + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            days = days + 2;
            System.out.println("Доставка занимает: " + days + " дня");
        } else {
            System.out.println("Доставки нет.");
        }

        //task5
        System.out.println("\nTask 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}