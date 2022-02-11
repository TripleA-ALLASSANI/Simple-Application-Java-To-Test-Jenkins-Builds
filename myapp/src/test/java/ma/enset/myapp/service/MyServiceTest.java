package ma.enset.myapp.service;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyServiceTest {
    @Test
    public void testComputer() {
        MyService myService = new MyService();
        double a = 12;
        double b= 8;
        double excepted = 20;
        double result = myService.computer(a, b);
        /*
        import static org.junit.Assert.assertEquals;
         * pr eviter les erreurs dues à des imprecisions, assertEquals avec 2 params est deprecié
         * Soution: puisq assertEquals est une methode surchargée, il est preferable d'utiliser:
         * La methode assertEquals avec 3 params
         */
        //assertEquals(result, excepted,0.001);
        /*
        import static org.junit.Assert.*;
        autre maniere decrire ce meme test en utilisant la valeur absolue
        */
        assertTrue(Math.abs(result-excepted)<0.001);
    }
}
