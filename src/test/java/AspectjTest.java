import org.ihsusta.aspectj.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-aspectj.xml")
public class AspectjTest {
    //    test service
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void run() {
        accountService.transfer("aaa", "bbb", 200d);
    }
}
