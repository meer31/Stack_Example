public class StackExample {
    static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;

        }
    }
    static class Stack{
        public static Node head;
        public static boolean is_Empty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(is_Empty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static  int pop(){
            if(is_Empty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static  int peak(){
            if(is_Empty()){
                return -1;
            }
            return head.data;
        }
        public static void Display(){
            if(is_Empty()){
                System.out.println("Stack is Empty");
                return;

            }
            Node current=head;
            while(current!=null){
                System.out.println(current.data);
                current=current.next;
            }
        }

    }

    public static void main(String[] args) {

        Stack.push(5);
        Stack.push(10);
        Stack.push(15);
        System.out.println(Stack.peak());
        Stack.Display();
    }
}
