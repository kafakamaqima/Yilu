package com.yilu.demo3;

public class test {
    public static void main(String[] args) {
        GenericLinkedList<Integer> list = new GenericLinkedList<>();

        // 测试添加节点
        System.out.println("--- 测试添加节点 ---");
        list.addList(new GenericLinkedList.Node<>(1));
        list.addList(new GenericLinkedList.Node<>(2));
        list.addList(new GenericLinkedList.Node<>(2));
        list.addList(new GenericLinkedList.Node<>(3));
        list.addList(new GenericLinkedList.Node<>(4));
        System.out.println("链表内容: " + list);
        System.out.println("反向遍历: " + list.toStringReverse());
        System.out.println("当前大小: " + list.getSize());

        // 测试查找
        System.out.println("\n--- 测试查找 ---");
        System.out.println("查找2的位置: " + list.find(2));
        System.out.println("查找5的位置(不存在): " + list.find(5));

        // 测试删除尾节点
        System.out.println("\n--- 测试删除尾节点 ---");
        list.removeList0();
        System.out.println("删除后链表: " + list);
        System.out.println("反向遍历: " + list.toStringReverse());

        // 测试按值删除
        System.out.println("\n--- 测试按值删除 ---");
        list.addList(new GenericLinkedList.Node<>(2));  // 再添加一个2
        list.addList(new GenericLinkedList.Node<>(2));  // 再添加一个2
        System.out.println("删除前链表: " + list);
        list.removelistByValue(2);
        System.out.println("删除所有2后链表: " + list);

        // 测试边界情况
        System.out.println("\n--- 测试边界情况 ---");
        GenericLinkedList<String> emptyList = new GenericLinkedList<>();
        System.out.println("空链表查找: " + emptyList.find("test"));
        emptyList.removelistByValue("test");
        System.out.println("空链表删除后: " + emptyList);
    }
}
