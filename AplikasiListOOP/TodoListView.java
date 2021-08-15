package AplikasiListOOP;

public class TodoListView {

   public TodoListService todoListService;

   public TodoListView(TodoListService todoListService){
      this.todoListService = todoListService;
   }
    public void viewList(){

      while (true) {
         todoListService.showList();

         System.out.println("Menu : ");
         System.out.println("1. Tambah");
         System.out.println("2. Hapus");
         System.out.println("x. Keluar");

         String input = InputListUtil.input("Pilih");

         if (input.equals("1")){
            viewAddList();
         } else if (input.equals("2")){
            viewRemoveList();
         } else if(input.equals("x")) {
            break;
         } else {
            System.out.println("Pilihan tidak di mengerti");
         }
      }

   }

   public void viewAddList(){
      System.out.println("===== Menambah List =====");
      System.out.println("Masupkan list yang akan anda isi : ");
      String inputlist = InputListUtil.input("(Pilih x Jika Batal)");

      // cek apakah menambah atau batal
      if (inputlist.equals("x")){
         // batal
      } else {
         todoListService.addList(inputlist);
      }
   }

   public void viewRemoveList(){
      System.out.println("===== Menghapus List =====");

      String number = InputListUtil.input("Pilih nomor yang di hapus (Pilih x Jika Batal)");

      if (number.equals("x")){
         // batal
      } else {
            todoListService.removeList(Integer.valueOf(number));
         }
      }
   }
