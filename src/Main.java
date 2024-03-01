import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int ageMax = 21;
        if (ageMax >= 18) {
            System.out.println("Если возраст человека равен " + ageMax + ", то он совершенолетний.");
        }
        else {
            System.out.println("Если возраст человека равен " + ageMax +
                    ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача 2:");
        int temp = 9;
        if (temp < 5) {
            System.out.println("На улице " + temp + " грдусов, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }

        System.out.println("Задача 3:");
        int speed = 81;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
        else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }

        System.out.println("Задание 4:");
        int age = 25;
        if (age >= 2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в садик.");
        }
        else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человка равен " + age + ", то ему нужно ходить в школу.");
        }
        else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }

        System.out.println("Задача 5:");
        int childAge = 19;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракцине.");
        }
        if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ", то можно кататься на аттракционе в сопровождении взрослого.");
        }
        else {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ", то можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Задание 6:");
        int capacity = 102;
        int seatPlace = 60;
        int standingPlace = capacity - seatPlace;
        int totalPeople = 99;
        if (totalPeople <= 60) {
            System.out.println("Всем людям достанутся сидячие места.");
        }
        if (totalPeople > 60 && totalPeople <= 102) {
            System.out.println("Тогда 60 человек получат сидячие места, а "
                    + (totalPeople - 60) + " человек получат стоячие места.");
        }
        else {
            System.out.println("Вагон уже полность забит.");
        }

        System.out.println("Задание 7:");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && two > three) {
            System.out.println("Самое большое число это" + one);
        }
        if (two > one && one > three) {
            System.out.println("Самое большое число это " + two);
        }
        else {
            System.out.println("Самое большое число это " + three);
        }
    }
}