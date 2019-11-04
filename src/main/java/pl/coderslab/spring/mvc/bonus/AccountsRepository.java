package pl.coderslab.spring.mvc.bonus;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AccountsRepository {

    private Map<Long, Account> privateAccount = new HashMap<>();

    private Map<Long, Account> corporateAccount = new HashMap<>();

    public Map<Long, Account> getPrivateAccount() {
        return privateAccount;
    }

    public Map<Long, Account> getCorporateAccount() {
        return corporateAccount;
    }
}
