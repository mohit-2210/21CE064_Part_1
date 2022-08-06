class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date datecreated;

    public Account()
    {
        System.out.println("Account is created");
        id=0;
        balance=500;
        annualInterestRate=7;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getData() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }
    public double getMonthlyInterestRate()
    {
          return (annualInterestRate / 12.0);
    }
    public double getMonthlyInterest()
    {
        return (balance/100)*getMonthlyInterestRate();
    }

    public void withdraw()
    {
        System.out.println("Enter money to withdraw : ");
        Scanner sc=new Scanner(System.in);
        double Withdraw=sc.nextDouble();
        if(Withdraw>balance)
        {
            System.out.println("Insufficient Balance!!!");
        }
        else
        {
            balance=balance-Withdraw;
            System.out.println("Rainning Balance : "+balance);
        }
    }
    public void deposit()
    {
        System.out.println("Enter money to deposit : ");
        Scanner sc=new Scanner(System.in);
        double Deposit=sc.nextDouble();
        balance=balance+Deposit;
        System.out.println("Your account balance is : "+balance);
    }
}
public class P2_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account A1=new Account();
        System.out.println("Enter your id : ");
        int ID=sc.nextInt();
        A1.setId(ID);
        System.out.println("Enter your balance : ");
        double bal=sc.nextDouble();
        A1.setBalance(bal);
        Date date = new Date();
        A1.setDatecreated(date);
        System.out.println(A1.getData());
        System.out.println("Enter Annual interest rate : ");
        double intrest=sc.nextDouble();
        A1.setAnnualInterestRate(intrest);
        System.out.println("Your monthly interest is : "+A1.getMonthlyInterest());
        boolean bol=true;
        while(bol) {
            System.out.println("Press 1 to withdraw.\nPress 2 to deposit.\nPress 3 to exit.");
            int n = sc.nextInt(4);
            switch (n) {
                case 1 -> A1.withdraw();
                case 2 -> A1.deposit();
                case 3 -> bol = false;
                default -> System.out.println("Wrong Input");
            }
        }
        System.out.println("Successfully Exited!!!");
    }
}
