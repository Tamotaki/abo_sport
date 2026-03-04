import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Adherent {
    private int id;
    private String nom;
    private Abonnement abonnement;
    private List<Reservation> reservations;

//Constructeur adhérent
    public Adherent(int id, String nom, Abonnement abonnement) {
        this.id = id;
        this.nom = nom;
        this.abonnement = abonnement;
        this.reservations = new ArrayList<>();
    }
//Faire une réservation
    public void reserver(Seance s) {
        Reservation r = new Reservation(s);
        reservations.add(r);
    }
//Somme dépenses confirmées
    public double depensesTotales() {
        double total = 0;
        for (Reservation r : reservations) {
            if (r.getStatut() == StatutReservation.CONFIRMEE) {
                total += r.coutPrestations();
            }
        }
        return total;
    }
//Réservations futures
    public List<Reservation> reservationsFutures() {
        LocalDateTime maintenant = LocalDateTime.now();
        List<Reservation> futures = new ArrayList<>();
        for (Reservation r : reservations) {
            if (r.getSeance().getDateHeure().isAfter(maintenant) && r.getStatut() == StatutReservation.CONFIRMEE) {
                futures.add(r);
            }
        }
        return futures;
    }

//Getters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public Abonnement getAbonnement() { return abonnement; }
    public List<Reservation> getReservations() { return reservations; }
    
//Affichage simple
    @Override
    public String toString() {
        return id + "-" + nom + abonnement;
    }
}
