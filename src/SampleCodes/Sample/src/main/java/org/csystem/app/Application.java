package org.csystem.app;
import com.karandev.util.console.Console;

class Application {
    public static void run(String [] args)
    {
        Sample.foo(3);
    }
}
class Sample {
    public static void foo(int n)
    {
        Console.writeLine("Giriş:%d", n);

        if (n==0)
            return;

        foo(n-1);
        Console.writeLine("Çıkış:%d", n);
    }
}
