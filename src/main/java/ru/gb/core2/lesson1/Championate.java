package ru.gb.core2.lesson1;

public class Championate {
    public static void main(String[] args) {
        Athletes[] athletes = {

                new Human("Ivan", 2000, 100),
                new Human("Petr", 2500, 160),
                new Robot("T-1000", 5000, 500),
                new Cat("Vas'ka", 3000, 200)
        };


        Distance[] distances = {
                new Sprint(1200),
                new Obstacle(30),
                new Sprint(2000),
                new Obstacle(140),
                new Sprint(3000),
                new Obstacle(250)
        };

        for (Athletes a : athletes) {
            for (Distance t : distances) {
                if (t.toMove(a)) ;
                else break;
            }
        }

    }
}

