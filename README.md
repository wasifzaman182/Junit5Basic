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
										