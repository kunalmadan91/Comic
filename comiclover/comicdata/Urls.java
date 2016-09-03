package com.kunalmadan.android.comiclover.comicdata;

/**
 * Created by KUNAL on 02-09-2016.
 */
public class Urls {

    private String type;

    private String url;

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [type = "+type+", url = "+url+"]";
    }
}
