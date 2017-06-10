package com.javarush.task.task25.task2515;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mike on 11.05.2017.
 */
public class Space {
    public static Space game;
    private   int width;
    private int height;
    private SpaceShip ship;
    private ArrayList<Ufo> ufos = new ArrayList<>();
    private ArrayList<Rocket> rockets = new ArrayList<>();
    private ArrayList<Bomb> bombs= new ArrayList<>();

    public void run(){};
    public void  draw(){};
    public void  sleep(int ms){};

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public SpaceShip getShip() {
        return ship;
    }

    public void setShip(SpaceShip ship) {
        this.ship = ship;
    }

    public ArrayList<Ufo> getUfos() {
        return ufos;
    }

    public void setUfos(ArrayList<Ufo> ufos) {
        this.ufos = ufos;
    }

    public ArrayList<Rocket> getRockets() {
        return rockets;
    }

    public void setRockets(ArrayList<Rocket> rockets) {
        this.rockets = rockets;
    }

    public ArrayList<Bomb> getBombs() {
        return bombs;
    }

    public void setBombs(ArrayList<Bomb> bombs) {
        this.bombs = bombs;
    }

    public Space(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void checkBombs()
    {
        for (Bomb bomb : bombs)
        {

                ship.die();
                bomb.die();


            if (bomb.getY() >= height)
                bomb.die();
        }
    }

    public void createUfo()
    {
        if (ufos.size() > 0) return;

        int random10 = (int) (Math.random() * 10);
        if (random10 == 0)
        {
            double x = Math.random() * 20;
            double y = Math.random() * 10;
            ufos.add(new Ufo(x, y));
        }
    }


    public void removeDead()
    {
        for (BaseObject object : new ArrayList<BaseObject>(bombs))
        {
            if (!object.isAlive())
                bombs.remove(object);
        }

        for (BaseObject object : new ArrayList<BaseObject>(rockets))
        {
            if (!object.isAlive())
                rockets.remove(object);
        }

        for (BaseObject object : new ArrayList<BaseObject>(ufos))
        {
            if (!object.isAlive())
                ufos.remove(object);
        }
    }



    public void moveAllItems()
    {
        for (BaseObject object : getAllItems())
        {
            object.move();
        }
    }

    public List<BaseObject> getAllItems()
    {
        ArrayList<BaseObject> list = new ArrayList<BaseObject>(ufos);
        list.add(ship);
        list.addAll(bombs);
        list.addAll(rockets);
        return list;
    }

    public static void main(String args[])
    {

    }
}
