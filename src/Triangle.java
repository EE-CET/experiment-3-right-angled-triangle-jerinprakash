public class Triangle {
    public static void main(String[] args) {
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
                if(j!=2*i-1){
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
