package nu.bldr.hexagonalprototype.hexagonal.ports.out;

import nu.bldr.hexagonalprototype.domain.Winkelkar;

public interface WinkelkarPort {
    void addBoodschap(String boodschap);
    void removeBoodschap(String boodschap);
    void betaal();
    void setBetaalmiddel(String betaalmiddel);
    Winkelkar getWinkelkar();

    String getBetaalmiddel();
}
