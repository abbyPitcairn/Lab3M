
public class myPostFixCal implements IPostFixCal {

	@Override
	public int calculate(IStack stack, String postFixString) throws Exception {
		int result = 0;
		
		if (postFixString.isEmpty()) {
			return 0;
		}
		
		while (!postFixString.isEmpty()) {
			int i = 0;
			char c = postFixString.charAt(i);
			if (Character.isDigit(c)) {
				stack.push(postFixString.charAt(i));
				++i;
				
				if (i == postFixString.length() && result == 0) {
					throw new Exception("String does not include operators.");
				}
			}
			else {
				++i;
				int a = stack.pop();
				int b = stack.pop();
			
				String operators = "+-*/" + c;
				if (operators.charAt(0) == operators.charAt(4)) {
					result += a + b;
				}
				else if (operators.charAt(1) == operators.charAt(4)) {
					result += a - b;
				}
				else if (operators.charAt(2) == operators.charAt(4)) {
					result += a * b;
				}
				else {
					result += a / b;
				}
			}
			postFixString = result + postFixString.substring(i);
		
		}
		return result;
	}
}
