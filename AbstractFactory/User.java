public class User {
    public static void main(String[] args){
        FurnitureFactory furnitureFactory = new VictorianFurnitureFactory();
        IChair chair = furnitureFactory.createChair();
        ISofa sofa = furnitureFactory.createSofa();
        ITable table = furnitureFactory.createTable();

        chair.funcForChair();
        sofa.funcForSofa();
        table.funcForTable();

    }
}
