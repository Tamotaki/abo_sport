public class AbonnementBasic extends Abonnement {

//Constructeur Basic
    public AbonnementBasic(String reference, LocalDate dateDebut, int dureeMois, double prixMensuel) {
        super(reference, dateDebut, dureeMois, prixMensuel);
    }
//Pas d'accès sauna
    @Override
    public boolean permetAccesSauna() {
        return false;
    }
//Pas de crédit coach
    @Override
    public int creditsCoachInclus() {
        return 0;
    }
}
