package lesson.task1;

public interface Breathing {

    void breathe();

    void holdBreath();

    default void sneeze() {
        System.out.println("sneeze " + getClass().getName());
    }
}
