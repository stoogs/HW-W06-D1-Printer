public class Printer {
    private int paperLeft;
    private int tonerVolume;
    private int copiesToMake;
    private int pagesToPrint;
    private int jobTotal;

    public Printer(int paperLeft, int tonerVolume){
       this.paperLeft = paperLeft;
       this.tonerVolume = tonerVolume;
    }
    public int getpaperLeft(){
        return this.paperLeft;
    }
    public int getTonerVolume(){
        return this.tonerVolume;
    }
    public void setPaperLeft(int paperLeft){
        this.paperLeft = paperLeft;
    }
    public void setTonerVolume(int tonerVolume){
        this.tonerVolume = tonerVolume;
    }
    public void status(){
        System.out.println("Paper Left " + this.paperLeft);
        System.out.println("Toner Left " + this.tonerVolume);
    }
    public void print(int copiesToMake, int pagesToPrint) {
        System.out.println("---- Printing... ----");
        this.jobTotal = copiesToMake * pagesToPrint;
        if (this.paperLeft > this.jobTotal && this.tonerVolume > this.jobTotal) {
            this.paperLeft -= this.jobTotal;
            this.tonerVolume -= this.jobTotal;
            this.status();
        } else {
            System.out.println("Sorry, not enough paper/toner");
            this.status();
        }
    }
    public void refill(int num){
        System.out.println(num + " sheets of paper added");
        this.paperLeft += num;
        System.out.println("---- Paper refilled ----");
        this.status();
    }
    public void empty(){
        this.paperLeft = 0;
        System.out.println("Paper Emptied");
    }
} //class