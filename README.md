# Junit5Basic

# Modular Architecture: 
							JUnit 5 is divided into three main components: JUnit Platform, JUnit Jupiter, and JUnit Vintage. This modular architecture allows for better integration with other testing frameworks and tools.

#Junit Platform:
					The JUnit Platform is a part of the JUnit 5 testing framework that provides the foundation for discovering, executing, and reporting on tests. It serves as an execution environment for running tests on different JVMs (Java Virtual Machines), making it possible to integrate JUnit 5 with various build tools, IDEs (Integrated Development Environments), and testing frameworks.
							
#JUnit Jupiter: 
				This is the programming and extension model for writing tests and extensions. It supports annotations like @Test for marking test methods, @BeforeEach and @AfterEach for setup and teardown, parameterized tests using @ParameterizedTest, and more.
				
#Junit Vintage
				JUnit Vintage is a subproject of the JUnit platform that allows you to run JUnit 3 and JUnit 4 tests on the JUnit 5 platform. It provides a bridge between the older JUnit versions and the modern JUnit 5 framework, allowing you to leverage the new features and capabilities of JUnit 5 while still being able to run and maintain your existing JUnit 3 and JUnit 4 tests

#Extensibility: 
				JUnit 5 is designed to be highly extensible. You can create custom extensions to enhance the testing framework's behavior, such as custom display names, lifecycle callbacks, and more.



# Test Method Lifecycle:
							 Methods annotated with @Test are the actual test methods. Each test method is executed independently and should focus on testing a specific aspect of the code.

# Note:
		For each method which is annotated with @test the junit5 will create separate instance. 
		
#Hooks:
	1)	@BeforeEach 
		
		Annotated with @BeforeEach.
		Executed before each individual test method.
		Used for preparing the test environment and resetting resources.
	
	  
    2) @AfterEach
    	Executed after each individual test method.
      Used for cleaning up resources or performing post-test actions.
      
    3) @AfterAll
    	Executed once after all test methods in the test class.
      Used for releasing resources acquired during the test class lifecycle.
     
    4) @AfterEach
    	Executed after each individual test method.
       Used for cleaning up resources or performing post-test actions.
    	
      
# Note Problem using @BeforeAll and how to solve that :
										If you want to use @beforeAll annotation on a method it will throw an error because it run before the junit class initialization that's why it throw error. to solve this problem, make the method as static.
										
#Change the default behavior of creating instance
			Put the annotation @TestInstance(TestInstance.Lifecycle.PER_CLASS) 
		Note: 1) the default behavior is per_method 
				2) if you want to run any method before all/ everything , before per_class life cycle we forced to make method as static but by using life cycle per_class we do not need to make method static even if we want to run it before everything.
				
#Some @annotations 
	1) @DisplayName : if we want to give name to test case we use @DisplayName annotations. @DisplayName("Add two numbers").
	
	2) @Disabled    : if a method is causing any issue or we want to do not run a method we use @Disabled annotation. 
	
	3) @EnabledOnOs : if we want to run a test case on a specific machine we use @@EnabledOnOs annotations.
	
	4) @EnabledOnJre(JRE.JAVA_11) : if we wan to run on specific resource, we use @EnabledOnJre(JRE.JAVA_11) annotations.
	
	5) @EnabledIf :These annotations allow you to enable or disable tests based on custom conditions expressed using SpEL (Spring 					    				     Expression Language) expressions.i.e @EnabledIf("'production'.equals(systemEnvironment['ENVIRONMENT'])")
	
	6) @EnabledIfSystemProperty / @DisabledIfSystemProperty: These annotations enable or disable tests based on the presence or value of a 																		  													                  system property. @EnabledIfSystemProperty(named = "env", matches = "prod") 								     																			/@DisabledIfSystemProperty(named = "env", matches = "dev")
	7) Assumptions.assumeTrue(System.getProperty("os.name").toLowerCase().contains("mac"))
									-->  if an assumption fails, the test is marked as "skipped" rather than failing, because the assumption 	 represents a condition under which the test should be executed. If the assumption is not met, the test is not relevant and is therefore skipped.
		
		
										