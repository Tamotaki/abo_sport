import java.util.ArrayList;
import java.util.List;

public class SalleDeSport {
    private List<Adherent> adherents;
    private List<Seance> seances;

//Constructeur classe salle de sport
    public SalleDeSport() {
        adherents = new ArrayList<>();
        seances = new ArrayList<>();
    }

    public void ajouterAdherent(Adherent a) {
        adherents.add(a);
    }
    public void ajouterSeance(Seance s) {
        seances.add(s);
    }
    public List<Seance> seancesDisponibles() {
        return new ArrayList<>(seances);  // Simple : toutes dispo
    }
    public List<Adherent> adherentsAvecSauna() {
        List<Adherent> avecSauna = new ArrayList<>();
        for (Adherent a : adherents) {
            if (a.getAbonnement().permetAccesSauna()) {
                avecSauna.add(a);
            }
        }
        return avecSauna;
    }
    public double chiffreAffairesPrestations() {
        double total = 0;
        for (Adherent a : adherents) {
            total += a.depensesTotales();
        }
        return total;
    }
    public Adherent trouverAdherent(int id) {
        for (Adherent a : adherents) {
            if (a.getId() == id) {
                return a;
            }
        }
        throw new RuntimeException("Adherent " + id + " non trouvé");
    }

    public List<Adherent> getAdherents() { return adherents; }
}
