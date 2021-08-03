public class StackTest<top, stack> {
    private int maxSize;
    private int[] stack;
    private int top=-1;//栈空时为-1，非空为入栈位置索引
//    构造器
    public StackTest(int maxSize){
        this.maxSize=maxSize;
        stack=new int[this.maxSize];
    }
//    返回当前栈顶值的方法
    int peek(){
        return stack[top];
    }
//    判断栈是否空
    boolean isEmpty(){
        return top==-1;
    }
//    栈是否满
    boolean isFull(){
        return top==maxSize-1;
    }
//    入栈操作
    void push(int val){
        if(isFull()){

        System.out.println("栈已满");
        return;//直接返回
    }
    top++;
    stack[top]=val;

}
//出栈
int pop(){
    //判断是否为空
    if(isEmpty()){
//        异常抛出
        throw new RuntimeException("站控，没有数据");}
        int value=stack[top];
        top--;
        return value;
    }
    //判断元素是否在栈内
    private boolean isExist(int element){
        if(isEmpty()){
            System.out.println("栈空");
            return false;
        }
        for(int i=top;i>=0;i--){
            if(element==stack[i])
                return true;
        }
        return false;
    }
}

