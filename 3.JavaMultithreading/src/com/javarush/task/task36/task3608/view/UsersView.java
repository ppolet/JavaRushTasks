package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

/**
 * Created by Mike on 19.06.2017.
 */
public class UsersView implements View {

    private Controller controller;


   public void fireEventShowDeletedUsers()
   {
       controller.onShowAllDeletedUsers();
   }


    public void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }

    @Override
    public void refresh(ModelData modelData) {

        if (!modelData.isDisplayDeletedUserList()) {
            System.out.println("All users:");
        }
        if (modelData.isDisplayDeletedUserList()) {
            System.out.println("All deleted users:");
        }


        //Выведи в консоль всех юзеров, которые есть в modelData
        //Перед каждым юзером сделай отступ в виде табуляции
        for (int i = 0; i < modelData.getUsers().size(); i++) {
            System.out.println("\t" + modelData.getUsers().get(i));
        }
        //В конце выведи визуальный разделитель данных
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventOpenUserEditForm(long id) {
        controller.onOpenUserEditForm(id);
    }



}
