public class Main {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.append(6);
        ls.push(7);
        ls.push(3);
        ls.insert(ls.head.next,4);
        System.out.print("linked list ---->");
        ls.printlist();
    }
}
