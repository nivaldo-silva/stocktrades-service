package io.github.nivaldosilva.stocktrades.dtos.response;

import java.math.BigDecimal;

public record PortfolioItemResponse(

        String stockId,
        String tickerSymbol,
        String companyName,
        BigDecimal currentPrice, 
        long totalQuantityOwned,
        BigDecimal totalCurrentValue) {

}
