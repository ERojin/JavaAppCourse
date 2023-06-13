package org.csystem.util.recursion;

import com.karandev.util.console.Console;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RecursionUtilWriteNumberTest {
    private final InputInfo m_inputInfo;

    private static class InputInfo {
        int val;
        int radix;

        public InputInfo(int val, int radix)
        {
            this.val = val;
            this.radix = radix;
        }
    }
    public RecursionUtilWriteNumberTest(InputInfo resultInfo)
    {
        m_inputInfo = resultInfo;
    }

    @Parameterized.Parameters
    public static Collection<InputInfo> createResultInfo()
    {
        return Arrays.asList(new InputInfo(0,10),
                new InputInfo(10,10),
                new InputInfo(8128,16),
                new InputInfo(10,8),
                new InputInfo(16,2),
                new InputInfo(-8,2),
                new InputInfo(Integer.MAX_VALUE,2));
    }

    @Test
    public void givenValue_whenValueAndRadix_thenWriteNumber()
    {
        RecursionUtil.writeNumber(m_inputInfo.val , m_inputInfo.radix);
        Console.writeLine();
    }
}
