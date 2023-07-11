package org.csystem.app;

import com.karandev.util.console.Console;
import org.csystem.util.datetime.converter.DateTimeConverterUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static com.karandev.util.console.commandline.CommandLineUtil.*;

class Application {
    public static void run(String[] args)
    {
        var a = 0x80000B00; //0b1000_0000_0000_0000_0000_1011_0000_0000
        var b = 0x00000B00; //0b0000_0000_0000_0000_0000_1011_0000_0000

        Console.writeLine("a = %d " , a);
        Console.writeLine("b = %d ", b );



    }
}