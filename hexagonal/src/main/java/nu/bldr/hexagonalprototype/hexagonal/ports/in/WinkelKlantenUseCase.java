package nu.bldr.hexagonalprototype.hexagonal.ports.in;

import nu.bldr.hexagonalprototype.domain.Winkelkar;

import java.util.List;

public interface WinkelKlantenUseCase {

    void addBoodschap(String boodschap);
    void removeBoodschap(String id);
    String betaal(String winkelkarId);
    void setBetaalmiddel(String betaalmiddel);
    Winkelkar getWinkelkar();

}
