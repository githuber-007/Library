import com.wcx.Dao.RentMapper;
import com.wcx.pojo.vo.RentVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class RentTest {
    @Autowired
    private RentMapper mapper;

    @Test
    public void TestQuery()
    {
        List<RentVo> list=mapper.queryAllRecords();
        for (RentVo rentVo : list) {
            System.out.println(rentVo);
        }
    }
}
