package com.kunalmadan.android.comiclover.comicdata;

import com.kunalmadan.android.comiclover.data.Series;
import com.kunalmadan.android.comiclover.data.Stories;
import com.kunalmadan.android.comiclover.data.Thumbnail;
import com.kunalmadan.android.comiclover.data.Urls;

/**
 * Created by KUNAL on 02-09-2016.
 */
public class Results {
    private Series series;

    private String issn;

    private Events events;

    private String id;

    private String title;

    private Dates[] dates;

    private String description;

    private String isbn;

    private String[] variants;

    private String digitalId;

    private String[] collections;

    private String pageCount;

    private TextObjects[] textObjects;

    private Urls[] urls;

    private String format;

    private String upc;

    private String modified;

    private String variantDescription;

    private Creators creators;

    private String ean;

    private String issueNumber;

    private Stories stories;

    private Thumbnail thumbnail;

    private String resourceURI;

    private Images[] images;

    private String[] collectedIssues;

    private Prices[] prices;

    private Characters characters;

    private String diamondCode;

    public Series getSeries ()
    {
        return series;
    }

    public void setSeries (Series series)
    {
        this.series = series;
    }

    public String getIssn ()
    {
        return issn;
    }

    public void setIssn (String issn)
    {
        this.issn = issn;
    }

    public Events getEvents ()
    {
        return events;
    }

    public void setEvents (Events events)
    {
        this.events = events;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

      public Dates[] getDates ()
    {
        return dates;
    }

    public void setDates (Dates[] dates)
    {
        this.dates = dates;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getIsbn ()
    {
        return isbn;
    }

    public void setIsbn (String isbn)
    {
        this.isbn = isbn;
    }

    public String[] getVariants ()
    {
        return variants;
    }

    public void setVariants (String[] variants)
    {
        this.variants = variants;
    }

    public String getDigitalId ()
    {
        return digitalId;
    }

    public void setDigitalId (String digitalId)
    {
        this.digitalId = digitalId;
    }

    public String[] getCollections ()
    {
        return collections;
    }

    public void setCollections (String[] collections)
    {
        this.collections = collections;
    }

    public String getPageCount ()
    {
        return pageCount;
    }

    public void setPageCount (String pageCount)
    {
        this.pageCount = pageCount;
    }

    public TextObjects[] getTextObjects ()
    {
        return textObjects;
    }

    public void setTextObjects (TextObjects[] textObjects)
    {
        this.textObjects = textObjects;
    }

    public Urls[] getUrls ()
    {
        return urls;
    }

    public void setUrls (Urls[] urls)
    {
        this.urls = urls;
    }

    public String getFormat ()
    {
        return format;
    }

    public void setFormat (String format)
    {
        this.format = format;
    }

    public String getUpc ()
    {
        return upc;
    }

    public void setUpc (String upc)
    {
        this.upc = upc;
    }

    public String getModified ()
    {
        return modified;
    }

    public void setModified (String modified)
    {
        this.modified = modified;
    }

    public String getVariantDescription ()
    {
        return variantDescription;
    }

    public void setVariantDescription (String variantDescription)
    {
        this.variantDescription = variantDescription;
    }

    public Creators getCreators ()
    {
        return creators;
    }

    public void setCreators (Creators creators)
    {
        this.creators = creators;
    }

    public String getEan ()
    {
        return ean;
    }

    public void setEan (String ean)
    {
        this.ean = ean;
    }

    public String getIssueNumber ()
    {
        return issueNumber;
    }

    public void setIssueNumber (String issueNumber)
    {
        this.issueNumber = issueNumber;
    }

    public Stories getStories ()
    {
        return stories;
    }

    public void setStories (Stories stories)
    {
        this.stories = stories;
    }

    public Thumbnail getThumbnail ()
    {
        return thumbnail;
    }

    public void setThumbnail (Thumbnail thumbnail)
    {
        this.thumbnail = thumbnail;
    }

    public String getResourceURI ()
    {
        return resourceURI;
    }

    public void setResourceURI (String resourceURI)
    {
        this.resourceURI = resourceURI;
    }

    public Images[] getImages ()
    {
        return images;
    }

    public void setImages (Images[] images)
    {
        this.images = images;
    }

    public String[] getCollectedIssues ()
    {
        return collectedIssues;
    }

    public void setCollectedIssues (String[] collectedIssues)
    {
        this.collectedIssues = collectedIssues;
    }

    public Prices[] getPrices ()
    {
        return prices;
    }

    public void setPrices (Prices[] prices)
    {
        this.prices = prices;
    }

    public Characters getCharacters ()
    {
        return characters;
    }

    public void setCharacters (Characters characters)
    {
        this.characters = characters;
    }

    public String getDiamondCode ()
    {
        return diamondCode;
    }

    public void setDiamondCode (String diamondCode)
    {
        this.diamondCode = diamondCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [series = "+series+", issn = "+issn+", events = "+events+", id = "+id+", title = "+title+", description = "+description+", isbn = "+isbn+", variants = "+variants+", digitalId = "+digitalId+", collections = "+collections+", pageCount = "+pageCount+", urls = "+urls+", format = "+format+", upc = "+upc+", modified = "+modified+", variantDescription = "+variantDescription+", creators = "+creators+", ean = "+ean+", issueNumber = "+issueNumber+", stories = "+stories+", thumbnail = "+thumbnail+", resourceURI = "+resourceURI+", images = "+images+", collectedIssues = "+collectedIssues+", prices = "+prices+", characters = "+characters+", diamondCode = "+diamondCode+"]";
    }
}
