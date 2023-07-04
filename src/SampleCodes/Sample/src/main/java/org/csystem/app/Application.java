package org.csystem.app;

import com.karandev.util.console.Console;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static com.karandev.util.console.commandline.CommandLineUtil.*;

class Application {
    public static void run(String[] args)
    {
        var now = LocalDateTime.now();

        Console.writeLine(DateTimeFormatter.ofPattern("dd / MM / yyyy kk:mm:ss E").format(now));
        Console.writeLine(DateTimeFormatter.ofPattern("d / MMM / yyyy KK:mm:ss e B").format(now));

    }
}