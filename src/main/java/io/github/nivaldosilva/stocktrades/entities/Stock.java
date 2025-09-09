package io.github.nivaldosilva.stocktrades.entities;

import java.math.BigDecimal;
import java.time.Instant;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "stocks")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Stock {

    @Id
    private String id;

    @Indexed(unique = true)
    @NotBlank
    @Size(min = 1, max = 10)
    @Pattern(regexp = "^[A-Z0-9]+$")
    private String tickerSymbol;

    @NotBlank
    @Size(min = 1, max = 200)
    private String companyName;

    @NotBlank
    @Size(min = 1, max = 100)
    private String sector;

    @NotBlank
    @Size(min = 3, max = 3)
    @Pattern(regexp = "^[A-Z]{3}$")
    private String currency;

    @Transient
    private BigDecimal currentPrice;

    @CreatedDate
    private Instant creationTimestamp;

    @LastModifiedDate
    private Instant updatedTimestamp;


}
