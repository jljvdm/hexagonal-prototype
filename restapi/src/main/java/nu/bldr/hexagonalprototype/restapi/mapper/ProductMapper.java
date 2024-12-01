package nu.bldr.hexagonalprototype.restapi.mapper;

import nu.bldr.hexagonalprototype.domain.Winkel;
import nu.bldr.hexagonalprototype.restapi.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toProductDTO(Winkel.Product product);
}
