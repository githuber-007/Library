import com.wcx.Dao.LogMapper;
import com.wcx.pojo.Log;
import com.wcx.pojo.Manager;
import com.wcx.pojo.vo.LogVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class LogTest {

    @Autowired
    LogMapper mapper;
    @Test
    public void TestInsertAndQuery()
    {
        Log log=new Log();
        Date date=new Date();
        String s=date.toString();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        log.setOperateDate(format.format(date));
        log.setDescription("null");
        log.setOperation(1);
        log.setOperator(3);
        mapper.insertLog(log);

        List<Log> list=mapper.findAllLog();
        for (Log log1 : list) {
            System.out.println(log1);
        }
    }

    @Test
    public void testLinkQuery()
    {
       List<Log> list=mapper.findLogListByID(2);
        System.out.println(list);
    }

}
