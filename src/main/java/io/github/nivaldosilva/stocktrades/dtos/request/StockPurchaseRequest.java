package io.github.nivaldosilva.stocktrades.dtos.request;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

public record StockPurchaseRequest(

        @NotBlank String stockId,
        @NotBlank String userId,
        @NotNull @Positive long quantity,
        @NotNull @Positive BigDecimal purchasePrice,
        @NotNull @PastOrPresent LocalDate purchaseDate) {

}
