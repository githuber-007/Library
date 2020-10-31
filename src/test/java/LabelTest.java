import com.wcx.Dao.LabelMapper;
import com.wcx.pojo.Book;
import com.wcx.pojo.vo.LabelVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.text.LabelView;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class LabelTest {
    @Autowired
    private LabelMapper mapper;

    @Test
    public void TestInnerJoin()
    {
        LabelVo vo=mapper.findLabelWithBookByID(1);
        for(Book book:vo.getBooks())
        {
            System.out.println(book);
        }
    }

}
