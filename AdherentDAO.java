import java.util.List;
import java.sql.*;


class AdherentDAO {

void inserer(Adherent adherent) {
    INSERT INTO adherent(id, nom) VALUES (10, dupont);
    List<Adherent> lister() {
        SELECT * FROM adherent;
        }
    }

void modifier(Adherent adherent) {
    UPDATE adherent SET nom = dupont WHERE id = 10;
    }

void supprimer(int id) {
    DELETE FROM adherent WHERE id = 10;

}

}