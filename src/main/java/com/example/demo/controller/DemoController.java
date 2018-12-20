/**
 *  creater fcfhaha
 *  2018  下午3:53:52
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcfhaha 2018 - 下午3:53:52
 */
@RestController
public class DemoController {

	@GetMapping(value = "/demo")
	public String getMethodName(@RequestParam String param) {
		return new String(param);
	}

}
