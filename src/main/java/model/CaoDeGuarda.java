package model;

public class CaoDeGuarda extends TipoCachorro{

    public CaoDeGuarda(Float adicionalEmocionalCachorro) {
        super(adicionalEmocionalCachorro);
    }

    @Override
    public Float calcularValorDoguito() {
        return raca.precoRaca() * this.adicionalEmocionalCachorro * 2;
    }
}
