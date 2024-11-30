package nu.bldr.hexagonalprototype.hexagonal.ports.in;

import nu.bldr.hexagonalprototype.domain.Winkelkar;

public interface WinkelUseCase {

    void addBoodschap(String boodschap);
    void removeBoodschap(String id);
    String betaal();
    void setBetaalmiddel(String betaalmiddel);
    Winkelkar getWinkelkar();
}
