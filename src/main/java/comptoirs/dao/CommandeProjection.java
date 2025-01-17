package comptoirs.dao;
import java.math.BigDecimal;

public interface CommandeProjection {
    Integer getNumero();
    String getPort();
    BigDecimal getMontantTotal();
}

