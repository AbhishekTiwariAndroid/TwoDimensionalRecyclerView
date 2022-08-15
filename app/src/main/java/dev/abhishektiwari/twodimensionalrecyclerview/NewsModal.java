package dev.abhishektiwari.twodimensionalrecyclerview;

public class NewsModal {

    // string for news title,image and description.
    private String newsTitle;
    private String newsDesc;
    private String newsImg;

    public NewsModal(String newsTitle, String newsDesc, String newsImg) {
        this.newsTitle = newsTitle;
        this.newsDesc = newsDesc;
        this.newsImg = newsImg;
    }


    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsDesc() {
        return newsDesc;
    }

    public void setNewsDesc(String newsDesc) {
        this.newsDesc = newsDesc;
    }

    public String getNewsImg() {
        return newsImg;
    }

    public void setNewsImg(String newsImg) {
        this.newsImg = newsImg;
    }
}
