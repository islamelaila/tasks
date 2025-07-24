public interface Eatable {

    abstract void eat();

   default void getYouMenu (){
        System.out.println(" Hi , iam konate and This is the menu");
    }
}
