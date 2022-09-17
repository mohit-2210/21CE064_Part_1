interface MyInterface {
    public void square(int a);
        default void show() {
        System.out.println("Default Method Executed");
    }
}