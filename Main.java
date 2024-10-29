public class Main {
    public static void main(String[] args) {
        //Creating the users table
        UserTableManager.createUsersTable();

        //Adding a column to the users table
        UserTableManager.addColumnToUsersTable("age", "INT");

        //Adding a user to the users table
        UserTableManager.addUser("Salem", "Salem@example.com");
    }
}
