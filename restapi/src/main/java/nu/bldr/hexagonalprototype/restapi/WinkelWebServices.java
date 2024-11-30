package nu.bldr.hexagonalprototype.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/winkel")
public class WinkelWebServices {

    WinkelBediende winkelBediende;
}
