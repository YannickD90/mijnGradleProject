public class Fraction {
 private int teller;
 private int noemer;

    public Fraction(int teller, int noemer) {
        this.teller = teller;
        this.noemer = noemer;
    }


    public Fraction plus(Fraction input){
        Fraction output = new Fraction(0,0);
        int m1 = this.getTeller() * input.getNoemer();
        int m2 = this.getNoemer() * input.getTeller();

        int m3 = this.getNoemer() * input.getNoemer();

        output.setTeller(m1+m2);
        output.setNoemer(m3);

        return output;
    }

    public Fraction minus(Fraction input){
        Fraction output = new Fraction(0,0);
        int m1 = this.getTeller() * input.getNoemer();
        int m2 = this.getNoemer() * input.getTeller();

        int m3 = this.getNoemer() * input.getNoemer();

        output.setTeller((m1-m2));
        output.setNoemer(m3);

        return output;
    }

    public Fraction maal(Fraction input){
        Fraction output = new Fraction(0,0);
        int m1 = this.getTeller() * input.getTeller();
        int m2 = this.getNoemer() * input.getNoemer();

        output.setTeller(m1);
        output.setNoemer(m2);

        return output;
    }

    public Fraction over(Fraction input){
        Fraction output = new Fraction(0,0);
        input.omKering();
        int m1 = this.getTeller() * input.getTeller();
        int m2 = this.getNoemer() * input.getNoemer();

        output.setTeller(m1);
        output.setNoemer(m2);

        return output;
    }

    public void omKering(){
        Fraction output = new Fraction(0,0);
        int m1 = this.getTeller();
        int m2 = this.getNoemer();

        this.setTeller(m2);
        this.setNoemer(m1);

    }


    public String ToString(Fraction input,Fraction input2){
        String output = teller + " / " + noemer;
        return output;
    }


    public int getTeller() {
        return teller;
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }

    public int getNoemer() {
        return noemer;
    }

    public void setNoemer(int noemer) {
        this.noemer = noemer;
    }
}
