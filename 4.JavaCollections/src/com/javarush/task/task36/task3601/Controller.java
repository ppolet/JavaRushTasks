package com.javarush.task.task36.task3601;

import java.util.List;

/**
 * Created by Mike on 18.07.2017.
 */
public class Controller {

    private Model model = new Model();

    public List<String> onDataListShow() {
        return model.getStringDataList();
    }
}
