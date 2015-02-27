package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MockitoTest {
    @Test
    public void testMockito() throws Exception {
        List<String> list=mock(List.class);
        //设置方法的预期返回值
        when(list.get(0)).thenReturn("helloworld");

        String result = list.get(0);

        //验证方法调用(是否调用了get(0))
        verify(list).get(0);

        //junit测试
        Assert.assertEquals("helloworld", result);


        //arrange
        Iterator i=mock(Iterator.class);
        when(i.next()).thenReturn("Hello").thenReturn("World");
        //act
        String result1=i.next()+" "+i.next();
        //verify
        verify(i, times(2)).next();
        //assert
        assertEquals("Hello World", result1);

        BufferedReader bufferedReader=mock(BufferedReader.class);
        when(bufferedReader.readLine()).thenReturn("hello");
    }
}