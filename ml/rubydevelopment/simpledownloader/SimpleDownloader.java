package ml.rubydevelopment.simpledownloader;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class SimpleDownloader {

	public static void Download(String link, String destPath) {
		try (BufferedInputStream in = new BufferedInputStream(new URL(link).openStream());
				  FileOutputStream fileOutputStream = new FileOutputStream(destPath)) {
				    byte dataBuffer[] = new byte[1024];
				    int bytesRead;
				    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
				        fileOutputStream.write(dataBuffer, 0, bytesRead);
				    }
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
	
}
