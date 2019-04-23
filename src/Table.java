import java.util.Scanner;

public class Table {

    int sizeOfTable;

    public Table(int sizeOfTable) {
        this.sizeOfTable = sizeOfTable;
    }

    public int getSizeOfTable() {
        return sizeOfTable;
    }

    private Booking[] bookings = new Booking[5];

    private static int bookingNum;

    public boolean addBooking(Booking newBooking){
        if (newBooking.getPeopleNum() > sizeOfTable){
            return false;
        }
        for(int i = 0; i < bookingNum; i ++) {
            Booking existingBooking = bookings[i];
            int existingFrom = newBooking.getFrom();
            int existingTo = newBooking.getTo();


            if (newBooking.getFrom() >= existingFrom && newBooking.getFrom() < existingTo) {
                return false;
            }
            if (newBooking.getTo() > existingFrom && newBooking.getTo() <= existingTo) {
                return false;
            }

            if (newBooking.getFrom() < existingFrom && newBooking.getTo() > existingTo) {
                return false;
            }
        }
        bookings[bookingNum++] = newBooking;
        return true;
    }



    /*public void printAllBookings(){

        for(int i =0; i < bookingNum; i ++) {
            Booking b = bookings[i];
            System.out.println(b.getFrom() + " : " + b.getTo());
        }
        System.out.println();
    }*/

}
