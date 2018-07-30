
    public class Runner {
        public static void main(String[] args) {
            Printer epson = new Printer(100,100);
            // Printer's toner and pages available
            epson.status();
            // Print copies of number of pages
            epson.print(3,5);
            // empty paper tray
            epson.empty();
            epson.print(1,2);
            // refill paper tray with 55 sheets
            epson.refill(55);
            // cause print failure for not enough toner/paper
            epson.print(10,12);
        }





    } //class


