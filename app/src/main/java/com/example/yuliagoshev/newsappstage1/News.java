package com.example.yuliagoshev.newsappstage1;

public class News {
    private String mTitle;
    private String mSection;
    private String mAuthor;
    private String mDate;

    /**
     * Constructs a new {@link News}object.
     *
     * @param title is the name of the article in news
     * @param section is the section of the article that it belongs to are required field
     * @param author is the author name of the article
     * @param date is the date when the article was published
     */

    public News (String title, String section,String author, String date){
        mTitle=title;
        mSection=section;
        mAuthor=author;
        mDate=date;
    }

    /** Returns the magnitude of the earthquake.
     */
    public String getTitle(){return mTitle;}
    /** Returns the location of the earthquake.
     */
    public String getSection(){return mSection;}
    /** Returns the date of the earthquake.
     */
    public String getAuthor(){return mAuthor;}
    /** Returns the date of the earthquake.
     */
    public String getDate(){return mDate;}
}
