package nu.bldr.hexagonalprototype.restapi;

import lombok.AllArgsConstructor;
import nu.bldr.hexagonalprototype.domain.Winkelkar;
import nu.bldr.hexagonalprototype.hexagonal.ports.in.WinkelKlantenUseCase;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class WinkelBediende {

    private final WinkelKlantenUseCase winkelUseCae;


    public String addBoodschap(String boodschap) {
        return "Boodschap %s toegevoegd".formatted(boodschap);
    }

    public String removeBoodschap(String boodschap) {
        return "Boodschap %s verwijderd".formatted(boodschap);
    }

    public String betaal() {
        return "Bedankt voor het betalen";
    }

    public String setBetaalmiddel(String betaalmiddel) {
        return "Betaalmiddel %s ingesteld".formatted(betaalmiddel);
    }

    public Winkelkar getWinkelkar() {
        return null;
    }

    public String getBetaalmiddel() {
        return "Betaalmiddel opgehaald";
    }


}
