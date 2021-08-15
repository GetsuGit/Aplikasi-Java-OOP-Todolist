package AplikasiListOOP;

public class TodoListServiceIMPL implements TodoListService {

    private TodoListRepository todoListRepository;

    public TodoListServiceIMPL(TodoListRepository todoListRepository){
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showList() {
        TodoList[] model = todoListRepository.getAll();
        System.out.println("====== Aplikasi Menampilkan dan Menghapus List ======");
        for (int i = 0; i < model.length; i++ ){

            TodoList todolist = model[i];
            int no = i + 1;

            if (todolist != null){
                System.out.println(no + ". " + todolist.getTodo());
            }
        }
    }

    @Override
    public void addList(String todo) {
        TodoList todoList = new TodoList(todo);
        todoListRepository.add(todoList); // memanggil logic Repository IMPL
        System.out.println("Sukses Menambah list : " + todo);
    }

    @Override
    public void removeList(Integer number) {
        boolean success = todoListRepository.remove(number);
        if (success){
            System.out.println("Sukses Menghapus List : " + number);
        } else {
            System.out.println("Gagal Menghapus List : " + number);
        }
    }
}
