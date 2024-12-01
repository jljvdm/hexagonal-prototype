package nu.bldr.hexagonalprototype.hexagonal.ports.out;

import nu.bldr.hexagonalprototype.domain.Winkel;

import java.math.BigDecimal;

public interface WinkelPort {

    public BigDecimal getOmzet();

    public BigDecimal werkOmzetBij(BigDecimal omzet);

    public void werkVoorraadBij(Winkel.Product product, int aantal);

    public Winkel getWinkel();

}
