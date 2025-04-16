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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Polaznik polaznik = (Polaznik) obj;
        return email.equals(polaznik.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    @Override
    public int compareTo(Polaznik o) {
        return this.prezime.compareTo(o.prezime);
    }
}
