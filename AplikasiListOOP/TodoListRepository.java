package AplikasiListOOP;


public interface TodoListRepository {

    // disini interface logicnya

    TodoList[] getAll();

    void add(TodoList todoList);

    boolean remove(Integer number);

}
