
class Test{
    private double balance;
    public Test(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("You Deposited: Rs"+amount+" and your balance is Rs. "+balance);
        }else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("You withdraw: Rs"+amount+" and your balance is Rs");
        }
        else {
            System.out.println("Invalid withdrawl amount or insufficient Balance");
        }
    }
    public void showBalance(){
        System.out.println("Curren Balance is Rs."+balance);
    }
}

public class Enc {
    public static void main(String[] args) {
        Test acc=new Test(0);
        acc.showBalance();
        acc.deposit(500);
        acc.showBalance();
        acc.deposit(0);
        acc.showBalance();
        acc.withdraw(600);
        acc.withdraw(400);
        acc.showBalance();
    }
}
