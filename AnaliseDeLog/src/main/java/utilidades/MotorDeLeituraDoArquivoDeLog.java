package utilidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MotorDeLeituraDoArquivoDeLog {
	private final Map<String, List<StackNovaDoLog>> mapa = new HashMap<String, List<StackNovaDoLog>>();

	public Map<String, List<StackNovaDoLog>> leiaOArquivoECarregueTudoNoMapa() {
		int registroNoArquivoTexto = 0;
		while (registroNoArquivoTexto <= 10) {
			String chave = "0xbd4a";
			String stackQueVeioDoArquivoTexto = "LDAPConnThread-19194 ldaps://cmpdc06.elektro.com.br:389 daemon prio=3 tid=0x000000012b1e7000 nid=0xbd47 runnable [0xffffffff436ff000]"
					+ "java.lang.Thread.State: RUNNABLE" + "at java.net.SocketInputStream.socketRead0(Native Method)"
					+ "at java.net.SocketInputStream.read(SocketInputStream.java:129)"
					+ "at java.io.BufferedInputStream.fill(BufferedInputStream.java:218)"
					+ "at java.io.BufferedInputStream.read(BufferedInputStream.java:237)"
					+ "- locked <0xfffffffd100d8e58> (a java.io.BufferedInputStream)"
					+ "at netscape.ldap.ber.stream.BERElement.getElement(Unknown Source)"
					+ "at netscape.ldap.LDAPConnThread.run(Unknown Source)"
					+ "at java.lang.Thread.run(Thread.java:682);";

			poeNoMapa(chave, stackQueVeioDoArquivoTexto);
			registroNoArquivoTexto++;
		}

		return mapa;
	}

	private void poeNoMapa(String chave, String stackQueVeioDoArquivoTexto) {
		List<StackNovaDoLog> doLogs;

		// Processei o arquivo texto
		StackNovaDoLog stackNovaDoLog = StackNovaDoLog.novo(stackQueVeioDoArquivoTexto);
		if (mapa.containsKey(chave)) {
			mapa.get(chave).add(stackNovaDoLog);
		} else {
			doLogs = new ArrayList<StackNovaDoLog>();
			doLogs.add(stackNovaDoLog);
			mapa.put(chave, doLogs);
		}
	}
}
