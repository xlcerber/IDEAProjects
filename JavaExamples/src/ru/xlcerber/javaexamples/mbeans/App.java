package ru.xlcerber.javaexamples.mbeans;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class App {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {

        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("ru.xlcerber.javaexamples.mbeans:type=My");
        My mbean = new My();
        mbs.registerMBean(mbean, name);

        System.out.println("Waiting forefer...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
