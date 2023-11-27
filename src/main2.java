import java.util.Scanner;

public class main2 {public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserisci la prima stringa");
    String primaStr = scanner.nextLine();
    System.out.println("Prima Stringa" + primaStr);
    String secondStr = scanner.nextLine();
    System.out.println("Seconda Stringa" + secondStr);
    String terzaStr = scanner.nextLine();
    System.out.println("Terza Stringa" + terzaStr);
//concatenazione delle stringhe
    String primoOrdine = primaStr + " " + secondStr + " " + terzaStr;
    System.out.println("Concatenazione in ordine di inserimento" + primoOrdine);
    String secondoOrdine = terzaStr + " " + primaStr + " " + secondStr;

    System.out.println("Concatenazione in ordine di inserimento inverso"+ secondoOrdine);
    scanner.close();
}
}
