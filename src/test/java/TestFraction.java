import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestFraction {

    Fraction test;
    Fraction test2;
    Fraction test3;

    public static void main(String[] args) {

    }

    @Before  //gaat dit altijd uitvoeren voor hij begint aan een test
    public void setup(){
        test = new Fraction(5,10);
        test2 = new Fraction(5,10);
    }

    @Test
    public void omkeringMoetTellerEnNoemerOmdraaien(){

        Fraction test = new Fraction(5,10);
        test.omKering();
        if(test.getTeller() != 10 && test.getNoemer() != 5) {
            Assert.assertTrue("Het is niet succesvol omgedraaid", false);
        }


    }

    @Test
    public void plusMoetCorrectZijn(){

        test3 = test.plus(test2);
        if (test3.getTeller() != 100 || test3.getNoemer() != 100){
            Assert.assertTrue("Plus is incorrect",false);
        }


    }

    @Test
    public void minMoetCorrectZijn(){

        test3 = test.minus(test2);
        if (test3.getTeller() != 0 || test3.getNoemer() != 100){
            Assert.assertTrue("Minus is incorrect",false);
        }

    }

    @Test
    public void maalMoetcorrectZijn(){

        test3 = test.maal(test2);
        if (test3.getTeller() != 25 || test3.getNoemer() != 100){
            Assert.assertTrue("maal is incorrect",false);
        }
    }

    @Test
    public void deelMoetcorectZijn(){

        test3 = test.over(test2);
        if (test3.getTeller() != 50 || test3.getNoemer() != 50){
            Assert.assertTrue("over is incorrect",false);
        }
    }




}
