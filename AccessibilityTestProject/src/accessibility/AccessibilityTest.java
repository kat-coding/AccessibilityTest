//Katherine Watkins
//SDEV 301
//10/04/2022

package accessibility;



class AccessibilityTest {
    private String category;
    private String google;
    private String wave;
    private String sortSite;
    private String ASLint;
    public String description;

//    constructor


    public AccessibilityTest(String category, String google, String wave, String sortSite, String ASLint, String description){
        {
            this.category = category;
            this.google = google;
            this.wave = wave;
            this.sortSite = sortSite;
            this. ASLint = ASLint;
            this.description = description;

        }
    }

//    Getters and Setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    public String getWave() {
        return wave;
    }

    public void setWave(String wave) {
        this.wave = wave;
    }

    public String getSortSite() {
        return this.sortSite;
    }

    public void setSortSite(String sortSite) {
        this.sortSite = sortSite;
    }

    public String getASLint() {
        return ASLint;
    }

    public void setASLint(String ASLint) {
        this.ASLint = ASLint;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    toString Override

    @Override
    public String toString() {
        return  category + ": " + description +
                " Google: " + google +
                " Wave: " + wave +
                " SortSite: " + sortSite +
                " ASLint: " + ASLint;
    }
}
