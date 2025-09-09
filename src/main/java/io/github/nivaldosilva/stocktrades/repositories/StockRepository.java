package io.github.nivaldosilva.stocktrades.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import io.github.nivaldosilva.stocktrades.entities.Stock;

public interface StockRepository extends MongoRepository<Stock, String> {

    Optional<Stock> findByTickerSymbol(String tickerSymbol);

    List<Stock> findByIdIn(List<String> ids);

}
