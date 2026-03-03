import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Abonnement {
    protected String reference;
    protected LocalDate dateDebut;
    protected int dureeMois;
    protected double prixMensuel;

    public Abonnement(String reference, LocalDate dateDebut, int dureeMois, double prixMensuel) {
        this.reference = reference;
        this.dateDebut = dateDebut;
        this.dureeMois = dureeMois;
        this.prixMensuel = prixMensuel;
    }

    public LocalDate dateFin() {
        return dateDebut.plusMonths(dureeMois);
    }

    public double coutTotal() {
        return prixMensuel * dureeMois;
    }

    public abstract boolean permetAccesSauna();
    public abstract int creditsCoachInclus();

    public String getReference() { return reference; }
    public LocalDate getDateDebut() { return dateDebut; }

    @Override
    public String toString() {
        return reference + " jusqu'au " + dateFin() + " (" + coutTotal() + "€)";
    }
}
