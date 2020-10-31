import com.wcx.Service.UserService;
import com.wcx.pojo.User;
import com.wcx.pojo.vo.RentedBook;
import com.wcx.pojo.vo.UserVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {
    @Autowired
    private UserService service;

    @Test
    public void testFindAll()
    {
      List<User> list= service.findAllUser();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindByID()
    {
        User user =service.findUserByID(1);
        System.out.println(user);
    }

    @Test
    public void TestRentBooks()
    {
        UserVo vo=service.findRentedBookByUserID(2);
        for(RentedBook book:vo.getRentBooks())
        {
            System.out.println(book);
        }
    }
}
