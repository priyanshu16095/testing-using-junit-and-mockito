### Testing

By defining a Search interface, it decouples the search logic from its implementation.
Allow to use different search algorithms without changing the client code that depends on the interface.

The SearchClient class is a design pattern that follows the Dependency Injection principle. 

#### When to Use an Interface:

You should use an interface when you anticipate having multiple implementations or when you want to future-proof your code to allow flexibility.
