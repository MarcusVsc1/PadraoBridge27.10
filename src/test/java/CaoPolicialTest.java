import model.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CaoPolicialTest {

    @Test
    public void caoPolicialDobermannTest(){
        CaoPolicial caoPolicial = new CaoPolicial(2f);
        caoPolicial.setRaca(new Dobermann());
        caoPolicial.setDrogasApreendidas(3);
        assertEquals(3300,caoPolicial.calcularValorDoguito(),0.01f);
    }

    @Test
    public void caoPolicialPitbullTest(){
        CaoPolicial caoPolicial = new CaoPolicial(3f);
        caoPolicial.setRaca(new Pitbull());
        caoPolicial.setDrogasApreendidas(7);
        assertEquals(3760,caoPolicial.calcularValorDoguito(),0.01f);
    }

    @Test
    public void caoPolicialPinscherTest(){
        CaoPolicial caoPolicial = new CaoPolicial(5f);
        caoPolicial.setRaca(new Pinscher());
        caoPolicial.setDrogasApreendidas(20);
        assertEquals(800,caoPolicial.calcularValorDoguito(),0.01f);
    }
}
