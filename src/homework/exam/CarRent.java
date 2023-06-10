package homework.exam;

public class CarRent {

    //创建汽车数组，将汽车的信息放在数组中
    public Cars[] carMake(){
        Cars c1 = new Cars("京NY28588", "宝马", 800, "x6");
        Cars c2 = new Cars("京CNY3284", "宝马", 600, "550i");
        Cars c3 = new Cars("京NT37465", "别克", 300, "林荫大道");
        Cars c4 = new Cars("京NT96928", "别克", 600, "GL8");
        Cars[] arr1 ={c1,c2,c3,c4};
        return arr1;
    }
    //创建客车数组，将汽车的信息放在数组中
    public Bus[] busMake(){
        Bus b1 = new Bus("京6566754", "小巴", 800, "16座","金杯");
        Bus b2 = new Bus("京8696667", "小巴", 800, "16座", "金龙");
        Bus b3 = new Bus("京9696996", "大巴", 1500, "34座", "金杯");
        Bus b4 = new Bus("京8696998", "大巴", 1500, "34座", "金龙");
        Bus[] arr2={b1,b2,b3,b4};
        return arr2;
    }
}