package zadaci;

public class Polaznik implements Comparable<Polaznik> {
    private String ime;
    private  String prezime;
    private  String email;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    @Override
    public String toString() {
        return "Ime: "+ ime +
                "\nPrezime:  " + prezime+
                "\nEmail: " + email ;
    }

    @Override
    public int compareTo(Polaznik o) {
        return this.prezime.compareTo(o.prezime);
    }
}
