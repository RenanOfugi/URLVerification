package verification;

public class VerificationSections {

	public boolean verificaProtocolo(String url){
		
		boolean valido = false;
		
		if(url.startsWith("http://") || url.startsWith("https://")){
			valido = true;
		}
		
		return valido;
	}
}
