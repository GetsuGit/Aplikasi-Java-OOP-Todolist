package AplikasiListOOP;

public class TodoList {

    private String todo;

    public TodoList(){

    }

    public TodoList(String todo){
        this.todo = todo;
    }

    // seter dan geter
    public String getTodo(){
        return todo;
    }

    public void setTodo(String todo){
        this.todo = todo;
    }

}
