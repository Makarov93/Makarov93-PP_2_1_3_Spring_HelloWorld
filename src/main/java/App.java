
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanFirst =
                (HelloWorld) context.getBean("helloworld");
        HelloWorld beanSecond = (HelloWorld) context.getBean("helloworld");

        Cat catFirst = context.getBean("cat", Cat.class);
        Cat catSecond = context.getBean("cat", Cat.class);

        System.out.println("HelloWorld1 == HelloWorld2 " + (beanFirst == beanSecond));
        System.out.println("Cat1 == Cat2 " + (catFirst == catSecond));

        System.out.println(beanFirst.getMessage());
        context.close();
    }
}