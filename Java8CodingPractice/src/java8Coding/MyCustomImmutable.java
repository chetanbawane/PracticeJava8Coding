package java8Coding;

public class MyCustomImmutable {


	    // Private and final fields
	    private final String name;
	    private final int age;

	    // Constructor to initialize fields
	    public MyCustomImmutable(String name, int age) {
	        this.name = name;
	        this.age = age;
	
	    }

	    // Getter methods (no setters)
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }


	    // Override toString() for better object representation
	    @Override
	    public String toString() {
	        return "ImmutablePerson{name='" + name + "', age=" + age + "}";
	    }
	}


