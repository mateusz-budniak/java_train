import java.util.ArrayList;

class quickstart {
    public static void main (String[] args) {
        String matrix = "1 2 3\n4 5 6\n7 8 9\n";
        System.out.println("The base matrix is:");
        System.out.print(matrix);

        ArrayList<String> rows = new ArrayList<String>();
        rows = contain.get_rows(matrix);
        
        ArrayList<String> columns = new ArrayList<String>();
        columns = contain.get_columns(matrix);

        System.out.println("The rows are: " + rows);
        System.out.print("The columns are: " + columns);
    }
}