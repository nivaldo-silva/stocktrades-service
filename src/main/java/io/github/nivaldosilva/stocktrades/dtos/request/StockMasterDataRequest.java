package io.github.nivaldosilva.stocktrades.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record StockMasterDataRequest(

                @NotBlank @Size(min = 1, max = 10) @Pattern(regexp = "^[A-Z0-9]+$") String tickerSymbol,
                @NotBlank @Size(min = 1, max = 200) String companyName,
                @NotBlank @Size(min = 1, max = 100) String sector,
                @NotBlank @Size(min = 3, max = 3) @Pattern(regexp = "^[A-Z]{3}$") String currency) {

}
