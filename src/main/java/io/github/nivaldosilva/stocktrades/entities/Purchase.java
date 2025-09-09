package io.github.nivaldosilva.stocktrades.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "purchases")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {

    @Id
    private String id;

    @NotNull
    @Field(name = "stock_id")
    private String stockId;

    @NotNull
    @Field(name = "user_id")
    private String userId;

    @NotNull
    @Positive
    private Long quantity;

    @NotNull
    @Positive
    private BigDecimal purchasePrice;

    @NotNull
    @PastOrPresent
    private LocalDate purchaseDate;

    @CreatedDate
    private Instant creationTimestamp;

    @LastModifiedDate
    private Instant updatedTimestamp;

    

}
