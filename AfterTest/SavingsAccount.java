package AfterTest;

public class SavingsAccount extends Account{
    private double intRate;
    public SavingsAccount(int id, double startBal, double i){
        super(id, startBal);
        intRate = i;
    }

    public double monthlyInterest(){
        return super.currentBalance() * intRate / 12.0;
    }
    public void withdraw(double w){
        if(super.currentBalance() > w) super.decreaseBalance(w);
    }



}
