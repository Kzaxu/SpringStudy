import com.xuxu.pojo.Student;
import com.xuxu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        System.out.println(student.getInfo().get("学号").getClass().getName());
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user2");
        User user3 = (User) context.getBean("user2");
        System.out.println(user);
        System.out.println(user2==user3);
    }
}
