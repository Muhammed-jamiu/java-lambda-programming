public class Main {
    public static void main(String[] args){
    }

        public static void show(){
            greet(new ConsolePrinter());
        }
        public static void greet(Printer printer){
            printer.print("Hello! World");
        }
}

