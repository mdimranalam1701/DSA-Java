/*
Question: How does linear search find a string inside an array of names?
Example: Search "banana" in {"apple", "banana", "mango"} -> index 1.
*/
public class linearsearch {
    public static void main(String[] args) {
        String menu[] = {"kabbab","chola","pharata","kirch"};
        // for(int i=0;i<menu.length;i++){
        //     if(menu[i] == "pharata"){
        //         System.out.println("oder add karlo");
        //         break;
        //     }else{
        //         System.out.println("nahi hai ");
        //     }
        // }
        int i=0;
        int count = 0;
        while (i<menu.length) {
            if(menu[i] == "phrata"){
                System.out.println("available");
                count++;
                break;
            }
            i++;
        }
        if(count == 0 ){
            System.out.println("not avaiable");
        }
    }
}