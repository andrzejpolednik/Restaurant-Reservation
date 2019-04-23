import java.util.Scanner;

public class Restaurant {


    private Table[] tables = new Table[3];

    private static int tablesNum;

    public void addTable(Table newTable) {
        tables[tablesNum++]= newTable;


    }


    public boolean addBooking(Booking newBooking){

        for(int i = 0; i < tables.length; i ++ ){
            Table table = tables[i];
            boolean result = table.addBooking(newBooking);
            if (result) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.addTable(new Table(5));
        restaurant.addTable(new Table(2));
        restaurant.addTable(new Table(8));


        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter time from");
            int from = scanner.nextInt();

            System.out.println("Enter time to");
            int to = scanner.nextInt();

            System.out.println("For how many people ?");
            int peopleNum = scanner.nextInt();

            Booking booking = new Booking(from, to, peopleNum);
            boolean result = restaurant.addBooking(booking);
            if (result) {
                System.out.println("Succesfully added for " + from + " : " + to);
                //table.printAllBookings();
            } else {
                System.out.println("Time is busy");
            }

        }
    }


}
