package com.javarush.task.task24.task2406;

import java.math.BigDecimal;

/* 
Наследование от внутреннего класса
*/
public class Solution {

    public class   Apt3Bedroom extends Building.Apartments {

        public Apt3Bedroom(Building square) {
           square.super();
        }
    }

    public class  BigHall extends Building.Hall {
        BigHall(Building building)
        {
            building.super();

        }

    }

    public class Building {
        public class Hall {
            private BigDecimal square;

            public Hall() {
                this.square = square;
            }
        }

        public class Apartments {
        }
    }

    public static void main(String[] args) {

    }
}
