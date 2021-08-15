package AplikasiListOOP;

public class TestView {
    public static void main(String[] args) {

        //viewTesList();
        //viewTesAddList();
        viewTestRemoveList();
    }

    public static void viewTesList(){

        TodoListRepository todoListRepository = new TodoListRepositoryIMPL();
        TodoListService todoListService = new TodoListServiceIMPL(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addList("User a");
        todoListService.addList("User b");
        todoListService.addList("User c");

        todoListView.viewList();
    }

    public static void viewTesAddList(){

        TodoListRepository todoListRepository = new TodoListRepositoryIMPL();
        TodoListService todoListService = new TodoListServiceIMPL(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.viewAddList();
        todoListService.showList();

        todoListView.viewAddList();
        todoListService.showList();

    }

    public static void viewTestRemoveList(){

        TodoListRepository todoListRepository = new TodoListRepositoryIMPL();
        TodoListService todoListService = new TodoListServiceIMPL(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addList("User a");
        todoListService.addList("User b");
        todoListService.addList("User c");

        todoListService.showList();
        todoListView.viewRemoveList();
        todoListService.showList();
    }
}
