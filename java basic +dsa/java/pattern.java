public class pattern{
    public static void main(String[] args) {
        for(int i = 0; i <5;i++){
            for(int j=5;j>0;j--){
                if(j !=i){
                    System.out.print(j);
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}