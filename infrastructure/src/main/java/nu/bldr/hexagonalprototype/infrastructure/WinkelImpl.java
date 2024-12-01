package nu.bldr.hexagonalprototype.infrastructure;

import nu.bldr.hexagonalprototype.domain.Winkel;
import nu.bldr.hexagonalprototype.hexagonal.ports.out.WinkelPort;

import java.math.BigDecimal;

public class WinkelImpl implements WinkelPort {

    @Override
    public BigDecimal getOmzet() {
        return null;
    }

    @Override
    public BigDecimal werkOmzetBij(BigDecimal omzet) {
        return null;
    }

    @Override
    public void werkVoorraadBij(Winkel.Product product, int aantal) {

    }

    @Override
    public Winkel getWinkel() {
        return null;
    }
}
