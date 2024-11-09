package views;
import entities.TodoList;
import java.util.Scanner;
import services.TodoListService;

public class TodoListTerminalViewImpl implements TodoListView {
    private final TodoListService todolistService;
    public static Scanner = new Scanner (System.in

    public TodoLisTerminalViewImp(final TodoListService todoListService)




    @Override
    public void run();

    public static String input(String info) {
        System.out.print(info + " : ");
        var data = scanner.nextLine();
        return data;
    }

    public static void showMainMenu() {
        // infinite loop so the program will always run
        boolean isRunning = true;
        while (isRunning) {
            showTodoList();
            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Edit");
            System.out.println("4. Keluar");
            // input untuk menerima input dari user
            String selectedMenu = input("Pilih");

            switch (selectedMenu) {
                case "1":
                    showMenuAddTodoList();
                    break;
                case "2":
                    showMenuRemoveTodoList();
                    break;
                case "3":
                    showMenuEditTodoList();
                    break;
                case "4":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilih menu dengan benar");
            }
        }
    }

    public static void showMenuRemoveTodoList() {
        System.out.println("MENGHAPUS TODO LIST");
        var number = input("Nomor yang dihapus (x jika batal)");
        if (number.equals("x")) {
            //batal
        } else {
            boolean success = todoListService(Integer.valueOf(number));
            if (!success) {
                System.out.println("Gagal menghapus todo list : " + number);
            }
        }
    }

    public static void showMenuAddTodoList() {
        System.out.println("MENAMBAH TODO LIST");
        var todo = input("Todo (x jika batal)");
        if (todo.equals("x")) {
            // batal
        } else {
            todoListService.addTodoList(todo);
        }
    }

    public static void showMenuEditTodoList() {
        System.out.println("MENGEDIT TODO LIST");
        String selectedTodo = input("Masukkan nomor todo (x jika batal)");
        if (selectedTodo.equals("x")) {
            return;
        }
        String newTodo = input("Masukkan todo yang baru (x jika batal)");
        if (newTodo.equals("x")) {
            return;
        }
        boolean isEditTodoSuccess = todoListService(Integer.valueOf(selectedTodo), newTodo);
        if (isEditTodoSuccess) {
            System.out.println("Berhasil mengedit todo");
        } else {
            System.out.println("Gagal mengedit todo");
        }
    }




}
