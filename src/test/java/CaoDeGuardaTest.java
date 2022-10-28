import model.CaoDeGuarda;
import model.Dobermann;
import model.Pinscher;
import model.Pitbull;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CaoDeGuardaTest {

    @Test
    public void caoDeGuardaDobermannTest(){
        CaoDeGuarda caoDeGuarda = new CaoDeGuarda(2f);
        caoDeGuarda.setRaca(new Dobermann());
        assertEquals(4000f,caoDeGuarda.calcularValorDoguito(),0.01f);
    }

    @Test
    public void caoDeGuardaPitbullTest(){
        CaoDeGuarda caoDeGuarda = new CaoDeGuarda(3f);
        caoDeGuarda.setRaca(new Pitbull());
        assertEquals(4800f,caoDeGuarda.calcularValorDoguito(),0.01f);
    }

    @Test
    public void caoDeGuardaPinscherTest(){
        CaoDeGuarda caoDeGuarda = new CaoDeGuarda(4f);
        caoDeGuarda.setRaca(new Pinscher());
        assertEquals(800f,caoDeGuarda.calcularValorDoguito(),0.01f);
    }


}
