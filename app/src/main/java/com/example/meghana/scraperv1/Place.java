package com.example.meghana.scraperv1;

/**
 * Created by meghana on 30/10/17.
 */

public class Place {
    private  String title;
    private  String description;
    private  String img_src;
    private  String link;

    Place(String title, String description, String img_src, String link )
    {
        this.description = description;
        this.title = title;
        this.img_src = img_src;
        this.link = link;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return  description;
    }

    public String getImg_src()
    {
        return img_src;
    }
    public String getLink()
    {
        return link;
    }
}
