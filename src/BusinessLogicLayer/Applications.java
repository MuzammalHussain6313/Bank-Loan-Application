package BusinessLogicLayer;

public class Applications
{
    private Person person = new Person();
    private Account account = new Account();
    private Loan loan = new Loan();
    public Applications()
    {

    }
    public Applications(Person person, Account account, Loan loan)
    {
        this.loan = loan;
        this.person = person;
        this.account = account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public Loan getLoan() {
        return loan;
    }

    public Account getAccount() {
        return account;
    }
}
