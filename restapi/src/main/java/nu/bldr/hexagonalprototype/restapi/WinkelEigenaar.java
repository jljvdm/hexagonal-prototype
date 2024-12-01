package nu.bldr.hexagonalprototype.restapi;

import lombok.AllArgsConstructor;
import nu.bldr.hexagonalprototype.domain.Winkel;
import nu.bldr.hexagonalprototype.hexagonal.ports.in.WinkelUseCase;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class WinkelEigenaar {

    private WinkelUseCase winkelUseCase;

    public Winkel getWinkel() {
        return winkelUseCase.getWinkel();
    }

    public List<Winkel.Product> getProducten() {
        return winkelUseCase.getProducten();
    }
}
