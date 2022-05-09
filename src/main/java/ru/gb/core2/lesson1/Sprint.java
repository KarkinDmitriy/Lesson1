package ru.gb.core2.lesson1;

public class Sprint  implements Distance {
    private final int length;

    public Sprint(int length) {

        this.length = length;
    }


    @Override
    public boolean toMove(Athletes athletes) {
        if (athletes.run(length)) {
            System.out.printf("%s  ran  of %d m.\n",  athletes.getName(), length);
            return true;
        } else {
            System.out.printf("%s  haven't ran  of %d m.\n", athletes.getName(), length);
            return false;
        }
    }
}
