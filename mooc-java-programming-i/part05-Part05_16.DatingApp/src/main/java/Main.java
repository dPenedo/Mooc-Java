
public class Main {

    public static void main(String[] args) {
        // test your program here!


        System.out.println("=================");
        SimpleDate fecha3 = new SimpleDate(30, 12, 2015);
        System.out.println("fecha " + fecha3.toString());
        System.out.println("Sumo 1");
        SimpleDate nuevaFecha3 = fecha3.afterNumberOfDays(1);
        System.out.println("nueva fecha " + nuevaFecha3.toString());


        System.out.println("=================");
        SimpleDate fecha1 = new SimpleDate(30, 12, 2015);
        System.out.println("fecha " + fecha1.toString());
        System.out.println("Sumo 12");
        SimpleDate nuevaFecha1 = fecha1.afterNumberOfDays(12);
        System.out.println("nueva fecha " + nuevaFecha1.toString());

        System.out.println("=================");
        SimpleDate fecha2 = new SimpleDate(30, 12, 2015);
        System.out.println("fecha " + fecha2.toString());
        System.out.println("Sumo 50");
        SimpleDate nuevaFecha2 = fecha2.afterNumberOfDays(50);
        System.out.println("nueva fecha " + nuevaFecha2.toString());


    }
}
