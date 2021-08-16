package MethodReference.InstanceOfObject;

import java.util.Locale;

public class PrinterDemo {
    public static void main(String[] args) {
        usePrinter(s -> System.out.println(s.toUpperCase(Locale.ROOT)));  // lambda expression
        PrintString printString = new PrintString();
        usePrinter(printString::printUpper);
        // all parameter would be sent to instance's static method as virtual parameter
    }

    private static void usePrinter(Printer printer) {
        printer.printUpperCase("HelloWorld");

    }
}
