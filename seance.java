import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Seance {
    private int id;
    private String nom;
    private LocalDateTime dateHeure;
    private int capaciteMax;

//Constructeur classe séance
public Seance (int id, String nom, LocalDateTime dateHeure, int capaciteMax){
    this.id = id;
    this.nom = nom;
    this.dateHeure = dateHeure;
    this.capaciteMax = capaciteMax;
}

//Getters
public int getID(){
    return id;
}
public String getNom(){
    return nom;
}
public LocalDateTime getDateHeure(){
    return dateHeure;
}
public int getCapaciteMax(){
    return capaciteMax;
}

//Méthode toString
@Override
public String toString (){
    return id + nom + dateHeure + capaciteMax + " personnes ";
}

}