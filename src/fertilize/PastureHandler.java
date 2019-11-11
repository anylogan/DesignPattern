package fertilize;

public class PastureHandler extends FertilizeHandler {

	@Override
	public String handleRequest(String fertilizer) {
		// TODO Auto-generated method stub
		String str = "";
		if(fertilizer == "Pasture") {
			str = "Success: Has been fertilized for pasture\r\n";
			// System.out.println(str);
		}
		else {
			if(getSuccessor() != null)
            {
                return getSuccessor().handleRequest(fertilizer);
            }
		}
		return str;
	}

}
