package nu.bldr.hexagonalprototype.hexagonal.ports;

import lombok.RequiredArgsConstructor;
import nu.bldr.hexagonalprototype.domain.Winkelkar;
import nu.bldr.hexagonalprototype.hexagonal.ports.in.WinkelUseCase;
import nu.bldr.hexagonalprototype.hexagonal.ports.out.WinkelkarPort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Winkel implements WinkelUseCase {

    private WinkelkarPort winkelkarPort;

    @Override
    public void addBoodschap(String boodschap) {
        winkelkarPort.addBoodschap(boodschap);
    }

    @Override
    public void removeBoodschap(String id) {
        winkelkarPort.removeBoodschap(id);
    }

    @Override
    public String betaal() {
        String betaalmiddel = winkelkarPort.getBetaalmiddel();
        winkelkarPort.betaal();
        return "Bedankt voor het betalen met de %s".formatted(betaalmiddel);
    }

    @Override
    public void setBetaalmiddel(String betaalmiddel) {
        winkelkarPort.setBetaalmiddel(betaalmiddel);
    }

    @Override
    public Winkelkar getWinkelkar() {
        return winkelkarPort.getWinkelkar();
    }
}
