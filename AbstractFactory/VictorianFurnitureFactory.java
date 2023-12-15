public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public IChair createChair() {
        return new VictorianChair();
    }

    @Override
    public ISofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public ITable createTable() {
        return new VictorianTable();
    }
}
