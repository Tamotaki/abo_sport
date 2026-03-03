import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private Seance seance;
    private List<Prestation> prestation;
    private StatutReservation statut;
     
public Reservation (Seance seance) {
    this.seance = seance;
    this.prestations = new ArrayList<>();
    this.status = StatutReservation.Confirmée; //Confirme par défaut
}
//Ajout d'une prestation à la liste
public void ajouterPrestation (Prestation p){
    if (p != null) {
        prestations.add(p);
    }
}

//Calcul de la somme des prestations
public double coutPrestations(){
    double total = 0.0;
    for (Prestation p : prestation) {
        total += p.getPrix;
    }
    return total;
}

//Annuler une réservation
public void annuler() {
    this.statut = StatutReservation.Annulée;
}

//Méthode toString
@Override
public String toString(){
    return seance + prestations.size() + coutPrestations + "€, " + statut;
}

}