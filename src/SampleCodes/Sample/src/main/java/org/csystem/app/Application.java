/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte switch expression'ın default kısmında assert yapılmıştır. Çünkü algoritma gereği akışın default case'e
    gelmemesi gerekir. Bu durumda programcı algoritmasını doğru yazıp yazmadığını test etmek isteyebilir. ** ile belirtilen
    assert deyimlerinde metodun başında yapılan sınır değer kontrolünün doğru yapılıp yapılmadığını test etmek için kullanılmıştır.
    * ile belirtilen assert deyimi ile tüm basamaklara ilişkin case bölümlerinin yazılmadığı test edilmektedir.
    Buradaki assert deyimleri && yapılarak tek bir assert olarak da yazılabilir.Ancak bu durumda hangi nedenden dolayı
    problem olduğunun anlaşılması güçleşebilir. Bu tip durumlarda ayrı assert deyimleri yazılması tavsiye edilir.
    Şüphesiz örnek metot başka biçimlerde de yazılabilir. Hatta bu şekilde yapıldığında "JUnit" ile de test edilebilir.
    Ancak metot private ve bu şekilde yazılsaydı assert deyimi uygun olurdu.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import com.karandev.util.console.Console;
import static com.karandev.util.console.commandline.CommandLineUtil.*;
import java.util.Scanner;

class Application {
    public static void run(String [] args)
    {
        checkLengthGreaterOrEquals(args.length, 3 ,"Wrong number of arguments", 1 );

        var sb = new StringBuilder();

        for (int i = 1; i < args.length ; ++i)
            sb.append(args[i]).append(args[0]);

          var str = sb.substring(0, sb.length() - args[0].length());

          Console.writeLine(str);


    }
    }

