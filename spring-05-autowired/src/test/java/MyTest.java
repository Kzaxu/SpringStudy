import com.xuxu.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People p = (People) context.getBean("people");
        p.getCat().bark();
        p.getDog().bark();
    }
}
