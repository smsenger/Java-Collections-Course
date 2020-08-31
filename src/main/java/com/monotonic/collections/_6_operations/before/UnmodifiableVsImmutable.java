package com.monotonic.collections._6_operations.before;

import java.util.*;

public class UnmodifiableVsImmutable
{
    public static void main(String[] args)
    {
        Map<String, Integer> mutableCountryToPopulation = new HashMap<>();
        mutableCountryToPopulation.put("UK", 67);
        mutableCountryToPopulation.put("USA", 328);

        Map<String, Integer> unmodifiableCountryToPop =
                Collections.unmodifiableMap(mutableCountryToPopulation);
    }

    //Map<String, Integer> copiedCountryToPop = Map.copyOf(mutableCountryToPop);

}
