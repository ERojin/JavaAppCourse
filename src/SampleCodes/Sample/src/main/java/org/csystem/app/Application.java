package org.csystem.app;

import com.karandev.util.console.Console;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static com.karandev.util.console.commandline.CommandLineUtil.*;

class Application {
    public static void run(String[] args)
    {
        checkLengthEquals(args.length,3, "Wrong number of arguments");
       try {
            int day = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            int year = Integer.parseInt(args [2]);

            day = Console.readInt("Doğduğunuz gününü giriniz:" );
            month = Console.readInt("Doğduğunuz ayı giriniz:" );
            year = Console.readInt("Doğduğunuz yılı giriniz:" );

           var BirthDay = new GregorianCalendar(day, month, year);

           var now = new GregorianCalendar();

           if (now.after(BirthDay))
               Console.writeLine("Geçmiş doğum gününüz kutlu olsun");
           else if (BirthDay.after(now))
               Console.writeLine("Doğum günününüz şimdiden kutlu olsun");
           else
               Console.writeLine("Doğum gününüz kutlu olsun");
        }
        catch (NumberFormatException ignore) {
            Console.Error.writeLine("Invalid arguments");*/
        }




    }
}
