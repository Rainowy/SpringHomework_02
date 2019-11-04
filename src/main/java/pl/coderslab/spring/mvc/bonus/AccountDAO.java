package pl.coderslab.spring.mvc.bonus;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AccountDAO {


    private AccountsRepository accountsRepository;

    public AccountDAO(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    public void addToDb(Account account) {
        if (account.getAccountType().equals("Private")) {
            accountsRepository.getPrivateAccount().put(account.getId(), account);
        } else {
            accountsRepository.getCorporateAccount().put(account.getId(), account);
        }
    }

    public Map<Long, Account> showPrivate() {

        return accountsRepository.getPrivateAccount();
    }

    public Map<Long, Account> showCorporate() {

        return accountsRepository.getCorporateAccount();
    }
}
