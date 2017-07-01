package HelloWorld;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.io.IOException;
import java.lang.System;
import java.util.ArrayList;


/**
 * Hello world!
 *
 */
public class App 
{
    static class sampleClass
    {
        public sampleClass(String inParam) {
            localParam = inParam;
        }
        String localParam = "0";
    }

    static class  Parent {
        void test() {
            System.out.println("parent:test()");
        }

        void testParent() {System.out.println("parent:testParent");}
    }

    static class Child extends Parent {
        @Override
        void test() {System.out.println("child:test");}

        void testChild() {System.out.println("child:testChild");}
    }


    static class Canvas implements ClickListener {
        @Override
        public void onClick(){System.out.println("CANVAS:Button was pressed");}
    }

    public static void main( String... args ) {
        String someText;
        String someArgs = "Empty";
        StringBuilder builder = new StringBuilder();

        Parent item = new Child();

        System.out.println("Parent - > Child");
        item.test();
        item.testParent();

        System.out.println("Child - > Child");
        Child other = new Child();
        other.test();
        other.testChild();
        other.testParent();


        Canvas canvas = new Canvas();
        Button redButton = new Button();

        redButton.addListener(canvas);
        redButton.click();



        try ( BufferedReader br =  new BufferedReader (new InputStreamReader(System.in));)
        {
            while (true) {
                String line = br.readLine();
                if (line.isEmpty()) break;
                builder.append(line);
            }
            someText = builder.toString();
            System.out.println(someText);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        sampleClass SC = new sampleClass("Yahoo!!");

        if (args.length !=0) {
            someArgs = args[0];
        }
        System.out.println("Hello World!" + "\n" + SC.localParam );

        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("GreateBrittan");
        states.add("Spain");

        states.add(1, "Italy");

        System.out.println(states.get(1));
        states.set(1, "Demmark");

        System.out.printf("In the list the %d elements \n", states.size());
        for(String state : states){

            System.out.println(state);
        }

        if(states.contains("Germany")){

            System.out.println("Array has a state Germany");
        }

        states.remove("Germany");
        states.remove(0);

        Object[] countries = states.toArray();
        for(Object country : countries){

            System.out.println(country);
        }


    }
}
