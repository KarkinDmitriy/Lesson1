package ru.gb.core2.lesson1;

public class Obstacle implements Distance {
    private final int height;


    public Obstacle(int height) {

        this.height = height;
    }


    @Override
    public boolean toMove(Athletes athletes) {
        if (athletes.jump(height)) {
            System.out.printf("%s jumped over obstacle of %d sm.\n",  athletes.getName(), height);
            return true;
        } else {
            System.out.printf("%s haven't jumped over obstacle of %d sm.\n", athletes.getName(), height);
            return false;
        }
    }

}
