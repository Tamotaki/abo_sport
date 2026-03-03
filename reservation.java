public class Reservation {
    private Seance seance;
    private List<Prestation> prestation;
    private StatutReservation statut;
     
public Reservation (Seance seance) {
    this.seance = seance;
    this.prestations = new ArrayList<>();
    this.status = StatutReservation.Confirmée;
    
}

}