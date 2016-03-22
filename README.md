Outdoor Gear factory method pattern
===================================

An implementation of the factory method pattern as applied to building a set of outdoor equipment.  There are two abstract classes, Gear and WildernessKit.  Gear is the abstract product and is subclassed to create concrete product classes.  WildernessKit is the abstract creator and is subclassed to create concrete creator classes.  Each concrete creator has a createGear() method which instantiates the specific concrete gear products.  This places the creation of concrete objects in this method, thereby isolating the dependencies.  This is basic practice with the factory method pattern.



![UML diagram of project](https://github.com/cugamer/dp_factory_method_outdoor_gear/blob/master/dp_factory_method_outdoor_gear/dp_factory_method_pattern_outdoor_gear.png)
