package nu.bldr.hexagonalprototype.restapi.dto;

public record ProductDTO(
        String id,
        String omschrijving,
        String plaatjeUrl,
        double prijs
) {
}
