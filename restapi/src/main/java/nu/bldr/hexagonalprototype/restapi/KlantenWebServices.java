package nu.bldr.hexagonalprototype.restapi;

import nu.bldr.hexagonalprototype.hexagonal.ports.in.WinkelKlantenUseCase;
import nu.bldr.hexagonalprototype.hexagonal.ports.in.WinkelUseCase;
import nu.bldr.hexagonalprototype.restapi.dto.WinkelkarDTO;
import nu.bldr.hexagonalprototype.restapi.mapper.WinkelkarMapper;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/winkel/klanten ")
public class KlantenWebServices {

    WinkelKlantenUseCase winkelKlantenUseCase;

    WinkelUseCase winkelUseCase;

    WinkelkarMapper winkelkarMapper;

    @RequestMapping("/addBoodschap")
    public Mono<String> addBoodschap(String boodschap) {
        winkelKlantenUseCase.addBoodschap(boodschap);
        return Mono.just("Boodschap %s toegevoegd".formatted(boodschap));
    }

    @DeleteMapping("/removeBoodschap/{id}")
    public Mono<String> removeBoodschap(@PathVariable("id") String boodschap) {
        winkelKlantenUseCase.removeBoodschap(boodschap);
        return Mono.just("Boodschap %s verwijderd".formatted(boodschap));
    }

    @PostMapping("/betaal")
    public Mono<String> betaal() {
        return Mono.just(winkelKlantenUseCase.betaal());
    }

    @PutMapping("/setBetaalmiddel")
    public Mono<String> setBetaalmiddel(String betaalmiddel) {
        winkelKlantenUseCase.setBetaalmiddel(betaalmiddel);
        return Mono.just("Betaalmiddel %s ingesteld".formatted(betaalmiddel));
    }

    @GetMapping("/getWinkelkar")
    public Mono<WinkelkarDTO> getWinkelkar() {
        return Mono.just(winkelkarMapper.toWinkelKarDTO(winkelKlantenUseCase.getWinkelkar()));
    }

    @GetMapping("/getBetaalmiddel")
    public Mono<String> getBetaalmiddel() {
        return Mono.just(winkelKlantenUseCase.getWinkelkar().betaalmiddel().toString());
    }

    @GetMapping("/getBetaalmiddelen")
    public Flux<String> getBetaalmiddelen() {
        return Flux.fromStream(winkelUseCase.getBetaalmiddelen().stream().map(Enum::toString));
    }
}
