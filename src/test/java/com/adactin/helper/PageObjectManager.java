package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotel;
import com.adactin.pom.CancelHotel;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
    public static WebDriver driver;
	private LoginPage lp;
	private SearchHotel sh;
	private SelectHotel sho;
	private BookHotel bh;
	private CancelHotel ch;
	
	
	
	
	public PageObjectManager(WebDriver mdriver) {
		this.driver=mdriver;
	}
	public LoginPage getLp() {
		lp=new LoginPage(driver);
		return lp;
	}
	public SearchHotel getSh() {
		sh=new SearchHotel(driver);
		return sh;
	}
	public SelectHotel getSho() {
		sho=new SelectHotel(driver);
		return sho;
	}
	public BookHotel getBh() {
		bh=new BookHotel(driver);
		return bh;
	}
	public CancelHotel getCh() {
		ch=new CancelHotel(driver);
		return ch;
	}
	
}
