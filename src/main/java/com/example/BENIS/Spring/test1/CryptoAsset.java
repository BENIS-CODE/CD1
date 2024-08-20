package com.example.BENIS.Spring.test1;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CRYPTOASSET")
public class CryptoAsset {
    @Id
    private String symbol;

    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "CryptoAsset{" +
                "symbol='" + symbol + '\'' +
                ", total=" + total +
                '}';
    }


}
