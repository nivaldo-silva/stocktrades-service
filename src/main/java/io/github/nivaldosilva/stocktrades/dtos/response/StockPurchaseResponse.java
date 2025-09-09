package io.github.nivaldosilva.stocktrades.dtos.response;

import java.math.BigDecimal;
import java.time.LocalDate;

public record StockPurchaseResponse(

        String id,
        String stockId,
        String tickerSymbol,
        LocalDate purchaseDate,
        BigDecimal purchasePrice,
        long quantity,
        BigDecimal totalPurchaseCost) {

}
