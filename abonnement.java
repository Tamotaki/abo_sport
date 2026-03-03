import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//Classe abstraite pour tous les abonnements
public abstract class Abonnement {
    protected String reference;
    protected LocalDate dateDebut;
    protected int dureeMois;
    protected double prixMensuel;

//Constructeur abonnement
    public Abonnement(String reference, LocalDate dateDebut, int dureeMois, double prixMensuel) {
        this.reference = reference;
        this.dateDebut = dateDebut;
        this.dureeMois = dureeMois;
        this.prixMensuel = prixMensuel;
    }
 //Calcul date de fin
    public LocalDate dateFin() {
        return dateDebut.plusMonths(dureeMois);
    }
//Calcul coût total
    public double coutTotal() {
        return prixMensuel * dureeMois;
    }
//Méthode abstraite accès sauna
    public abstract boolean permetAccesSauna();
//Méthode abstraite crédits coach inclus    
    public abstract int creditsCoachInclus();
//Getters
    public String getReference() { return reference; }
    public LocalDate getDateDebut() { return dateDebut; }
    
//Affichage abonnement
    @Override
    public String toString() {
        return reference + " jusqu'au " + dateFin() + " (" + coutTotal() + "€)";
    }
}
