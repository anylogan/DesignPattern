package fertilize;

public class RiceHandler extends FertilizeHandler {

	@Override
	public String handleRequest(String fertilizer) {
		String str = "";
		if(fertilizer == "Rice") {
			str = "Success: Has been fertilized for rice\r\n";
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
