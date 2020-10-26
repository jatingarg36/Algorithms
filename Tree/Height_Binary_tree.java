package Tree;

public class Height_Binary_tree {


    public static void main(String[] args) {
        String a="5 5 N 4 10 N 8 5 N 8 8 N 6";
        System.out.println(height_binary_tree(a));
    }

    private static int height_binary_tree(String a) {
        String[] arr = a.split(" ");
        int height=1;

        for(int i=0;i<arr.length/2;i++){
            if(!arr[2 * i + 1].equals("N") || !arr[2 * i + 2].equals("N")){
                height++;
            }
        }
        return height;
    }
}
