public class Circle {
    //Circle деген класс тузунуз, анын PI деген свойствасы, area жана circumference деген статик методдору болсун.
    //areaны табуу учун: PI * (radius * radius) circumference ти табуу учун PI * 2 * radius деген формулалар колдонулат
    static double pi = Math.PI;
    static double radius = 2.6;

    public static void area(){
        System.out.println("Area:  "+pi * (radius * radius));
    }
    public static void circumference(){
        System.out.println("Circumference:  "+pi * 2 * radius);
    }
}