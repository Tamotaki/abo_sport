import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Prestation {

private String code;
private String libelle;
private double prix;

//Constructeur de la classe prestation
public Prestation (String code, String libelle, double prix) {
    this.code = code;
    this.libelle = libelle;
    this.pri = prix;
}

//Getters
public String getCode(){
    return code;
}
publlic String getLibelle(){
    return libelle;
}
public double getPrix(){
    return prix;
}

//Méthode toString
@Override
public String toString(){
    return code + libelle + prix + " € ";
}

}