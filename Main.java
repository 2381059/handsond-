import repositories.TodoListRepository;




public class Main {
    public static void main(String[] args) {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    TodoListView todolistView = new TodoListTerminalViewImpl(todoListService);
    todoListView.run();
}