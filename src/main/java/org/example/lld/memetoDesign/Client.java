package org.example.lld.memetoDesign;

public class Client {

    public static void main(String[] args) {
        ConfigurationCareTaker careTakerObject = new ConfigurationCareTaker();

        ConfigurationOriginator originatorObject=new ConfigurationOriginator(5,10);
        ConfigurationMemeto snapshot1=originatorObject.createMemento();
        careTakerObject.addMemento(snapshot1);

        originatorObject.setHeight(8);
        originatorObject.setWidth(16);
        ConfigurationMemeto snapshot2=originatorObject.createMemento();
        careTakerObject.addMemento(snapshot2);

        originatorObject.setHeight(12);
        originatorObject.setWidth(24);
        System.out.println("height: "+originatorObject.height+ " Width: "+originatorObject.width);

        ConfigurationMemeto restoreStateMemento = careTakerObject.undo();
        originatorObject.restoreMemeto(restoreStateMemento);
        System.out.println("Undo...height: "+originatorObject.height+ " Width: "+originatorObject.width);




    }
}
