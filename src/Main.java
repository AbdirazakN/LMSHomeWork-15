public class Main {
    public static void main(String[] args) {

        //Circle деген класс тузунуз, анын PI деген свойствасы, area жана circumference деген статик методдору болсун.
        //areaны табуу учун: PI * (radius * radius) circumference ти табуу учун PI * 2 * radius деген формулалар колдонулат

        System.out.println("Circle radius: "+Circle.radius);
        System.out.println("PI: "+Circle.pi);
        Circle.circumference();
        Circle.area();

    }
}