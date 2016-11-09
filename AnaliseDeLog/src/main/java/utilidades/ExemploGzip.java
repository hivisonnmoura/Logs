package utilidades;


 import java.io.*;
 import java.util.zip.*;
 
 public class ExemploGzip {
   public static void main(String[] args) throws Exception {
   int TAMANHO_BUFFER = 2048; //2 KBytes
   byte[] dados = new byte[TAMANHO_BUFFER];
 
   //File arquivo = new File("c:/Users/TREINAMENTO/teste.txt");
  
   File arquivoGzip = new File("c:/Users/TREINAMENTO/teste.gz");
   File arquivo2 = new File("c:/Users/TREINAMENTO/teste2.txt");
   System.out.println("tar.gz");
 
   /*cria o GZIP
   OutputStream os = new FileOutputStream( arquivoGzip );
   GZIPOutputStream gos = new GZIPOutputStream( os );
   InputStream is = new FileInputStream( arquivo );*/
   int bytesLidos = 0;/*
   while( (bytesLidos = is.read( dados, 0, TAMANHO_BUFFER )) > 0 ) {
     gos.write( dados, 0, bytesLidos );
   }
   is.close();
   gos.close();
   os.close();*/
   
   //extrai o GZIP
   InputStream is2 = new FileInputStream( arquivoGzip );
   GZIPInputStream gis = new GZIPInputStream( is2 );
   OutputStream os2 = new FileOutputStream( arquivo2 );
   bytesLidos = 0;
   while( (bytesLidos = gis.read( dados, 0, TAMANHO_BUFFER )) > 0 ) {
     os2.write( dados, 0, bytesLidos );
   }
   os2.close();
   gis.close();
   is2.close();
   }
 } 