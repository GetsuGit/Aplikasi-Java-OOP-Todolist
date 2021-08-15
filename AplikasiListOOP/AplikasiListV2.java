package AplikasiListOOP;

public class AplikasiListV2 {
    public static void main(String[] args) {

      TodoListRepository todoListRepository = new TodoListRepositoryIMPL();
      TodoListService todoListService = new TodoListServiceIMPL(todoListRepository);
      TodoListView todoListView = new TodoListView(todoListService);

      todoListView.viewList();

    }
}
