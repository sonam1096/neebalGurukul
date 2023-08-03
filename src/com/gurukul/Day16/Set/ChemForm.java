package com.gurukul.Day16.Set;
import java.util.Hashtable;
import java.util.Set;
import java.util.Stack;

class Data {
    String ch;
    int count;

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Data [ch=" + ch + ", count=" + count + "]";
    }

    public Data(String ch, int count) {
        super();
        this.ch = ch;
        this.count = count;
    }
}

public class ChemForm{
    public static void main(String[] args) {
String msg="K4(ON(SO3)2)2";
		

		Stack<Data> stack=new Stack<>();
		for(int i=0;i<msg.length();i++) {
			char ch=msg.charAt(i);
			System.out.println(ch);
			if(Character.isLetter(ch)) {
				    if(Character.isUpperCase(ch))
					stack.push(new Data(ch+"",1));
				    
				    else {
				    	Data data=stack.pop();
				    	data.setCh(data.getCh()+ch);
				    	stack.push(data);
				    }
					
				
			}
			else if(Character.isDigit(ch)) {
				
				if(stack.peek().getCh().equals(")")) {
					int count=0;
					Stack<Data> temp=new Stack<>();
					do {
						Data data=stack.pop();
						if(data.getCh().equals(")")){
							count++;
						}
						else if(data.getCh().equals("(")) {
							temp.push(data);
							count--;
						}
						else {
							int num=(ch-48);
							data.setCount(data.getCount()*num);
							//temp.push(data);
						}
						temp.push(data);
						
					}while(count!=0);
					while(!temp.isEmpty()) {
						stack.push(temp.pop());
					}
				}
				else {
					
					Data data=stack.pop();
					data.setCount((ch-48)*data.getCount());
					
                     stack.push(data);
				}
				
			}
			else if(ch=='(') {
				
				stack.push(new Data("(",1));
			}
			
			else {
				stack.push(new Data(")",1));
				
			}
			
		}
		
	Hashtable<String, Data> table=new Hashtable<>();
	while(!stack.isEmpty()) {
		
		Data data=stack.pop();
		if(table.get(data.getCh())!=null) {
			String key=data.getCh();
			int count=data.getCount()+ table.get(key).getCount();
			data.setCount(count);;
			
			table.put(data.getCh(), data);
		}
		else
		{
			table.put(data.getCh(), data);
		}
	}
		Set<String> keyset=table.keySet();
		
		for(String key:keyset) {
			System.out.println(table.get(key));
		}

	}

}