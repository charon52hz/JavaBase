package BuilderPattern;

/**
 * 将客户端与包含多个组成部分（或部件）的复杂对象的创建过程分离，
 * 客户端无须知道复杂对象的内部组成部分与装配方式，只需要知道所需建造者的类型即可。
 *
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 *
 * 角色：
 * 抽象建造者：为创建一个产品Product对象的各个部件指定抽象接口，在该接口中一般声明两类方法，
 * 一类方法是buildPartX()，它们用于创建复杂对象的各个部件；另一类方法是getResult()，它们用于返回复杂对象。
 *
 * 具体建造者：它实现了Builder接口，实现各个部件的具体构造和装配方法，
 * 定义并明确它所创建的复杂对象，也可以提供一个方法返回创建好的复杂产品对象
 *
 * 产品：是被构建的复杂对象，包含多个组成部件，具体建造者创建该产品的内部表示并定义它的装配过程。
 *
 * 指挥者：它负责安排复杂对象的建造次序，指挥者与抽象建造者之间存在关联关系，
 * 可以在其construct()建造方法中调用建造者对象的部件构造与装配方法，完成复杂对象的建造。
 * 客户端一般只需要与指挥者进行交互，在客户端确定具体建造者的类型，并实例化具体建造者对象（也可以通过配置文件和反射机制），
 * 然后通过指挥者类的构造函数或者Setter方法将该对象传入指挥者类中。
 */
public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getResult(){
        return product;
    }
}
