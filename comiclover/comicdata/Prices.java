package com.kunalmadan.android.comiclover.comicdata;

/**
 * Created by KUNAL on 02-09-2016.
 */
public class Prices {
    private String price;

    private String type;

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [price = "+price+", type = "+type+"]";
    }
}
