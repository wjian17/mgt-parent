package com.zxyh.mgt;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple KafkaApplication.
 */
public class KafkaApplicationTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
        String period = "4";
        String dateStr = "20190920";
            cal.setTime(new Date());

        System.out.println(format1.format(cal.getTime()));
        if("1".equals(period)){
            cal.add(Calendar.DATE, 7);
        }else if("2".equals(period)){
            cal.add(Calendar.DATE, 14);
        }else if("4".equals(period)){
            cal.add(Calendar.DATE, 30);
        }
        System.out.println(format1.format(cal.getTime()));
    }
}
