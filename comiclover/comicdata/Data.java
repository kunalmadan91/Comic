package com.kunalmadan.android.comiclover.comicdata;

import com.kunalmadan.android.comiclover.data.Results;

/**
 * Created by KUNAL on 02-09-2016.
 */
public class Data {

    private String total;

    private String limit;

    private Results[] results;

    private String count;

    private String offset;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getLimit ()
    {
        return limit;
    }

    public void setLimit (String limit)
    {
        this.limit = limit;
    }

    public Results[] getResults ()
    {
        return results;
    }

    public void setResults (Results[] results)
    {
        this.results = results;
    }

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    public String getOffset ()
    {
        return offset;
    }

    public void setOffset (String offset)
    {
        this.offset = offset;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", limit = "+limit+", results = "+results+", count = "+count+", offset = "+offset+"]";
    }
}
