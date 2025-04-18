class MyQueue {
    stack<int>s1,s2;
public:
    MyQueue() {
    }       
    void push(int x) {
       // move all elemnts from s1 to s2
       while(!s1.empty()){
        s2.push(s1.top());
        s1.pop();
       }
       //push new elemednt to s1
       s1.push(x);

       // move everything back from s2 to s1
       while(!s2.empty()){
        s1.push(s2.top());
        s2.pop();
       }
    }

    int pop() {
        int val=s1.top();
        s1.pop();
        return val;
    }
    
    int peek() {
        return s1.top();
    }
    
    bool empty() {
        return s1.empty();
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */