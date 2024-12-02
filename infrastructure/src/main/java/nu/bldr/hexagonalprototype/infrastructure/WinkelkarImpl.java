package nu.bldr.hexagonalprototype.infrastructure;

import nu.bldr.hexagonalprototype.domain.Winkelkar;
import nu.bldr.hexagonalprototype.hexagonal.ports.out.WinkelkarPort;
import org.springframework.stereotype.Service;

@Service
public class WinkelkarImpl implements WinkelkarPort {
    @Override
    public void addBoodschap(String boodschap, String winkelkarId) {

    }

    @Override
    public void removeBoodschap(String boodschap, String winkelkarId) {

    }

    @Override
    public void betaal(String winkelkarId) {

    }

    @Override
    public void setBetaalmiddel(String betaalmiddel, String winkelkarId) {

    }

    @Override
    public Winkelkar getWinkelkar() {
        return null;
    }

    @Override
    public String getBetaalmiddel() {
        return "";
    }
}
