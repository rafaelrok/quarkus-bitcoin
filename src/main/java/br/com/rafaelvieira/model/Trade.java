package br.com.rafaelvieira.model;

import java.sql.Timestamp;

public class Trade {

    private Long id;
    private Long tid;
    private Timestamp date;
    private String type;
    private Double price;
    private Double amount;

    @Override
    public String toString() {
        return "Trade{" +
                "tid=" + tid +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
