package nu.bldr.hexagonalprototype.hexagonal.ports.in;

import nu.bldr.hexagonalprototype.domain.Winkel;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface WinkelUseCase {

    public List<Winkel.Product> getProducten();

    public BigDecimal getOmzet();

    public Map<Winkel.Product, Integer> getVoorraad();

    public Winkel getWinkel();

    List<Winkel.Betaalmiddel> getBetaalmiddelen();

}
