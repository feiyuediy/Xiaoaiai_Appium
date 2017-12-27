package com.lazy.controls;

import com.lazy.interfaces.Clickable;
import org.openqa.selenium.By;

public class Click extends AbstractControl implements Clickable {

	/* (non-Javadoc)
	 * @see lazy.android.interfaces.Clickable#click()
	 */
	public void click() {
		this.expectElementExistOrNot(true);
		String sXpath = getValidXpath();
		driver.findElement(By.xpath(sXpath)).click();
	}
}
