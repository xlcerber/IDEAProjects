package com.epam;

public class RecommendatorImpl implements Recommendator {
    // А-ля @value в Spring'е.
    // Можно прописать название property,
    // но если совпадает с названием property, то ничего не пишем
    @InjectProperty
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("to pretect from COVID-19, drink " + alcohol);
    }
}
