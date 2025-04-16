package zadaci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvidencijaPolaznika {

    public static void main(String[] args) {

       /*
       * Napiši program za evidenciju polaznika na tečaju.
       *  Program treba omogućiti unos polaznika i njihovih podataka
       * te pružiti osnovne funkcije za upravljanje evidencijom.
Napravi klasu Polaznik koja ima sljedeće atribute:
* Ime polaznika
* Prezime polaznika
* E-mail adresa polaznika
Napravi glavnu klasu EvidencijaPolaznika koja sadrži main metodu.
* Omogući korisniku unos novih polaznika (ime, prezime, e-mail).
* Omogući ispis svih polaznika na tečaju.
* Omogući pretraživanje polaznika po e-mail adresi.
Za rješavanje koristite klasu ArrayList
       *
       * */
        List<Polaznik> p = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        Boolean exit =false;

        do {
            printMenu();
            int izbor = Integer.parseInt( s.nextLine());
            switch (izbor){
                case 1 -> p.add( UnosPolaznika(s));
                case 2 -> IspisPolaznika(p);
                case 3 -> PretrazivanjePoEmailu(s,p);
                default -> exit=true;

            }


        }while(exit ==false);

    }

    private static void IspisPolaznika(List<Polaznik> p) {
        System.out.println("Lista polaznika :");
        for (Polaznik pol :p){
            System.out.println(pol.toString());
        }
    }

    private static void PretrazivanjePoEmailu(Scanner s, List<Polaznik> polaznici) {
        System.out.println("Unesite email za pretrazivanje");
        String email= s.nextLine().trim();
        System.out.println("Lista polaznika s emailom : "+email);
        System.out.println(email);
        for (Polaznik p : polaznici){
            System.out.println("pruka"+p.getEmail());
            if(p.getEmail() == email){
                System.out.println(p);
            }
        }
    }

    public static Polaznik UnosPolaznika(Scanner s){
        System.out.print("Unesite Ime : ");
        String ime = s.nextLine();
        System.out.print("Unesite Prezime : ");
        String prezime = s.nextLine();
        System.out.print("Unesite Email : ");
        String email = s.nextLine();



        return new Polaznik(ime,prezime,email);
    }
    public static void printMenu(){
        System.out.println("-".repeat(30));
        System.out.println( "1: Unos \n"+
                "2: Ispis polaznika\n"
        +"3: Pretrazivanje po emailu\n"+
                "4: izlaz");
        System.out.println("-".repeat(30));
        System.out.print("Unesite izbor: ");
    }
}