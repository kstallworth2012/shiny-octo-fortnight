package com.quickstart.quickstart.practice.components;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeToTheShowController{

   @GetMapping(path="/daShow")
   public String showMe(){
	return "<h1>Liquorice topping danish pudding gummi bears apple pie. Pudding pastry marzipan gingerbread cheesecake lemon drops sweet macaroon. Oat cake chupa chups icing gingerbread donut carrot cake pastry chupa chups pudding. Pudding liquorice dragée toffee cookie dessert cotton candy danish candy.</h1>";
		}
}