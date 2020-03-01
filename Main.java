public class Main {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.push(2);
        ls.push(3);
        ls.push(4);
        ls.push(5);
        ls.push(7);
        System.out.println("Created Listed list :"); ls.printList();ls.deleteNode(7);
        System.out.println("linked list after deletion:");
        ls.printList();
}
}