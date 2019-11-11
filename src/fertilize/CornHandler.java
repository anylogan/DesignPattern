package fertilize;

public class CornHandler extends FertilizeHandler {

	@Override
	public String handleRequest(String fertilizer) {
		String str = "";
		if(fertilizer == "Corn") {
			str = "Success: Has been fertilized for corn\r\n";
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
