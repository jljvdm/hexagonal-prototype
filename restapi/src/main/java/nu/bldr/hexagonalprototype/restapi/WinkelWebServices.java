package nu.bldr.hexagonalprototype.restapi;

import lombok.AllArgsConstructor;
import nu.bldr.hexagonalprototype.hexagonal.ports.in.WinkelUseCase;
import nu.bldr.hexagonalprototype.restapi.dto.ProductDTO;
import nu.bldr.hexagonalprototype.restapi.dto.VoorraadDTO;
import nu.bldr.hexagonalprototype.restapi.mapper.ProductMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/winkel")
@AllArgsConstructor
public class WinkelWebServices {

    WinkelUseCase winkelUseCase;

    ProductMapper productMapper;

    @GetMapping("/getProducten")
    public Flux<ProductDTO> getProducten() {
        return Flux.fromStream(winkelUseCase.getProducten().stream().map(productMapper::toProductDTO));
    }

    @GetMapping("/getVoorraad")
    public Flux<VoorraadDTO> getVoorraad() {
        return Flux.fromStream(winkelUseCase.getVoorraad().entrySet().stream().map(entry -> new VoorraadDTO(
                entry.getKey().id(),
                entry.getKey().omschrijving(),
                entry.getKey().plaatjeUrl(),
                entry.getValue()
        )));
    }

    @GetMapping("/getOmzet")
    public Mono<String> getOmzet() {
        return Mono.just(winkelUseCase.getOmzet().toString());
    }
}
