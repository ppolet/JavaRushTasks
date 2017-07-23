package com.javarush.task.task36.task3608.model;

/**
 * Created by Mike on 26.05.2017.
 */
public interface Model {
    void loadDeletedUsers();
    ModelData getModelData();
    void loadUsers();
    void loadUserById(long userId);
    void deleteUserById(long id);

    void changeUserData(String name, long id, int level);
}
