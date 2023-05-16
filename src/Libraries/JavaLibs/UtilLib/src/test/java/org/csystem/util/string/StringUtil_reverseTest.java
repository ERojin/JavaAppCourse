package org.csystem.util.string;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringUtil_reverseTest {
    private final StringStringResultInfo m_StringStringResultInfo;

    @Parameterized.Parameters
    public static Collection<StringStringResultInfo>provideData()
    {
        return Arrays.asList(new StringStringResultInfo("ankara", "arakna"),
                new StringStringResultInfo("alipapila", "alipapila"),
                new StringStringResultInfo("1234" , "4321"),
                new StringStringResultInfo(" ", " "));
    }

    public StringUtil_reverseTest(StringStringResultInfo stringStringResultInfo)
    {
        m_StringStringResultInfo = stringStringResultInfo;
    }

    @Test
    public void givenString_thenReturnStringChangeCases()
    {
               assertEquals(m_StringStringResultInfo.expected, StringUtil.reverse(m_StringStringResultInfo.text));
    }


}
