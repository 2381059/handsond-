package repositories;

//public class TodoListRepositoryImpl {
 import entities.TodoList;



































private static void resizeArrayIfFull() {
    // cek whether todos is full
    Boolean isFull = true;
    isFull = isArrayFull(isFull);

    // if full, resize current array two times bigger
    if (isFull) {
        resizeArrayToTwoTimesBigger();
    }
}

private static void resizeArrayToTwoTimesBigger() {
    String[] temp = todos;
    todos = new String[todos.length * 2];
    for (int i = 0; i < temp.length; i++) {
        todos[i] = temp[i];
    }
}
}
for (int i = number - 1; i < todos.length; i++) {
        // if todo is the last elementif (i == (todos.length - 1)) {
todos[i] = null;} else {
// replace with the element on the right
todos[i] = todos[i + 1];}
}return true;
}
public static boolean editTodoList(Integer number, String newTodo) {
    if (isSelectedTodoNotValid(number)) {
        return false;
    }
    todos[number - 1] = newTodo;
    return true;
}

























