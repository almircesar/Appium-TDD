package br.com.resinet.hub_tdd.Utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.rsinet.hub_tdd.provaTDD.automationFramework.TesteCadastro;
import br.com.rsinet.hub_tdd.provaTDD.automationFramework.TesteHome;
import br.com.rsinet.hub_tdd.provaTDD.automationFramework.TestePesquisaLupa;

@RunWith(Suite.class)
@SuiteClasses({ TesteCadastro.class, 	TesteHome.class,TestePesquisaLupa.class })
public class Runner {

	@BeforeClass
	public static void iniciaReport() {
		Report.iniciaReport();
	}

	@AfterClass
	public static void fecharReport() {
		Report.fechaReport();
	}
}
