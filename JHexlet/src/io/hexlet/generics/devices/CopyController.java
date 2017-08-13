package io.hexlet.generics.devices;

public class CopyController {

    // BEGIN (write your solution here)
    public static <T extends IPrinter & IScanner> void copy(T device){
       device.print(device.scan());
    }
    // END
}



