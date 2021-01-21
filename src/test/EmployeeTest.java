package test;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

import main.Employee;
import main.EmployeeType;

public class EmployeeTest {

	@Test //Test de calcular el salario de Worker con currency USD
	public void testCsWithUSDAndWorker() {
		Employee worker = new Employee(400,"USD",0.50f ,EmployeeType.Worker);
		assertEquals(416.08, worker.cs());
	}
	
	@Test //Test de calcular el salario de Worker sin currency USD
	public void testCsWithOutUSDAndWorker() {
		Employee worker = new Employee(400,"GBP",0.50f ,EmployeeType.Worker);
		assertEquals(444.33, worker.cs());
	}
	
	@Test //Test de calcular el salario de Manager con currency USD
	public void testCsWithUSDAndManager() {
		Employee manager = new Employee(400,"USD",0.50f,EmployeeType.Manager);
		assertEquals(466.87, manager.cs());
	}
	
	@Test //Test de calcular el salario de Manager sin currency USD
	public void testCsWithOutUSDAndManager() {
		Employee manager = new Employee(400,"GBP",0.50f,EmployeeType.Manager);
		assertEquals(444.68, manager.cs());
	}
	
	@Test //Test de calcular el salario de Supervisor con currency USD
	public void testCsWithUSDAndSupervisor() {
		Employee supervisor = new Employee(400,"USD",0.50f ,EmployeeType.Supervisor);
		assertEquals(467.08, supervisor.cs());
	}
	
	@Test //Test de calcular el salario de Supervisor sin currency USD
	public void testCsWithOutUSDAndSupervisor() {
		Employee supervisor = new Employee(400,"GBP",0.50f ,EmployeeType.Supervisor);
		assertEquals(444.50, supervisor.cs());
	}
	
	@Test //Test calcular bonus anual de trabajador con con currency USD
	public void TestYearBonusUSAndWorker() {
		Employee worker= new Employee(400,"USD",0.50f ,EmployeeType.Worker);
		assertEquals(386.0, worker.CalculateYearBonus());
	}
	@Test //Test calcular bonus anual de Manager con currency USD
	public void TestYearBonusUSAndManager() {
		Employee manager = new Employee(400,"USD",0.50f,EmployeeType.Manager);
		assertEquals(593.0, manager.CalculateYearBonus());
	}
	@Test  //Test calcular bonus anual de Supervisor con currency USD
	public void TestYearBonusUSAndSupervisor() {
		Employee supervisor = new Employee(400,"USD",0.50f ,EmployeeType.Supervisor);
		assertEquals(786.0, supervisor.CalculateYearBonus());
	}
}