
public class Main {
    public static void main(String[] args) {

        Marsel marsel= new Marsel();
        marsel.name="Marsel ";
        marsel.lastName="Suerov";
        marsel.year=2007;
        marsel.month=05;
        marsel.day=22;
        marsel.description="My name is Marsel, my height 183, I go to IT course, and I can speak English fluently";
        marsel.group="Java 3 B";
        marsel.course="Java";
        marsel.etap=1;
        System.out.println(marsel.name+" "+marsel.lastName);
        System.out.println(marsel.year+" "+ marsel.month+" "+ marsel.day);
        System.out.println(marsel.description);
        System.out.println(marsel.group);
        System.out.println(marsel.course);
        System.out.println(marsel.etap);
    }
}