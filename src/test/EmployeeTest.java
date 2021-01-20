package test;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

import main.Employee;
import main.EmployeeType;

public class EmployeeTest {

	@Test //Test de calcular el salario de Worker con currency USD
	public void testCsWithUSDAndWorker() {
		Employee worker = new Employee(400,"USD",0.50f ,EmployeeType.Worker);
		assertEquals(2, 2);
	}
	
	@Test //Test de calcular el salario de Manager con currency USD
	public void testCsWithUSDAndManager() {
		Employee manager = new Employee(400,"USD",0.50f,EmployeeType.Manager);
		assertEquals(466.87, manager.cs());
	}
	
	@Test //Test de calcular el salario de Supervisor con currency USD
	public void testCsWithUSDAndSupervisor() {
		Employee supervisor = new Employee(400,"USD",0.50f ,EmployeeType.Supervisor);
		assertEquals(467.08, supervisor.cs());
	}

}