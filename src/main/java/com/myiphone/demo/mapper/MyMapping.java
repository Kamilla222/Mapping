package com.myiphone.demo.mapper;

import com.myiphone.demo.model.Iphone10;
import com.myiphone.demo.model.Iphone11;
import org.dozer.DozerBeanMapper;

public class MyMapping {
    public static Iphone11 iphoneMapping() {
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        Iphone10 iphone10 = new Iphone10("14.2.2", "12", "colorful OLID", true, "");
        Iphone11 iphone11 = dozerBeanMapper.map(iphone10, Iphone11.class);

        if (iphone10.getColor().equals("red")) {
            iphone11.setColor("pink");
        } else if (iphone10.getColor().equals("orange")) {
            iphone11.setColor("yellow");
        } else
            iphone11.setColor("black");
        return iphone11;

        //return dozerBeanMapper.map(iphone10, Iphone11.class);
    }
}

