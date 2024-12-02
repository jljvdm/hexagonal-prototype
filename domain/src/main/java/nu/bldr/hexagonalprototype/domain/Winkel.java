package nu.bldr.hexagonalprototype.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public record Winkel(
        String naam,
        String plaatjeUrl,

        HashMap<Product, Integer> voorraad,

        BigDecimal omzet,

        List<Betaalmiddel> betaalmiddelen
) {
    public record Product(
            String id,
            String omschrijving,
            String plaatjeUrl,
            BigDecimal prijs
    ) {

    }
    public enum Betaalmiddel {
        CONTANT,
        CREDITCARD,
        BANKPAS
    }
}
