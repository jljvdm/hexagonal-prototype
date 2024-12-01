package nu.bldr.hexagonalprototype.restapi.dto;

import java.util.List;

public record WinkelkarDTO(
        String id,
        List<BoodschapDTO> boodschappen,
        String betaalmiddel
) {}
