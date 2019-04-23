public class Booking {

    private int from;
    private int to;
    private int peopleNum;

    public Booking(int from, int to, int peopleNum) {
        this.from = from;
        this.to = to;
        this.peopleNum = peopleNum;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public int getPeopleNum() {
        return peopleNum;
    }
}
