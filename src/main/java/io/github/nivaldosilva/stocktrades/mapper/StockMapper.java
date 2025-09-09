package io.github.nivaldosilva.stocktrades.mapper;

import java.math.BigDecimal;
import io.github.nivaldosilva.stocktrades.dtos.request.StockMasterDataRequest;
import io.github.nivaldosilva.stocktrades.dtos.request.StockPurchaseRequest;
import io.github.nivaldosilva.stocktrades.dtos.response.PortfolioItemResponse;
import io.github.nivaldosilva.stocktrades.dtos.response.StockDetailResponse;
import io.github.nivaldosilva.stocktrades.dtos.response.StockPurchaseResponse;
import io.github.nivaldosilva.stocktrades.entities.Purchase;
import io.github.nivaldosilva.stocktrades.entities.Stock;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StockMapper {

    public static Stock toStock(StockMasterDataRequest request) {
        return Stock.builder()
                .tickerSymbol(request.tickerSymbol())
                .companyName(request.companyName())
                .sector(request.sector())
                .currency(request.currency())
                .build();
    }

    public static Purchase toStockPurchase(StockPurchaseRequest request) {
        return Purchase.builder()
                .stockId(request.stockId())
                .userId(request.userId())
                .quantity(request.quantity())
                .purchasePrice(request.purchasePrice())
                .purchaseDate(request.purchaseDate())
                .build();
    }

    public static StockDetailResponse toStockDetailResponse(Stock stock, BigDecimal currentPrice) {
        return new StockDetailResponse(
                stock.getId(),
                stock.getTickerSymbol(),
                stock.getCompanyName(),
                stock.getSector(),
                stock.getCurrency(),
                currentPrice, 
                stock.getCreationTimestamp(),
                stock.getUpdatedTimestamp());
    }

    public static StockPurchaseResponse toStockPurchaseResponse(Purchase purchase, String tickerSymbol) {
        return new StockPurchaseResponse(
                purchase.getId(),
                purchase.getStockId(),
                tickerSymbol,
                purchase.getPurchaseDate(),
                purchase.getPurchasePrice(),
                purchase.getQuantity(),
                purchase.getPurchasePrice().multiply(BigDecimal.valueOf(purchase.getQuantity())));
    }

    public static PortfolioItemResponse toPortfolioItemResponse(
            String stockId,
            String tickerSymbol,
            String companyName,
            BigDecimal currentPrice,
            long totalQuantityOwned) {
        return new PortfolioItemResponse(
                stockId,
                tickerSymbol,
                companyName,
                currentPrice,
                totalQuantityOwned,
                currentPrice.multiply(BigDecimal.valueOf(totalQuantityOwned)));
    }
}
