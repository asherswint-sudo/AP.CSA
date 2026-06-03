package AfterTest;

public class SpecialCheckingAccount extends CheckingAccount{
    private double minBalance;
    private double intRate;
    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double ir, double mb) {
		super(idNumber, startBal, cc);
        minBalance = mb;
        intRate = ir;
	}
    public void clearCheck(double amount){
		if (super.currentBalance() > minBalance) decreaseBalance(amount);
        else super.clearCheck(amount);
	}
    public double monthlyInterest(){
        if(super.currentBalance() > minBalance) return super.currentBalance() * intRate / 12;
        else{
            return super.monthlyInterest();
        }
    }
}
