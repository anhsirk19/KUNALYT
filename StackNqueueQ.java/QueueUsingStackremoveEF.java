import java.util.Stack;

public class QueueUsingStackremoveEF {
    public static void main(String[] args) {
        
    }
}
class QuseS{
    protected Stack<Integer> first;
    private Stack<Integer> second;

    public QuseS(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        while(!first.empty()){
            second.push(first.pop());;
        }
        first.push(item);
        while(!second.empty()){
            first.push(second.pop());
        }
    }

    public int remove(){
        return first.pop();
    }

    public boolean empty(){
        return first.empty();
    }

    public int peek(){
        return first.peek();
    }

}
