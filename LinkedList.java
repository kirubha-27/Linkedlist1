public class LinkedList {
    Node head;
    Node end;
    int size;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            next = null;
        }
    }
    public void insertAtBeginning(int x){
        if(head==null) {
            Node newNode = new Node(x);
            head = newNode;
            end = head;
            size++;
        }else{
            Node newNode = new Node(x);
            newNode.next = head;
            head = newNode;
            size++;
        }

    }
    public void insert(int x){
        if(head==null){
            Node newNode = new Node(x);
            head = newNode;
            end = head;
            size++;
            return;
        }
        Node newNode = new Node(x);
        end.next = newNode;
        end = newNode;
        size++;

    }
    public void insert(int x,int pos){
        if(pos==0){
            Node newNode = new Node(x);
            newNode.next = head;
            head = newNode;
            size++;
        }else{
            Node temp=head;
            for(int i=0;i<pos-1;i++){

                temp = temp.next;
                if(temp==null){
                    System.out.println("Invalid Position");
                    System.exit(0);
                }
            }
            Node newNode = new Node(x);
            newNode.next = temp.next;
            temp.next = newNode;
            if(newNode.next == null){
                end = newNode;
            }
            size++;
        }
    }
    public void delete(){
        Node temp = head;
        Node p = null;
        if(head == null){
            System.out.println("The list is Empty!!!");
            System.exit(0);
        }
        if(head.next==null){
            head = null;
            size--;
            return;
        }
        while (temp.next!=null){
            p = temp;
            temp = temp.next;
        }
        p.next = null;
        size--;
    }
    public void delete(int pos){
        if(head==null){
            System.out.println("List is empty!!!");
            return;
        }
        if(pos==0){
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
            if(temp.next==null){
                System.out.println("Invalid Position");
                System.exit(0);
            }
        }
        temp.next = temp.next.next;
        size--;
    }
    public void deleteAtBeg(){
        if(head==null){
            System.out.println("operation invalid!!");
            System.exit(0);
        }
        head = head.next;
        size--;
    }
    public int Size(){
        return size;
    }
    public void display(){
        Node p = head;
        while(p!=null){
            System.out.println(p.val);
            p=p.next;
        }
    }
    public String toString(){
        String str = "";
        Node p = head;
        str += "[";
        while(p.next!=null){
            str+=p.val+",";
            p=p.next;
        }
        str+=p.val+"]";
        return str;
    }
}
