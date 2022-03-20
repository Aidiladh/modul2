public class OperatorB {
    public static void main(String[] args) {
        float total= 14000;
        System.out.println("Original investment:$"+total);
        total= total+(total*.4F);
        System.out.println("After one year:$"+total);
        //loses $1,500 the second year
        total= total - 1500F;
        System.out.println("after two years:$"+total);
        //incrasses by 12 precent the third year
        total= total+(total*.12F);

        System.out.println("after three years:$"+total);

    }
}
