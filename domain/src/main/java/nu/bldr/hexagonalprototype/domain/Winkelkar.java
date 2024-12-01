package nu.bldr.hexagonalprototype.domain;

import java.util.List;

public record Winkelkar(
        String id,
        List<Boodschap> boodschappen,
        Winkel.Betaalmiddel betaalmiddel
)
{
    public record Boodschap(
            String id,
            String tekst,
            double prijs
    ) {
    }

}
