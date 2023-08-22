package entities;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Imprimir as pastas de um local
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Imprimir os arquivos de um local
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		// Criar pastas
		
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diretório criado com sucesso " + sucess);
		
		sc.close();
	}
}
