import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Tests {

    /**
     * Задача 1.4.5
     */
    static void task1_4_5() {
        Name cleopatraName = new Name("Клеопатра");
        Human cleopatra = new Human(cleopatraName, 152);

        Name pushkinName = new Name("Александр", "Сергеевич", "Пушкин");
        Human pushkin = new Human(pushkinName, 167);

        Name mayakovskyName = new Name("Владимир", "Маяковский");
        Human mayakovsky = new Human(mayakovskyName, 189);

        System.out.println(cleopatra);
        System.out.println(pushkin);
        System.out.println(mayakovsky);
    }

    /**
     * Задача 1.4.6
     */
    static void task1_4_6() {
        //Шаг 1
        Human lev = new Human("Лев", 170);

        Name pushkinSergey = new Name("Пушкин", "Сергей");
        Human pushkin = new Human(pushkinSergey, 168, lev);

        Human alexandr = new Human("Александр", 167, pushkin);

    }


    /**
     * Задача 1.4.7
     */
    static void task1_4_7() {

        Student vasya = new Student("Вася");

        Student petya = new Student("Петя", 5, 5);

        //System.out.println(vasya);
        System.out.println(vasya.excellentStudent());
    }


    /**
     * Задача 1.3.3
     */

    public static void task1_5_4() {
        Hours hours = new Hours(34056);
        System.out.println(hours);
        Hours hours1 = new Hours(9, 27, 36);
        System.out.println(hours1);
    }

    public static void task1_5_5() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(5, 2);
        Fraction f3 = new Fraction(2, 4);
        Fraction f4 = new Fraction(1, 3);
        Fraction f5 = new Fraction(4, 3);
        System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
        System.out.println(f3 + " * " + f4 + " = " + f3.toMultiply(f4));
        System.out.println(f1.sum(f2).toDivide(f3).minus(5));
    }

    public static void task1_5_7() {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(5, 15);
        Point p5 = new Point(8, 10);
        BrokenLine brokenLine = new BrokenLine(p1, p2, p3);
        System.out.println(brokenLine);
        System.out.println(brokenLine.length());
        brokenLine.addPoints(p4, p5);
        System.out.println(brokenLine);
        System.out.println(brokenLine.length());
    }

    public static void task1_4_8() {
        City cityA = new City("A");
        City cityB = new City("B");
        City cityD = new City("D");
        cityA.addWays(cityB, 4);
        System.out.println(cityA);
    }

    public static void task3_1_4(){
        Gun2 gun2 = new Gun2(10);
        gun2.setCartridges(10);
        System.out.println(gun2.getMaxCartridges());
    }
}