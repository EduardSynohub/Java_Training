package eduard.OOP_and_MYSQL.OOP.constructor;

public class SoundBook extends Book{
    private long duration;
    private int numberOfCarriers;

    public SoundBook(int id, String title, long duration, int numberOfCarriers) {
        super(id, title);
        this.duration = duration;
        this.numberOfCarriers = numberOfCarriers;
    }

    public SoundBook(int id, String title, Author author, long duration, int numberOfCarriers) {
        super(id, title, author);
        this.duration = duration;
        this.numberOfCarriers = numberOfCarriers;
    }

    public SoundBook(int id, String title, Author author, Author[] additionalAuthors, long duration, int numberOfCarriers) {
        super(id, title, author, additionalAuthors);
        this.duration = duration;
        this.numberOfCarriers = numberOfCarriers;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getNumberOfCarriers() {
        return numberOfCarriers;
    }

    public void setNumberOfCarriers(int numberOfCarriers) {
        this.numberOfCarriers = numberOfCarriers;
    }

    @Override
    public String toString() {
        return "SoundBook{" +
                "duration=" + duration +
                ", numberOfCarriers=" + numberOfCarriers +
                '}';
    }
}
