package nu.bldr.hexagonalprototype.restapi.mapper;

import nu.bldr.hexagonalprototype.domain.Winkelkar;
import nu.bldr.hexagonalprototype.restapi.dto.WinkelkarDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WinkelkarMapper {
    WinkelkarDTO toWinkelKarDTO(Winkelkar winkelKar);
}
