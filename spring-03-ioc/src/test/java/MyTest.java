import com.xuxu.pojo.User;
import com.xuxu.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // spring容器启动时会将所有的bean实例化
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        User user3 = (User) context.getBean("userAlias");
        UserT user4 = (UserT) context.getBean("user2");
        System.out.println(user == user3);
        user4.show();
    }
}
