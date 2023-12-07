package week_14.assignments.Question_14_08;

public class Question_14_08 {
    public static void main(String[] args) {
        MyStack<Integer> list = new MyStack<>();
        list.push(1);
        list.push(2);
        list.push(3);

        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);
        System.out.println(list.top());
        System.out.println(list.empty());

    }
}
