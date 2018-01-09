package com.javarush.task.task34.task3410.model;

import java.awt.*;


public abstract class CollisionObject extends GameObject {

    public CollisionObject(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {

    }


    public boolean isCollision(GameObject gameObject, Direction direction) {

        boolean result = false;

        switch (direction) {

            case LEFT:
                if (getX() - GameObject.FIELD_CELL_SIZE == gameObject.getX() && getY() == gameObject.getY())
                    result = true;
                break;
            case RIGHT:
                if (getX() + GameObject.FIELD_CELL_SIZE  == gameObject.getX() && getY() == gameObject.getY())
                    result = true;
                break;
            case UP:
                if (getX() == gameObject.getX() && getY() - GameObject.FIELD_CELL_SIZE  == gameObject.getY())
                    result = true;
                break;
            case DOWN:
                if (getX() == gameObject.getX() && getY() + GameObject.FIELD_CELL_SIZE  == gameObject.getY())
                    result = true;
                break;
        }
        return result;
    }
}
