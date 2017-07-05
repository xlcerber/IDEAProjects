package HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class Application {



    @Bean
    /* Some comment */
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }


    public static void main(final String[] args) {

        //Object a = new Integer(42);

        final ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        final MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();

        final ApplicationContext c = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Shape shape = (Shape) c.getBean("shape");
        System.out.println(shape.square());

        Shape shape1 = (Shape) c.getBean("shape");
        System.out.println(shape1.square());

        Shape shape2 = (Shape) c.getBean("shape2");
        System.out.println(shape2.square());

        CommandManager cm = (CommandManager) c.getBean("commandManager");
        System.out.println(cm.process((Object) new Integer(42)));
    }
}