package settings;

import java.util.HashMap;
import java.util.Map;

import Models.Addition;
import Models.Operation;
import Models.Soustraction;

public class ApplicationConfiguration {
	public static Map<String, Operation> operationByChar = new HashMap<String, Operation>();
	
	public static void configuration() {
		operationByChar.put("+", new Addition());
		operationByChar.put("-", new Soustraction());
	}
	
	public ApplicationConfiguration() {
		configuration();
	}
}
