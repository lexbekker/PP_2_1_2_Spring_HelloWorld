import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        Cat myCat = (Cat) applicationContext.getBean("cat");
        Cat yourCat = (Cat) applicationContext.getBean("cat");
        System.out.println("Is HW beans = one bean? " + (bean == helloWorld));
        System.out.println("Is cat beans = one bean? " + (myCat == yourCat));

    }
}