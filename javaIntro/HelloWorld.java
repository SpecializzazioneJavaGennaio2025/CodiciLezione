import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
        //Commenti:
        //System è la classe che riconosce comandi di sistema
        //out è un metodo della classe System che manipola l'output del sistema
        //println stampa il testo seguito da un ritorno a capo
        // System.out.println("Ciao benvenuti in Java!!!");

        //char c = 'a';

        //Casting
        //Esplicito ed implicito
        //Esplicito
        byte b = 19;
        short x = (short) b;
        int i = (int) x;
        long l = (long) i;
        double d = (double) l;

        // System.out.println(d);

        //Casting possibile ma INUTILE
        // char c = 'c';
        // int cc = (int) c;

        // System.out.println(cc);

        float f = 1.77f;
        double dd = (double)f;

        // System.out.println(dd);

        //Implicito
        int numeroIntero = 42;
        double numeroDouble = numeroIntero;

        // char c = 'a';
        // String cstring =  c;

        String testo = "123";
        int numero = Integer.parseInt(testo);

        // System.out.println(numero);

        // int intero = null;
        Integer intero = null;

        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        //Scaner possiene nextInt per ricevere numero, nextLine per ricevere stringhe

        // Scanner scan = new Scanner(System.in); 
        // System.out.println("Inserisci un elemento");
        // int num = scan.nextInt();
        // System.out.println("Hai inserito " + num);
        // scan.close();

        var inedito = "ciao";

        
        Scanner scan = new Scanner(System.in); 
        System.out.println("Inserisci una stringa");
        String string = scan.nextLine();
        System.out.println("Hai inserito " + string);
        scan.close();
    }
}