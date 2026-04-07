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
    this.prestation = new ArrayList<>();
    this.statut = StatutReservation.Confirmée; //Confirme par défaut
}
//Ajout d'une prestation à la liste
public void ajouterPrestation (Prestation p){
    if (p != null) {
        prestation.add(p);
    }
}

//Calcul de la somme des prestations
public double coutPrestations(){
    double total = 0.0;
    for (Prestation p : prestation) {
        total += p.getPrix();
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
    return seance + prestation.size() + coutPrestation + "€ " + statut;
}
public Object getStatut() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getStatut'");
}
public Object getStatut() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getStatut'");
}
public Seance getSeance() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getSeance'");
}
public Object getStatutReservation() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getStatutReservation'");
}
public Object getStatut() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getStatut'");
}
}