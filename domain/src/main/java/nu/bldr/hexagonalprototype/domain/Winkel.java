package nu.bldr.hexagonalprototype.domain;

import java.math.BigDecimal;
import java.util.HashMap;

public record Winkel(
        String naam,
        String plaatjeUrl,

        HashMap<Product, Integer> voorraad,

        BigDecimal omzet,

        Betaalmiddel betaalmiddelen
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
