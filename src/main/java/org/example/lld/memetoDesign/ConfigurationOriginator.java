package org.example.lld.memetoDesign;

public class ConfigurationOriginator {

    int height;
    int width;

    ConfigurationOriginator(int height, int width){
        this.height=height;
        this.width=width;
    }

    public void setHeight(int height){
        this.height=height;
    }

    public void setWidth(int width){
        this.width=width;
    }

    public ConfigurationMemeto createMemento(){
        return new ConfigurationMemeto(this.height, this.width);
    }

    public void restoreMemeto(ConfigurationMemeto memetoToBeRetored){
        this.height=memetoToBeRetored.height;
        this.width=memetoToBeRetored.width;
    }

}
