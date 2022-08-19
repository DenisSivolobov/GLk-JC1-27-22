package by.academy.lesson6.RobotsFactory;

public enum Head {
    HEAD_1("Robocop 1"),
    HEAD_2("Robocop 2"),
    HEAD_3("Robocop 3");
    private final String head;

    Head(String head) {
        this.head = head;
    }

    public String getHead() {
        return head;
    }


}
