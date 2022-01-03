import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mogong.service.Director;

//Dependency Injection
//Inverse of Control
public class DirectorServiceTest {

    /**
     * 导演一个剧本，依赖关系都配置在bean.xml中了，导演不用自己new了
     * @throws Exception
     */
    @Test
    public void testMovie() throws Exception {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("beans.xml");

        Director director = (Director) ctx.getBean("director");

        director.direct();

        ctx.destroy();
    }

}
