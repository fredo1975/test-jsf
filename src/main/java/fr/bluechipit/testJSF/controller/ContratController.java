package fr.bluechipit.testJSF.controller;

import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@ManagedBean
@Controller
@Scope("singleton")
public class ContratController {

	public String add(){
		System.out.println("add");
		return "contrat.xhtml";
	}
}