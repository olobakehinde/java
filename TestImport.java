import java.util.Arrays;
import java.util.Scanner;
public class TestImport {

    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);

        System.out.println("total number of item to buy");
        int itemNum =num.nextInt();

        String [] shopitem = new String[itemNum];
        System.out.println("enter your item with respect to your itemNum"+" "+itemNum);
        for (int i=0; i<shopitem.length; i++ ){
            Scanner item = new Scanner(System.in);
            shopitem[i]=item.nextLine();
        }

        System.out.println(Arrays.toString(shopitem));
    }
    
}
