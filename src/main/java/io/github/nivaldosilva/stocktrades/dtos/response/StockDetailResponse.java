package io.github.nivaldosilva.stocktrades.dtos.response;

import java.math.BigDecimal;
import java.time.Instant;

public record StockDetailResponse(

                String id,
                String tickerSymbol,
                String companyName,
                String sector,
                String currency,
                BigDecimal currentPrice,
                Instant creationTimestamp,
                Instant updatedTimestamp) {

}
