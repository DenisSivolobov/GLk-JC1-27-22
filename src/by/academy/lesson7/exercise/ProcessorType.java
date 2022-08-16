package by.academy.lesson7.exercise;

public enum ProcessorType {
    BIT_32("bit-32"){
        @Override
        public String description() {
            return "bit-32 description";
        }
    },
    BIT_64("bit-64"){
        @Override
        public String description() {
            return "bit-64 description";
        }
    };

    private final String title;

    public String getTitle() {
        return title;
    }

    ProcessorType(String title) {
        this.title = title;
    }
    public abstract String description();

}
