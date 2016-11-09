package utilidades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessaStacksUtil {
	
	public static void main(String[] args) {
		String caminhoDaStack = "/Users/hivisonmoura/Downloads/acompanhamento_cmpsczeus07_10-20/ResultDumps_cmpsczeus07_10-20_1822.log";
		int processoDecimal = 2002;
		String hexadecimalDaStack = "0x"+Integer.toHexString(processoDecimal);
		
		processaStack(caminhoDaStack, hexadecimalDaStack);
	}
	
	public static void processaStack(String caminhoDaStack, String hexadecimalDaStack){
	
		String stringContatenaTexto;

		List<String> listaAuxiliar = new ArrayList<>();
		List<String> listaDeStacks = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(caminhoDaStack))) {

			listaAuxiliar = stream.collect(Collectors.toList());

		} catch (IOException e) {

			e.printStackTrace();

		}

		stringContatenaTexto = String.join("\n", listaAuxiliar);

		String[] arrayDivideStackEmBlocos= stringContatenaTexto.split("\n\n");

		for (int i = 1; i < (arrayDivideStackEmBlocos.length - 1); i++) {
			listaDeStacks.add(arrayDivideStackEmBlocos[i]);
		}

		/*
		 * Limpa variáveis temporárias
		 */
		listaAuxiliar.clear();
		arrayDivideStackEmBlocos = null;
		

		/*
		 * Criando HashMap
		 */
		Map<String, List<String>> hashMapDasStacks = new HashMap<>();
		List<String> doLogs;


		
		for (String stack : listaDeStacks) {

			String regexParaDelimitarONid = "\\snid=0x[[0-9]*[a-fA-F]*]*\\s";
			Pattern patternParaMapearNoTextONid = Pattern.compile(regexParaDelimitarONid);
			Matcher matchVerificaSeExisteNid = patternParaMapearNoTextONid.matcher(stack);

			while (matchVerificaSeExisteNid.find()) {

				String key = stack.substring(matchVerificaSeExisteNid.start() + 5, matchVerificaSeExisteNid.end() - 1);

				if (hashMapDasStacks.containsKey(key)) {
					hashMapDasStacks.get(key).add(stack);
				} else {
					doLogs = new ArrayList<>();
					doLogs.add(stack);
					hashMapDasStacks.put(key, doLogs);
				}

			}

		}

		/*
		 * Pesquisa por Hexadecimal
		 */
		hashMapDasStacks.forEach((k, v) -> {

			if (hexadecimalDaStack.equals(k)) {
				System.out.println("Key: " + k + "\nStack: " + v);
			}
		});
	}
	
}
	


