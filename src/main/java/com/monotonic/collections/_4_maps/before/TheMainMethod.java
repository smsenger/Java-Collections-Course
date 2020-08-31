package com.monotonic.collections._4_maps.before;

import static com.monotonic.collections._4_maps.before.Java8Enhancements.java8Enhancements;
import static com.monotonic.collections._4_maps.before.LookupTableComparison.lookupTableComparison;
import static com.monotonic.collections._4_maps.before.MutableHashMapKeys.mutableHashMapKeys;
import static com.monotonic.collections._4_maps.before.ViewsOverMaps.viewsOverMaps;
import static com.monotonic.collections._5_streams.before.EnterTheCollector.enterTheCollector;
import static com.monotonic.collections._6_operations.before.CollectionOperations.collectionOperations;
import static com.monotonic.collections._6_operations.before.ShipmentsBreaker.shipmentsBreaker;

public class TheMainMethod {

    public static void main(String[] args) {
        viewsOverMaps();
        mutableHashMapKeys();
        lookupTableComparison();
        java8Enhancements();
        enterTheCollector();
        collectionOperations();
        shipmentsBreaker();
    }
}
