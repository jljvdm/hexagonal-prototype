package nu.bldr.hexagonalprototype.hexagonal.ports.in;

import nu.bldr.hexagonalprototype.domain.Winkelkar;

public interface WinkelKlantenUseCase {

    void addBoodschap(String boodschap, String winkelkarId);
    void removeBoodschap(String id, String winkelkarId);
    String betaal(String winkelkarId);
    void setBetaalmiddel(String betaalmiddel, String winkelkarId);
    Winkelkar getNieuweWinkelkar();
    Winkelkar getWinkelkar(String winkelkarId);

}
