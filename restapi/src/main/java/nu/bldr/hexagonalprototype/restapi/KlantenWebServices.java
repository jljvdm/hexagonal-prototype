package nu.bldr.hexagonalprototype.restapi;

import lombok.AllArgsConstructor;
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
@RequestMapping("/winkel/klanten")
@AllArgsConstructor
public class KlantenWebServices {

    WinkelKlantenUseCase winkelKlantenUseCase;

    WinkelUseCase winkelUseCase;

    WinkelkarMapper winkelkarMapper;

    @PutMapping("/addBoodschap")
    public Mono<String> addBoodschap(String boodschap, String winkelkarId) {
        winkelKlantenUseCase.addBoodschap(boodschap, winkelkarId);
        return Mono.just("Boodschap %s toegevoegd".formatted(boodschap));
    }

    @DeleteMapping("/removeBoodschap/{id}/{winkelkarId}")
    public Mono<String> removeBoodschap(@PathVariable("id") String boodschap, @PathVariable("winkelkarId") String winkelkarId) {
        winkelKlantenUseCase.removeBoodschap(boodschap, winkelkarId);
        return Mono.just("Boodschap %s verwijderd".formatted(boodschap));
    }

    @PostMapping("/betaal")
    public Mono<String> betaal(String winkelkarId) {
        return Mono.just(winkelKlantenUseCase.betaal(winkelkarId));
    }

    @PutMapping("/setBetaalmiddel")
    public Mono<String> setBetaalmiddel(String betaalmiddel,String winkelkarId) {
        winkelKlantenUseCase.setBetaalmiddel(betaalmiddel, winkelkarId);
        return Mono.just("Betaalmiddel %s ingesteld".formatted(betaalmiddel));
    }

    @GetMapping("/getNieuweWinkelkar")
    public Mono<WinkelkarDTO> getNieuweWinkelkar() {
        return Mono.just(winkelkarMapper.toWinkelKarDTO(winkelKlantenUseCase.getNieuweWinkelkar()));
    }

    @GetMapping("/getWinkelkar/{winkelkarId}")
    public Mono<WinkelkarDTO> getWinkelkar(@PathVariable("winkelkarId") String winkelkarId) {
        return Mono.just(winkelkarMapper.toWinkelKarDTO(winkelKlantenUseCase.getWinkelkar(winkelkarId)));
    }

    @GetMapping("/getBetaalmiddel")
    public Mono<String> getBetaalmiddel() {
        return Mono.just(winkelKlantenUseCase.getNieuweWinkelkar().betaalmiddel().toString());
    }

    @GetMapping("/getBetaalmiddelen")
    public Flux<String> getBetaalmiddelen() {
        return Flux.fromStream(winkelUseCase.getBetaalmiddelen().stream().map(Enum::toString));
    }
}
