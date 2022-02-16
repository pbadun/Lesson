package lesson.task2;

public abstract class AllPress implements Press {

    private String pressName;

    public AllPress(String pressName) {
        this.pressName = pressName;
    }

    @Override
    public String getPressName() {
        return pressName;
    }

}
