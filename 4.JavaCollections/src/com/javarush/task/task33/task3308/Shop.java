package com.javarush.task.task33.task3308;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mike on 11.05.2017.
 */
@XmlType(name="shop")
@XmlRootElement
public class Shop {
    public Goods goods;
    public List<String> names = new ArrayList<>();
    public int count;
    public double profit;
    public String [] secretData;
    @XmlType(name="goods")
 public static  class  Goods
 {
     public List<String> names = new ArrayList<>();

 }


}
