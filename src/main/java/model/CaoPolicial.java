package model;

public class CaoPolicial extends TipoCachorro{

    private Integer drogasApreendidas;

    public CaoPolicial(Float adicionalEmocionalCachorro) {
        super(adicionalEmocionalCachorro);
    }

    @Override
    public Float calcularValorDoguito() {
        return raca.precoRaca() * (this.adicionalEmocionalCachorro + (1+drogasApreendidas/10f));
    }

    public void setDrogasApreendidas(Integer drogasApreendidas){
        this.drogasApreendidas = drogasApreendidas;
    }


}
