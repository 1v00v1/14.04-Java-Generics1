package zadaci;

import java.util.*;

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
        /*
        * Napiši program za evidenciju polaznika na tečaju koji također provjerava i sprječava dodavanje duplikata polaznika na tečaj. Program treba omogućiti unos polaznika i njihovih podataka te provjeriti jesu li polaznici jedinstveni na tečaju.

Koristi klasu Polaznik s atributima: ime, prezime i e-mail
Koristi klasu HashSet<Polaznik> za pohranu polaznika kako bi se osigurala jedinstvenost
Napravi glavnu klasu EvidencijaPolaznika koja sadrži main metodu
Omogući korisniku unos novih polaznika (ime, prezime, e-mail)
Pri dodavanju novog polaznika, provjeri je li polaznik već prisutan na tečaju (usporedba po e-mail adresi)
Ispisuj odgovarajuće poruke o uspješnom ili neuspješnom dodavanju polaznika na tečaj
Omogući ispis svih polaznika na tečaju nakon unosa
koristiti metode equals i HashCode


Što bi trebalo izmijeniti u rješenju ako dodamo novi zahtjev?
Svi polaznici moraju biti cijelo vrijeme sortirani po prezimenu uzlazno
Iskorisitit TreeSet() i sučelje Comparable

*/
        HashSet<Polaznik> p = new HashSet<>();

        Scanner s = new Scanner(System.in);
        Boolean exit = false;

        do {
            printMenu();
            int izbor = Integer.parseInt(s.nextLine());
            switch (izbor) {
                case 1 -> p.add(UnosPolaznika(s, p));
                case 2 -> IspisPolaznika(p);
                case 3 -> PretrazivanjePoEmailu(s, p);
                default -> exit = true;

            }


        } while (exit == false);

    }

    private static void IspisPolaznika(HashSet<Polaznik> p) {
        System.out.println("Lista polaznika :");
TreeSet<Polaznik > polaznici = new TreeSet<>(p);
        for (Polaznik pol  : polaznici) {
            System.out.println(pol);
        }
    }

    private static void PretrazivanjePoEmailu(Scanner s, HashSet<Polaznik> polaznici) {
        System.out.println("Unesite email za pretrazivanje");
        String email = s.nextLine().trim();

        System.out.println(email);
        for (Polaznik p : polaznici) {
            if (p.getEmail().equals(email)) {
                System.out.println(p);
            }
        }
    }

    public static Polaznik UnosPolaznika(Scanner s, HashSet<Polaznik> p) {
        boolean ex = false;
        String email;
        System.out.print("Unesite Ime : ");
        String ime = s.nextLine();
        System.out.print("Unesite Prezime : ");
        String prezime = s.nextLine();

        System.out.print("Unesite Email : ");
        email = s.nextLine();
        for (Polaznik pol : p) {
            do {
                if (pol.getEmail().equals(email)) {
                    System.out.println("Email se koristi\nPonovite unos");
                    System.out.print("Unesite Email : ");
                    email = s.nextLine();
                } else {
                    System.out.println("polaznik uspješno unesen");
                    ex = true;
                }


            } while (!ex);
        }
            return new Polaznik(ime, prezime, email);


    }
        public static void printMenu () {
            System.out.println("-".repeat(30));
            System.out.println("1: Unos \n" +
                    "2: Ispis polaznika\n"
                    + "3: Pretrazivanje po emailu\n" +
                    "4: izlaz");
            System.out.println("-".repeat(30));
            System.out.print("Unesite izbor: ");
        }
    }
