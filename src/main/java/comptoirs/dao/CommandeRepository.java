package comptoirs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import comptoirs.entity.Commande;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {
    @Query("SELECT SUM(l.quantite * p.prixUnitaire * (1 - c.remise)) " +
            "FROM Ligne l " +
            "JOIN l.produit p " +
            "JOIN l.commande c " +
            "WHERE c.numero = :numeroCommande")


    BigDecimal montantArticles(Integer numeroCommande);
}
