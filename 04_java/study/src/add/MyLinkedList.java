package add;

public class MyLinkedList<E> {
    //클래스의 Node
    private static class Node<E>{  
        E data; //실제 값
        Node<E> next; //다음 노드
        
        public Node(E data) {
            this.data = data;
            this.next = null;

        }
        
    }

    private Node<E> head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(E value) {
        Node<E> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    //맨 앞에 요소 추가
    public void addLast(E value) {
        Node<E> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null) { //해당 값이 마지막인지 체크
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void add(int index, E value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(value);
        } else {
            Node<E> newNode = new Node<>(value);
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next; //찾는 인덱스 앞노드까지 순회
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }
}
