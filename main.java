import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        
//Créer 3 prestations
        Prestation sauna = new Prestation("Sauna", "Accès sauna", 5);
        Prestation coach = new Prestation("Coach", "Séance coach", 25);
        Prestation serviette = new Prestation("Serviette", "Serviette", 2);

//Créer 3 séances
        Seance s1 = new Seance(1, "BodyPump", 
            LocalDateTime.of(2026, 3, 10, 10, 0), 20);
        Seance s2 = new Seance(2, "Yoga", 
            LocalDateTime.of(2026, 3, 12, 18, 0), 15);
        Seance s3 = new Seance(3, "Crossfit", 
            LocalDateTime.of(2026, 3, 15, 9, 0), 10);

//Créer salle
        SalleDeSport salle = new SalleDeSport();
        salle.ajouterSeance(s1);
        salle.ajouterSeance(s2);
        salle.ajouterSeance(s3);

//Créer adhérents
        Abonnement basic = new AbonnementBasic("Basic1", LocalDate.now(), 12, 30);
        Adherent dupont = new Adherent(1, "Dupont", basic);

        Abonnement premium = new AbonnementPremium("Prem1", LocalDate.now(), 12, 50, 4);
        Adherent martin = new Adherent(2, "Martin", premium);

        salle.ajouterAdherent(dupont);
        salle.ajouterAdherent(martin);

//Faire réservations
        dupont.reserver(s1);
        dupont.getReservations().get(0).ajouterPrestation(sauna);

        martin.reserver(s2);
        martin.getReservations().get(0).ajouterPrestation(coach);
        martin.getReservations().get(0).ajouterPrestation(serviette);

        martin.reserver(s3);
        martin.getReservations().get(1).annuler();

//Afficher résultats
        System.out.println("Adhérents:");
        for (Adherent a : salle.getAdherents()) {
            System.out.println(a);
        }

        System.out.println("\nRéservations futures Martin:");
        for (Reservation r : martin.reservationsFutures()) {
            System.out.println(r);
        }

        System.out.println("\nAdhérents avec sauna:");
        for (Adherent a : salle.adherentsAvecSauna()) {
            System.out.println(a);
        }

        System.out.println("\nChiffre d'affaires: " + salle.chiffreAffairesPrestations() + "€");

// Test exception
        try {
            salle.trouverAdherent(99);
        } catch (RuntimeException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
