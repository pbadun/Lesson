package lesson.task5;

public class SingleTone {

    private static SingleTone singleTone;

    public synchronized SingleTone getInstance() {
        if (singleTone != null) {
            singleTone = new SingleTone();
        }
        return singleTone;
    }


    static class sss {
        void lol() {

        }
    }

}
