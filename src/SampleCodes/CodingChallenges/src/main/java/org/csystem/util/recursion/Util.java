package org.csystem.util.recursion;

public class Util {
    public static long factorial (int n)
    {
        if (n <= 0)
            return 1;

        var result = 1L;

        for(; n > 1; --n)
            result *= n;

        return result ;
    }
}
