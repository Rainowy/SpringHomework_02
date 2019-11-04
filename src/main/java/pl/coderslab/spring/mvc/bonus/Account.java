package pl.coderslab.spring.mvc.bonus;

public class Account {
    private static long globalTestId = 1;
    private long testId;
    private long id;
    private String name;
    private String accountType;

    public Account() {
        this.testId = globalTestId;
        globalTestId++;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

//    public Account() {
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Account{" +
                "testId=" + testId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
