Point.class: Point.java
	javac Point.java

Circle.class: Circle.java
	javac Circle.java

CircleTest.class: CircleTest.java
	javac CircleTest.java

clean:
	rm *.class

run:
	java CircleTest