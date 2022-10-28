package model;

import interfaces.Raca;

public class Dobermann implements Raca {
    @Override
    public Float precoRaca() {
        return 1000f;
    }
}
