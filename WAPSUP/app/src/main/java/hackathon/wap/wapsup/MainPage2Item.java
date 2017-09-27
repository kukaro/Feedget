package hackathon.wap.wapsup;

import java.net.URL;

public class MainPage2Item {


    public String appName, appCompany, comment, producerEmail, mainText;
    public URL url;
    int xpos, ypos;

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public void setAppName(String appName) {

        this.appName = appName;
    }

    public void setAppCompany(String appCompany) {
        this.appCompany = appCompany;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setProducerEmail(String producerEmail) {
        this.producerEmail = producerEmail;
    }

    public void setPosition(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getAppName() {
        return appName;
    }

    public String getAppCompany() {
        return appCompany;
    }

    public String getComment() {
        return comment;
    }

    public String getProducerEmail() {
        return producerEmail;
    }

    public String getMainText() {
        return mainText;
    }


}