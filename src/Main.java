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
    }
}