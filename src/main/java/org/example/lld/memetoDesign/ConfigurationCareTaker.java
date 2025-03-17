package org.example.lld.memetoDesign;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMemeto> history=new ArrayList<>();

    public void addMemento(ConfigurationMemeto configurationMemeto){
        history.add(configurationMemeto);
    }

    public ConfigurationMemeto undo(){
            if(!history.isEmpty()) {
                int lastMementoIndex = history.size() - 1;
                ConfigurationMemeto lastMemento = history.get(lastMementoIndex);
                history.remove(lastMementoIndex);
                return lastMemento;
            }
            return null;
        }
    }

