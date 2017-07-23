package com.javarush.task.task36.task3601;

/**
 * Created by Mike on 18.07.2017.
 */
public class View {

   private Controller controller= new Controller();



    public void fireEventShowData() {

        System.out.println(controller.onDataListShow());
    }

}
