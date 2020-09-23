import com.gzk.dao.UserDao;
import com.gzk.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class MyTest {
    @Autowired
    private UserDao userDao;
    public static void main(String[] args) {
    }
    @Test
    public void test1(){
        int id = 1;
        User user = userDao.getUserById(id);
        System.out.println(user.getId()+"/"+user.getName());
    }
}
