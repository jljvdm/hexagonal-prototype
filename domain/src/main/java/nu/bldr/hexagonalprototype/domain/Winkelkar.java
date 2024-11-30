package nu.bldr.hexagonalprototype.domain;

import java.util.List;

public record Winkelkar(
        List<Boodschap> boodschappen,
        Betaalmiddel betaalmiddel
)
{
    public record Boodschap(
            String id,
            String tekst,
            double prijs
    ) {
    }
    public enum Betaalmiddel {
        CONTANT,
        CREDITCARD,
        BANKPAS
    }
}
