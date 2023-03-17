public class Drob {
    public int numerator=0;
    public int denumerator=0;
    public String s;
    public void setDenumerator(int denumerator) {
        if (denumerator == 0){
            System.out.println("Ошибка");
            System.exit(1);
        }
        else {
            this.denumerator = denumerator;
        }
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenumerator() {
        return denumerator;
    }
    public void setPlus(Drob one, Drob two) {
        this.numerator = one.getNumerator() * two.getDenumerator() + two.getNumerator() * one.getDenumerator();
        this.denumerator = one.getDenumerator() * two.getDenumerator();
    }
    public void setMinus(Drob one, Drob two){
        this.numerator = one.getNumerator() * two.getDenumerator() - two.getNumerator() * one.getDenumerator();
        this.denumerator = one.getDenumerator() * two.getDenumerator();
    }
    public void setMultiply(Drob one, Drob two){
        this.numerator = one.getNumerator() * two.getNumerator();
        this.denumerator = one.getDenumerator() * two.getDenumerator();
    }
    public void setDivide(Drob one, Drob two) {
        this.numerator = two.getNumerator() * one.getDenumerator();
        this.denumerator = one.getNumerator() * two.getDenumerator();
    }
    public void print() {
        System.out.println(numerator +"/"+ denumerator);
    }
    public void Zamena() {
        s = numerator +"/"+ denumerator;
    }
    public String gets() {
        return s;
    }
}