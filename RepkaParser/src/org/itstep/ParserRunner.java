package org.itstep;

import org.itstep.servise.PageParserServise;

public class ParserRunner {

	public ParserRunner() {
	}

	public static void main(String[] args) {
		String url = "https://m.repka.ua/catalogsearch/result/?q=samsung";
		PageParserServise pps = new PageParserServise(url);
		pps.start();

	}

}
