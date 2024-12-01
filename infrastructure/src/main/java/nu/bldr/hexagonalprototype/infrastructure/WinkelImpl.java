package nu.bldr.hexagonalprototype.infrastructure;

import lombok.AllArgsConstructor;
import nu.bldr.hexagonalprototype.domain.Winkel;
import nu.bldr.hexagonalprototype.hexagonal.ports.out.WinkelPort;
import nu.bldr.hexagonalprototype.infrastructure.services.PersistenceService;

import java.math.BigDecimal;

@AllArgsConstructor
public class WinkelImpl implements WinkelPort {
    PersistenceService persistenceService;

    @Override
    public BigDecimal getOmzet() {
        return persistenceService.getOmzet();
    }

    @Override
    public BigDecimal werkOmzetBij(BigDecimal deltaOmzet) {
        return persistenceService.werkOmzetBij(deltaOmzet);
    }

    @Override
    public void werkVoorraadBij(Winkel.Product product, int aantal) {

    }

    @Override
    public Winkel getWinkel() {
        return null;
    }
}
