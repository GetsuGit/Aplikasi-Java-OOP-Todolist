package AplikasiListOOP;

public class TestService {
    public static void main(String[] args) {

        //testShowTodolist();
        testAddTodoList();
        //testRemoveTodoList();

    }

    public static void testShowTodolist(){
        TodoListRepositoryIMPL todoListRepository = new TodoListRepositoryIMPL();
        todoListRepository.data[0] = new TodoList("User 1");
        todoListRepository.data[1] = new TodoList("User 2");
        todoListRepository.data[2] = new TodoList("User 3");

        TodoListService todoListService = new TodoListServiceIMPL(todoListRepository);

        todoListService.showList();

    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryIMPL();
        TodoListService todoListService = new TodoListServiceIMPL(todoListRepository);

        todoListService.addList("User 1 A");
        todoListService.addList("User 2 B");
        todoListService.addList("User 3 C");
        todoListService.addList("User 4 A");
        todoListService.addList("User 5 B");
        todoListService.addList("User 6 C");

        todoListService.showList();

    }

    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryIMPL();
        TodoListService todoListService = new TodoListServiceIMPL(todoListRepository);

        todoListService.addList("User 1 A");
        todoListService.addList("User 2 B");
        todoListService.addList("User 3 C");

        todoListService.showList();

        todoListService.removeList(7);
        todoListService.removeList(1);
        todoListService.showList();
        todoListService.removeList(1);
        todoListService.showList();
        todoListService.removeList(1);
        todoListService.showList();
    }

}
