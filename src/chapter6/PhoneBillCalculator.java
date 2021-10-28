package chapter6;

public class PhoneBillCalculator {
    public static void main(String[] args){
        PhoneBill bill = new PhoneBill();
        bill.setMinutesUsed(801);
        bill.printItemizedBill();
    }
}
