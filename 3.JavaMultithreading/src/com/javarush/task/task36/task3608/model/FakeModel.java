package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mike on 26.05.2017.
 */
public class FakeModel implements Model {


    private ModelData modelData = new ModelData();

    public void setModelData(ModelData modelData) {
        this.modelData = modelData;
    }


    @Override
    public void loadUsers() {

        List<User> usr = new ArrayList<>();
        usr.add(new User("Ivan", 1, 1));
        usr.add(new User("Petr", 2, 3));


        modelData.setUsers(usr);

    }


    @Override
    public ModelData getModelData() {
        return modelData;
    }
}
