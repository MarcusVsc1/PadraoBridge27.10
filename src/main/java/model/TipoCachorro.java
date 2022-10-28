package model;

import interfaces.Raca;

public abstract class TipoCachorro {

    protected Raca raca;
    protected Float adicionalEmocionalCachorro;

    public TipoCachorro(Float adicionalEmocionalCachorro) {
        this.adicionalEmocionalCachorro = adicionalEmocionalCachorro;
    }

    public void setRaca(Raca raca){
        this.raca = raca;
    }

    public abstract Float calcularValorDoguito();
}
