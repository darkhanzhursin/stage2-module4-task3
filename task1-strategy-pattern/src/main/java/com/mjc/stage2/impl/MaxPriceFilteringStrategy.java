package com.mjc.stage2.impl;


import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import com.mjc.stage2.FilteringStrategy;
import com.mjc.stage2.Product;

@AllArgsConstructor
public class MaxPriceFilteringStrategy implements FilteringStrategy {
    private double maxPrice;

    @Override public boolean filter(final Product product) {
        return product.getPrice() <= maxPrice;
    }
}
