
public class StackImplementationTest {

    public static void main(String[] args) {
        Stack stack = new StackImpl();
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.length());
        stack.push(1);
        stack.push("pesho");
        System.out.println(stack.peak());
        System.out.println(stack.length());
        for (int i = 0; i < args.length; i++) {
            stack.push(i);
        }
        
        Stack invariantStack = new InvariantStack();
        invariantStack.push(4);
        //invariantStack.push(4);
        
        LinkedList list = new LinkedList();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.add(5);
        
        System.out.println(list.size());
        System.out.println(list.get(4));
        System.out.println(list.getHead());
        System.out.println(list.getTail());
        list.remove(4);
        System.out.println(list);
        System.out.println(list.getHead());
        System.out.println(list.getTail());
        list.remove(0);
        System.out.println(list);
        System.out.println(list.getHead());
        System.out.println(list.getTail());
        list.remove(3);
        System.out.println(list);
        System.out.println(list.getHead());
        System.out.println(list.getTail());
        list.clear();
        System.out.println(list);
    }

}
