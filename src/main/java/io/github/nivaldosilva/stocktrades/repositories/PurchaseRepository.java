package io.github.nivaldosilva.stocktrades.repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import io.github.nivaldosilva.stocktrades.entities.Purchase;

public interface PurchaseRepository extends MongoRepository<Purchase, String> {

    List<Purchase> findByStockId(String stockId);

    List<Purchase> findByUserId(String userId);

    List<Purchase> findByUserIdAndStockId(String userId, String stockId);

    void deleteByStockId(String stockId);

}
