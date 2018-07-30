public class Printer {
    private int paperLeft;
    private int tonerVolume;
    private int manyCopies;

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

    public void print() {
        System.out.println("---- Printing... ----");
        if (this.paperLeft > 0 && this.tonerVolume > 0) {
            this.paperLeft -= 1;
            this.tonerVolume -= 1;
            this.status();
        } else {
            System.out.println("Sorry, no paper");
            this.status();
        }
    }

    public void refill(){
        this.paperLeft = 100;
        System.out.println("---- Paper refilled ----");
        this.status();
    }

    public void empty(){
        this.paperLeft = 0;
        System.out.println("Paper Emptied");
    }
} //class