package nu.bldr.hexagonalprototype.infrastructure.services;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PersistenceService {

    BigDecimal omzet;

    public PersistenceService(){
        omzet = new BigDecimal(0);
    }

    public BigDecimal getOmzet(){
        return omzet;
    }

    public BigDecimal werkOmzetBij(BigDecimal deltaOmzet){
        return omzet.add(deltaOmzet);
    }
}
