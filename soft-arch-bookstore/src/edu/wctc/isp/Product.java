package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface Product {

    double getCost();

    String getFormattedReleaseDate();

    int getQuantityOnHand();

    LocalDate getReleaseDate();

    String getTitle();

    void order(int quantity);

}
