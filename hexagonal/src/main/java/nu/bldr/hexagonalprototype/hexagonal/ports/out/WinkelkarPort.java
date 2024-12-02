package nu.bldr.hexagonalprototype.hexagonal.ports.out;

import nu.bldr.hexagonalprototype.domain.Winkelkar;

public interface WinkelkarPort {
    void addBoodschap(String boodschap, String winkelkarId);
    void removeBoodschap(String boodschap, String winkelkarId);
    void betaal(String winkelkarId);
    void setBetaalmiddel(String betaalmiddel, String winkelkarId);
    Winkelkar getNieuweWinkelkar();
    Winkelkar getWinkelkar(String winkelkarId);
    String getBetaalmiddel();

}
