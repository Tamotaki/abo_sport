import java.util.ArrayList;
import java.util.List;

public class Salledesport {
    private List<Adherent> adherents;
    private List<Seance> seances;

//Constructeur salle de sport vide
    public Salledesport() {
        adherents = new ArrayList<>();
        seances = new ArrayList<>();
    }
//Ajouter adhérent
    public void ajouterAdherent(Adherent a) {
        adherents.add(a);
    }
//Ajouter séance
    public void ajouterSeance(Seance s) {
        seances.add(s);
    }
//Toutes les séances disponibles
    public List<Seance> seancesDisponibles() {
        return new ArrayList<>(seances);  // Simple : toutes dispo
    }
//Adhérents avec accès sauna
    public List<Adherent> adherentsAvecSauna() {
        List<Adherent> avecSauna = new ArrayList<>();
        for (Adherent a : adherents) {
            if (a.getAbonnement().permetAccesSauna()) {
                avecSauna.add(a);
            }
        }
        return avecSauna;
    }
//Chiffre d'affaires prestations
    public double chiffreAffairesPrestations() {
        double total = 0;
        for (Adherent a : adherents) {
            total += a.depensesTotales();
        }
        return total;
    }
//Trouver adhérent ou exception
    public Adherent trouverAdherent(int id) {
        for (Adherent a : adherents) {
            if (a.getId() == id) {
                return a;
            }
        }
        throw new RuntimeException("Adherent " + id + " non trouvé");
    }
//Getter
    public List<Adherent> getAdherents() { return adherents; }
}
