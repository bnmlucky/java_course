package chapter9;

public class BirthdayCake extends Cake {
    int candles;

    public BirthdayCake() {
        super("chocolate"); // this is how I set the flavor
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }


}
