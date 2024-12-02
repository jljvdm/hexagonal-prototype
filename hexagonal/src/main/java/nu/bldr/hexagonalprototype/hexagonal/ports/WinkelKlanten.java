package nu.bldr.hexagonalprototype.hexagonal.ports;

import lombok.RequiredArgsConstructor;
import nu.bldr.hexagonalprototype.domain.Winkel;
import nu.bldr.hexagonalprototype.domain.Winkelkar;
import nu.bldr.hexagonalprototype.hexagonal.ports.in.WinkelKlantenUseCase;
import nu.bldr.hexagonalprototype.hexagonal.ports.in.WinkelUseCase;
import nu.bldr.hexagonalprototype.hexagonal.ports.out.WinkelPort;
import nu.bldr.hexagonalprototype.hexagonal.ports.out.WinkelkarPort;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class WinkelKlanten implements WinkelKlantenUseCase, WinkelUseCase {

    private WinkelkarPort winkelkarPort;

    private WinkelPort winkelPort;

    @Override
    public void addBoodschap(String boodschap, String winkelkarId) {
        winkelkarPort.addBoodschap(boodschap, winkelkarId);
    }

    @Override
    public void removeBoodschap(String id, String winkelkarId) {
        winkelkarPort.removeBoodschap(id, winkelkarId);
    }

    @Override
    public String betaal(String winkelkarId) {
        String betaalmiddel = winkelkarPort.getBetaalmiddel();
        winkelkarPort.betaal(winkelkarId);
        return "Bedankt voor het betalen met de %s".formatted(betaalmiddel);
    }

    @Override
    public void setBetaalmiddel(String betaalmiddel, String winkelkarId) {
        winkelkarPort.setBetaalmiddel(betaalmiddel, winkelkarId );
    }

    @Override
    public Winkelkar getNieuweWinkelkar() {
        return winkelkarPort.getNieuweWinkelkar();
    }

    @Override
    public Winkelkar getWinkelkar(String winkelkarId) {
        return winkelkarPort.getWinkelkar(winkelkarId);
    }


    @Override
    public List<Winkel.Betaalmiddel> getBetaalmiddelen() {
        return Arrays.stream(Winkel.Betaalmiddel.values()).toList();
    }

    @Override
    public List<Winkel.Product> getProducten() {
        return List.of();
    }

    @Override
    public BigDecimal getOmzet() {
        return winkelPort.getOmzet();
    }

    @Override
    public Map<Winkel.Product, Integer> getVoorraad() {
        return Map.of();
    }

    @Override
    public Winkel getWinkel() {
        return winkelPort.getWinkel();
    }
}
