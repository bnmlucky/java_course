package chapter12;

public class Collections {
    /*
    A collection is an object that holds references
    to other objects.  These are known as data structures.
    And the objects within the collection are known
    as elements.
    Java provides a collections framework, which
    consists of interfaces, classes and methods to store
    and manipulate aggregate data.
    Some collections allow duplicate elements, while
    others require every element to be unique.
    Some collections are ordered while others are not.
    All of the interfaces and classes for the collections framework
    can be found in the java.util package.
    Collections itself is an interface and is the root of the hierarchy.
    Java does not provide any direct implementations of the collections interface,
    but there are other interfaces, which inherit from collection.
    Some of the most common ones:
    Set
    Unordered unique elements - can't contain duplicates (a standard deck of 52 cards)
    A set is an interface, so it can't be instantiated, but it can be the object's type.
    Implementations: HashSet, linked hashSet, treeSet.  We can add duplicates without error, but
    they just won't be stored!
    List
    Ordered elements which can be accessed by position. Can contain duplicates. (phone numbers from your call history)
    Implementations:  ArrayList, LinkedList, StackList and Vector.  Lists are ordered, elements can be accessed by their position.

    Queue
    Ordered elements for processing.  Access in the order elements were added.
    (FIFO: first in - first out) (people in the checkout line at the supermarket)
    Elements are ordered: LinkedList, PriorityQueue.
    First element in the queue is known as the head.
    The last element of the queue is known as the tail.
    You can .peek() at the head of the queue.

    Map
    Unordered unique key-value pairs.  It's not a true collection,
    does not inherit from Collections interface. Holds key-value pairs.
    A list of bank transactions - id serves as Key, value is a transaction object.
    Keys are required to be unique, you can access an element by its key.
    The values are not unique - are not required to be.
    Implementations:  HashMap, TreeMap, LinkedHashMap.
    Has no access to .add(), as in other data structures.
    Instead of .add(), it has .put(), which takes 2 arguments:
    a key and a value.


     */
}
