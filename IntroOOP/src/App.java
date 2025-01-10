public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        // info1();
        // info2();

        info("Debora", "Masciavè");
        info("Gianmarco", "Nacci");
    }

    // public static void info1(){
    //     String name = "Debora";
    //     String surname = "Masciavè";
    //     System.out.println("Hello " + name + " " + surname);
    // }

    // public static void info2(){
    //     String name1 = "Gianmarco";
    //     String surname1 = "Nacci";
    //     System.out.println("Hello " + name1 + " " + surname1);
    // }

    public static void info(String name, String surname){
        System.out.println("Hello " + name + " " + surname);
    }
}
