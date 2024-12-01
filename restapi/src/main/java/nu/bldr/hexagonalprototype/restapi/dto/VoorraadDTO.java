package nu.bldr.hexagonalprototype.restapi.dto;

public record VoorraadDTO(
        String productId,
        String omschrijving,
        String plaatjeUrl,
        int aantal
) {
}
