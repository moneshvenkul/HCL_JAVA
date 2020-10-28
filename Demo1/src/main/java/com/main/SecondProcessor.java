package com.main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class SecondProcessor implements MobileProcessor {

	public void process() {
		System.out.println("Second Processor");
	}

}
