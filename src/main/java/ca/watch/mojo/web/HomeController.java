package ca.watch.mojo.web;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	private static final Logger LOGGER = LogManager.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) throws IOException {
		LOGGER.info("home controller called.");
		return "home";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		LOGGER.info("about controller called.");
		return "about";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact(Model model) {
		return "contact";
	}

	@RequestMapping(value = "/404", method = RequestMethod.GET)
	public String notFound(Model model) {
		LOGGER.info("notFound controller called.");
		return "404";
	}
}
