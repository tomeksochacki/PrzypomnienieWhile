public class While {
    public static void main(String[] args) {

        int x = 5;
        int lastNumber = 25;

        while (x<=lastNumber) {
            System.out.print(x + ", ");

            if(x%5 == 0){
                System.out.println();
            }

            x++;
        }

    }
}
