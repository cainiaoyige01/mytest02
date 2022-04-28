import com.niuzai.pojo.items;
import com.niuzai.service.ServiceDao;
import com.sun.tools.javac.jvm.Items;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author niu_zai
 * @DateTime 2022/4/28 0:17 星期四
 */
public class ServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ServiceDao serviceDao = (ServiceDao) app.getBean(ServiceDao.class);
        List<items> all = serviceDao.findAll();
        System.out.println(all);

    }
}
