package verification;

public class VerificationSections {

	public boolean verificaProtocolo(String url){
		
		boolean valido = false;
		
		if(url.startsWith("http://") || url.startsWith("https://")){
			valido = true;
		}
		
		return valido;
	}
	
	public boolean verificaDominio(String host){
		
		boolean valido = false;
		
		if(!host.startsWith(".")){
			valido = true;
		}
		
		return valido;
	}
	
}
