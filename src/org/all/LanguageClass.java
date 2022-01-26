package org.all;
import org.telugu.Telugu;

public class LanguageClass extends Telugu {
	private void allLanguage() {
		System.out.println("i know allLang is:Tamil,Eng,Telgu");
	}
	public static void main(String[] args) {
		LanguageClass l =new LanguageClass();
		l.allLanguage();
		l.englishLanguage();
		l.tamilLanguage();
		l.teluguLanguage();
	}

	
}
