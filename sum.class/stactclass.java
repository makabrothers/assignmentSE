public class StackClass2 {
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class stack{
        public static Node head;

        public static boolean isEmpty() {
            return head == null;

        }
        public static void PushElements(int data){
            Node newnode = new Node(data);
            if (isEmpty()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;

        }
        public static int Popelements(){
            if (isEmpty()){
                return -1;
            }
            int top= head.data;
            head=head.next;
            return top;

        }
        public static int peek() {
            if (isEmpty()) {

                return -1;
            }
            return head.data;

        }
        public static void reverseOreder(){
            if(head==null || head.next==null){
                return;
            }
            Node previos=head;
            Node current=head.next;
        }

    }
    public static void main(String[] args) {
        stack s =new stack();
        stack.PushElements(1);
        stack.PushElements(2);
        stack.PushElements(3);
        stack.PushElements(4);
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.Popelements();

        }


    }

}