package com.quickstart.quickstart.practice.components;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CupCakeController{

   @GetMapping(path="/cupcakes")
   public String cupcakes(){

   	return "<h1>Cupcake ipsum dolor sit amet chocolate cake. Carrot cake I love jujubes candy gingerbread pastry chocolate cake. Cake fruitcake sweet roll pudding bonbon cake macaroon jujubes. Carrot cake cupcake I love danish sugar plum I love sesame snaps candy. Shortbread apple pie danish cake ice cream tootsie roll shortbread jelly. Icing chocolate cheesecake chocolate bar jelly I love I love bonbon donut. I love candy canes pie sweet roll I love liquorice jelly beans dessert. Gummi bears ice cream I love cotton candy liquorice apple pie. Lollipop wafer caramels cake jelly sweet bonbon marshmallow tiramisu. I love cheesecake jelly tiramisu chocolate. Candy apple pie cheesecake icing tart candy canes cake caramels cotton candy. Caramels topping chocolate bar icing pastry. Cookie I love liquorice oat cake macaroon oat cake. Cookie powder danish liquorice jelly danish cotton candy.</h1><p><i>Jujubes jelly I love cake caramels. Marzipan lemon drops oat cake chocolate cake fruitcake dragée wafer. Icing pie lollipop chocolate bar cupcake I love chupa chups jujubes. Pastry powder lollipop icing pie tart tiramisu cotton candy. Sugar plum tootsie roll chocolate bar pie powder oat cake halvah. Muffin croissant shortbread halvah gummies jelly muffin. Gummies I love cookie candy canes sweet roll. Pastry cookie I love macaroon apple pie I love. Apple pie powder gingerbread liquorice soufflé gummies fruitcake topping muffin. Sweet roll tart chocolate liquorice gummi bears muffin. Shortbread jelly-o topping I love jelly beans topping brownie fruitcake cheesecake. Marzipan donut caramels danish powder sesame snaps.</i></p>";

		}
}