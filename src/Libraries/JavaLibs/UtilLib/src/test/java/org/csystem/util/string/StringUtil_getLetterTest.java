package org.csystem.util.string;

import static org.junit.Assert.*;

import com.karandev.util.console.Console;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringUtil_getLetterTest {
    private final StringStringWithIndexResultInfo m_resultInfo;
    @Before
    public void setUp()
    {
        Console.writeLine("Test will start -> Text Index:%d, Text:%s, Expected:%s" ,m_resultInfo.testIndex, m_resultInfo.text, m_resultInfo.expected );
    }
    @After
    public void tearDown()
    {
        Console.writeLine("Test ended -> Text Index:%d, Text:%s, Expected:%s" , m_resultInfo.testIndex, m_resultInfo.text, m_resultInfo.expected );
    }
    @Parameterized.Parameters
    public static Collection<StringStringWithIndexResultInfo>provideData()
    {
        return Arrays.asList(new StringStringWithIndexResultInfo(0, "ankara1234istanbul?.)", "ankaraistanbul"),
                new StringStringWithIndexResultInfo(1, "ankara", "ankara"),
                new StringStringWithIndexResultInfo(2, "1234.)?" , ""));
    }

    public StringUtil_getLetterTest(StringStringWithIndexResultInfo resultInfo)
    {
        m_resultInfo = resultInfo;
    }

    @Test
    public void givenString_whenMixedCharacter_thenReturnStringJustLetters()
    {
               assertEquals(m_resultInfo.expected, StringUtil.getLetters(m_resultInfo.text));
    }


}
