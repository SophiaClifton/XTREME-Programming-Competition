package problem2;

import java.util.Stack;
import java.text.DecimalFormat;

public class problemo2 {
	public static String evaluateExpression(String expression) {
		DecimalFormat df = new DecimalFormat("#.####");
        Stack<String> stack = new Stack<>();
        String num = "";
        double result = 0;
        
        try {
        for (char ch : expression.toCharArray()) {
        	//System.out.println("Character: "+ch);
            if (Character.isDigit(ch) || ch == '.') {
                num += ch;
            } 
            else if (ch == ' ') {
            	 if (!num.isEmpty()){
                     stack.push(num);
                     num = "";
             }
            }
            else if (ch == '[' || ch == '{' || ch == '<' || ch == '(') {
            	 if (!num.isEmpty()){
                     stack.push(num);
                     num = "";
                     }
                   stack.push(ch+"");
            }
            
            else if (ch == ']' || ch == '}' || ch == '>' || ch == ')') {
            	 if (!num.isEmpty()){
                     stack.push(num);
                     num = "";
              
             }
                	double num1 = Double.parseDouble(stack.pop());
                	double num2 = Double.parseDouble(stack.pop());
                	if(stack.size()>1) {stack.pop();}//to remove previous operand
                	//System.out.println("stack size: "+stack.size());
                	
                	//System.out.println(num1 + " " + num2);
                	result = evaluateBracketExpression(num1,num2,ch);
                	//System.out.println(result);
                	stack.push(result+"");
                	
                	
                }
       }
    
	}
        catch(ArithmeticException e) {return "Output: “Error: Division by Zero”";}
        catch(Exception e) {return "Output: “Error: Improper bracket nesting”";}

        String roundedResult = df.format(result);
        return "Output: “"+roundedResult+"”"; 
    }

    private static double evaluateBracketExpression(double num1, double num2, char ch) {
    	if(ch==')') {return num2+num1;}
    	else if(ch==']') {try{return num2-num1;}catch(Exception e) {}}
    	else if(ch=='}') {return num2*num1;}
    	else if(ch=='>') {
    		if (num1 == 0) {
                throw new ArithmeticException(); 
            }
    		return num2/num1;
    		}
    	return 0;		

    }
	        

    public static void main(String[] args) {
    	System.out.println(evaluateExpression("{[9 3] 2}"));
    	System.out.println(evaluateExpression(" [3 {2 <4 (8 5)>} ( {6 [7 2]} 9)]"));
    	System.out.println(evaluateExpression(" "));
    	System.out.println(evaluateExpression(" {[2 3} <4 2>)]"));
    	System.out.println(evaluateExpression(" <{[3 0] 2} (4 0)>"));
    	System.out.println(evaluateExpression(" <4 0>"));
    	System.out.println(evaluateExpression(" <{[3.5 1.5] 2.5} (7.2 2.4)>"));
    }
}
