package com.yilu.demo3;

public class GenericLinkedList<T> {
    private Node<T> head;
    private Node<T> last;
    private int size;

    public GenericLinkedList() {
        head = null;
        last = null;
        size = 0;
    }

    //添加结点(尾插)
    public boolean addList(Node<T> node) {
        if (node == null) {
            return false;
        } else if (head == null) {
            head = node;
            last = node;
        } else {
            node.prev = last;
            last.next = node;
            last = node;
        }
        size++;
        return true;
    }

    //添加结点(头插)
    public boolean addListToHead(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            last = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        return true;
    }

    //删除尾结点
    public void removeList0() {
        if (last == null) {
            return;
        } else if (head == last) {
            head = null;
            last = null;
        } else {
            last = last.prev;
            last.next = null;
        }
        size--;
    }

    //根据节点值删除节点
    public void removelistByValue(T value) {
        if (head == null) {
            return;
        }
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (!(currentNode.data.equals(value))) {
                currentNode = currentNode.next;
                continue;
            } else {
                if (head == last) {
                    head = null;
                    last = null;
                } else if (currentNode == head) {
                    head = head.next;
                    head.prev = null;
                } else if (currentNode == last) {
                    last = last.prev;
                    last.next = null;
                } else {
                    currentNode.prev.next = currentNode.next;
                    currentNode.next.prev = currentNode.prev;
                }
                size--;
            }
            currentNode = currentNode.next;
        }
    }

    //找到值为 value 的结点，返回这个结点下标（下标从 0 开始计算）
    public int find(T value) {
        if (head == null) {
            return -1;
        }
        Node<T> currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (!(currentNode.data.equals(value))) {
                index++;
                currentNode = currentNode.next;
            } else {
                return index;
            }
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> currentNode = head;
        while (currentNode != null) {
            sb.append(currentNode.data);
            if (currentNode.next != null) {
                sb.append(",");
            }
            currentNode = currentNode.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public String toStringReverse() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> currentNode = last;
        while (currentNode != null) {
            sb.append(currentNode.data);
            if (currentNode.prev != null) {
                sb.append(",");
            }
            currentNode = currentNode.prev;
        }
        sb.append("]");
        return sb.toString();
    }

    static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
