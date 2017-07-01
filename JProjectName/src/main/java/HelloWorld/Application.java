package HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class Application {



    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }


    public static void main(String[] args) {

        //Object a = new Integer(42);

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();

        ApplicationContext c = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Shape shape = (Shape) c.getBean("shape");
        System.out.println(shape.Square());

        Shape shape1 = (Shape) c.getBean("shape");
        System.out.println(shape1.Square());

        CommandManager cm = (CommandManager) c.getBean("commandManager");
        System.out.println(cm.process( (Object) new Integer(42) ) );
    }
}