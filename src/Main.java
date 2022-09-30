public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Task 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 2
        System.out.println("Task 2");
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 1) {
                System.out.println("Приложение будет работать корректно на вашей системе iOS");
            } else if (clientOS == 0) {
                System.out.println("Приложение будет работать корректно на вашей системе Android");
        }
        } else if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию Android по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию iOS по ссылке");
            }
        }
    }
}