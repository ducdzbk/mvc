package controller;

import java.lang.ProcessHandle.Info;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
@GetMapping("/new")
public String profile(Model modle) {
	List<Info> profile=new ArrayList<>();
	profile.add(new Info("name","duc"));
	modle.addAttribute("ĐvĐ",profile);
	return profile;
}
}
