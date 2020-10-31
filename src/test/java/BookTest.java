import com.wcx.Dao.BookMapper;
import com.wcx.pojo.Label;
import com.wcx.pojo.vo.BookVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BookTest {
    @Autowired
    private BookMapper mapper;

    @Test
    public void TestBookInnerJoin()
    {
        BookVo vo=mapper.findBookWithLabelByID(2);
        System.out.println(vo.toString());
        List<Label> list=vo.getLabels();
        for (Label label : list) {
            System.out.println(label);

        }
    }

}
