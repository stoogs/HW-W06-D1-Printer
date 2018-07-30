
    public class Runner {
        public static void main(String[] args) {
            Printer epson = new Printer(100,100);
            epson.status();
            epson.print();
            epson.empty();
            epson.print();
            epson.refill();
            epson.print();

        }





    } //class


