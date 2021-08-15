package AplikasiListOOP;

public class TodoListRepositoryIMPL implements TodoListRepository {

    public TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    public boolean isFull(){
        // cek apakah list penuh
        boolean isFull = true;
        for (int i = 0; i < data.length; i++){
            if(data[i] == null){
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void resizeIsFull(){
        // jika penuh, resize ukuran array 2x
        if (isFull()){
            TodoList[] temp = data;
            data = new TodoList[data.length * 2];

            // mereset
            for (int i = 0; i < temp.length; i++){
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(TodoList todolist){

        // menambah ke posisi array nilainya null
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todolist;
                break;
            }
        }
     }

     @Override
    public boolean remove(Integer number){

         if ((number - 1) >= data.length){
             return false;
         } else if (data[number - 1] == null){
             return false;
         } else {
             for (int i = (number - 1); i < data.length; i++){
                 if (i == (data.length - 1)){ // sudah di ujung data agar tidak out of bound
                     data[i] = null;
                 } else {
                     // menggeser ke atas
                     data[i] = data[i + 1];
                 }
             }
             return true;
         }

    }
}
