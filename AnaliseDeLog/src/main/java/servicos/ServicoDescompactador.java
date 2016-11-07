package servicos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.GZIPInputStream;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;

public class ServicoDescompactador {

	public File extrairLogs(String caminho, List<String> arquivos){
		File localDestino = null;
		try {
			localDestino = createTempDirectory();
			for (String nomeDoArquivoInternoAoDiretorio : arquivos) {
				File arquivoTarGz = new File(caminho, nomeDoArquivoInternoAoDiretorio);
				try {
					this.extrairTarGz(arquivoTarGz, localDestino);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ArchiveException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return localDestino;
	}

	private static File createTempDirectory() throws IOException {
		final File temp;
		temp = File.createTempFile("Descompactados", Long.toString(System.nanoTime()));

		if (!(temp.delete())) {
			throw new IOException("Could not delete temp file: " + temp.getAbsolutePath());
		}
		if (!(temp.mkdir())) {
			throw new IOException("Could not create temp directory: " + temp.getAbsolutePath());
		}

		return temp;
	}

	private void extrairTarGz(File arquivoTarGz, File localDestino) throws IOException, ArchiveException {
		File arquivoTar = unGzip(arquivoTarGz, localDestino);
		unTar(arquivoTar, localDestino);
		if (arquivoTar.delete()) {
			System.err.println("Could not delete file: " + arquivoTar);
		}
	}

	private List<File> unTar(File arquivoTar, File localDestino) throws IOException, ArchiveException {

		List<File> untaredFiles = new LinkedList<File>();
		InputStream inputStream = new FileInputStream(arquivoTar);
		TarArchiveInputStream tarArchiveInputStream = (TarArchiveInputStream) new ArchiveStreamFactory()
				.createArchiveInputStream("tar", inputStream);
		TarArchiveEntry entradaTar;
		byte[] buffer = new byte[1024];
		int bytesLido;

		while ((entradaTar = (TarArchiveEntry) tarArchiveInputStream.getNextEntry()) != null) {
			File outputFile = new File(localDestino, entradaTar.getName());

			if (entradaTar.isDirectory()) {
				if (!outputFile.exists() && !outputFile.mkdirs()) {
					System.err.println("Could not create file: " + outputFile.getAbsolutePath());
				}
			} else {
				OutputStream outputFileStream = new FileOutputStream(outputFile);

				while ((bytesLido = tarArchiveInputStream.read(buffer)) > 0) {
					outputFileStream.write(buffer, 0, bytesLido);
				}
				outputFileStream.close();
			}
			untaredFiles.add(outputFile);
		}
		tarArchiveInputStream.close();

		return untaredFiles;
	}

	private File unGzip(final File arquivoGz, final File localDestino) throws IOException {

		File outputFile = new File(localDestino, arquivoGz.getName().substring(0, arquivoGz.getName().length() - 3));
		GZIPInputStream gzipInputStream = new GZIPInputStream(new FileInputStream(arquivoGz));
		FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
		byte[] buffer = new byte[1];
		int bytesLido;

		while ((bytesLido = gzipInputStream.read(buffer)) > 0) {
			fileOutputStream.write(buffer, 0, bytesLido);
		}

		gzipInputStream.close();
		fileOutputStream.close();

		return outputFile;
	}
}
