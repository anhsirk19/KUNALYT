import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();

    }
}

//it takes o(1) for push o(n) for pop

class QusingS{
    protected Stack<Integer> first;
    private Stack<Integer> second;

    public QusingS(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove(){
        while(!first.empty()){
            second.push(first.pop());;
        }
        int removed = second.pop();
        while(!second.empty()){
            first.push(second.pop());
        }
        return removed;
    }

    public boolean empty(){
        return first.empty();
    }

    public int peek(){
        while(!first.empty()){
            second.push(first.pop());;
        }
        int peek = second.peek();
        while(!second.empty()){
            first.push(second.pop());
        }
        return peek;
    }

}
