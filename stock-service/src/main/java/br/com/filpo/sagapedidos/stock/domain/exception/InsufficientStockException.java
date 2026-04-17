package br.com.filpo.sagapedidos.stock.domain.exception;

public class InsufficientStockException extends RuntimeException {
    public InsufficientStockException(String productId, Integer requested, Integer available) {
        super("Insufficient stock for product " + productId +
              ": requested=" + requested + ", available=" + available);
    }
}
