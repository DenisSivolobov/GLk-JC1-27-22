package by.academy.lesson6.RobotsFactory;

public class Robot {

    private String name;

    Body body;
    Head head;

    public Robot(String name, Body body, Head head) {
        this.name = name;
        this.body = body;
        this.head = head;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", body=" + body +
                ", head=" + head +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}
