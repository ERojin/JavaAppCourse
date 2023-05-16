package org.csystem.app.libraryusage;

import com.karandev.util.console.Console;
import java.math.MathContext;
import java.math.RoundingMode;

public class App {
    public static void main(String[] args)
    {
        var a = Console.readBigDecimal("Birinci sayıyı giriniz:");
        var b = Console.readBigDecimal("İkinci sayıyı giriniz:");
        var c = a.divide(b, 10, RoundingMode.HALF_UP);

        Console.writeLine("c = %s ", c);

    }
}
