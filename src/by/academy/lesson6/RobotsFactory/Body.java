package by.academy.lesson6.RobotsFactory;

public enum Body {
    BODY_1("Robocop 1"),
    BODY_2("Robocop 2"),
    BODY_3("Robocop 3");

    private final String body;

    Body(String body){
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
