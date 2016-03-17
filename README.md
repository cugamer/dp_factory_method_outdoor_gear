Outdoor Gear factory method pattern
===================================

An implementation of the factory method pattern as applied to building a set of outdoor equipment.  There are two abstract classes, Gear and WildernessKit.  Gear is the abstract product and is subclassed to create concrete product classes.  Wilderness is the abstract creator and is subclassed to create concrete creator classes.  Each concrete creator has a createGear() method which instantiates the specific concrete gear products.  This places the creation of concrete objects in this method, thereby isolating the dependencies.  This is basic practice with the factory method pattern.
