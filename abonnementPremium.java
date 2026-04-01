import java.time.LocalDate;

public class AbonnementPremium extends Abonnement {
    private int creditsCoach;

//Constructeur Premium
    public AbonnementPremium(String reference, LocalDate dateDebut, int dureeMois, double prixMensuel, int creditsCoach) {
        super(reference, dateDebut, dureeMois, prixMensuel);
        this.creditsCoach = creditsCoach;
    }
//Accès sauna autorisé
    @Override
    public boolean permetAccesSauna() {
        return true;
    }
//Retourne les crédits coach
    @Override
    public int creditsCoachInclus() {
        return creditsCoach;
    }
    
}
