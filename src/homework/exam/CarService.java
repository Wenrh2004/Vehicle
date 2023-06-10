package homework.exam;


import java.util.InputMismatchException;
import java.util.Scanner;


public class CarService {
    public void rentCar() {
        System.out.println("**********欢迎光临秋名山守望者汽车租赁公司**********");
        Scanner sc = new Scanner(System.in);
        int type = 0;
        boolean isTypeValid = false;
        while (!isTypeValid) {
            System.out.println("请选择您要租赁的车型：");
            System.out.println("1. 轿车");
            System.out.println("2. 客车");
            System.out.print("请输入您的选择（数字）：");
            try {
                type = sc.nextInt();
                isTypeValid = true;
            } catch (InputMismatchException e) {
                System.out.println("您的输入有误，请输入数字！");
                sc.nextLine();  // 清空错误输入
            }
        }

        CarRent carRent = new CarRent();    //创建车库对象
        Cars[] cars = carRent.carMake();    //拿到轿车数组对象
        Cars car = null;
        Bus[] buses = carRent.busMake();    //拿到客车数组对象
        Bus bus = null;

        switch (type) {
            case 1:
                int brand = 0;
                boolean isBrandValid = false;
                while (!isBrandValid) {
                    System.out.println("请选择您要租赁的轿车品牌：");
                    System.out.println("1. 别克");
                    System.out.println("2. 宝马");
                    System.out.print("请输入您的选择（数字）：");
                    try {
                        brand = sc.nextInt();
                        isBrandValid = true;
                    } catch (InputMismatchException e) {
                        System.out.println("您的输入有误，请输入数字！");
                        sc.nextLine();  // 清空错误输入
                    }
                }

                String carType = "";
                boolean isCarTypeValid = false;
                while (!isCarTypeValid) {
                    if (brand == 1) {
                        System.out.println("请选择您要租赁的别克轿车型号：");
                        System.out.println("1. 林荫大道");
                        System.out.println("2. GL8");
                    } else if (brand == 2) {
                        System.out.println("请选择您要租赁的宝马轿车型号：");
                        System.out.println("1. X6");
                        System.out.println("2. 550i");
                    }

                    System.out.print("请输入您的选择（数字）：");
                    try {
                        int carTypeNo = sc.nextInt();
                        switch (brand) {
                            case 1:
                                carType = (carTypeNo == 1) ? "林荫大道" : "GL8";
                                break;
                            case 2:
                                carType = (carTypeNo == 1) ? "X6" : "550i";
                                break;
                        }

                        for (Cars c : cars) {
                            if (c.getType().equals(carType)) {
                                car = c;
                                isCarTypeValid = true;
                                break;
                            }
                        }

                        if (!isCarTypeValid) {
                            System.out.println("您的选择有误，请重新输入!");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("您的输入有误，请输入数字！");
                        sc.nextLine();  // 清空错误输入
                    }
                }

                break;
            case 2:
                int busBrand = 0;
                boolean isBusBrandValid = false;
                while (!isBusBrandValid) {
                    System.out.println("请选择您要租赁的客车型号：");
                    System.out.println("1. 小巴");
                    System.out.println("2. 大巴");
                    System.out.print("请输入您的选择（数字）：");
                    try {
                        busBrand = sc.nextInt();
                        isBusBrandValid = true;
                    } catch (InputMismatchException e) {
                        System.out.println("您的输入有误，请输入数字！");
                        sc.nextLine(); //  清空错误输入
                    }
                }

                String busType = "";
                boolean isBusTypeValid = false;
                while (!isBusTypeValid){
                    if (busBrand == 1) {
                        System.out.println("请选择您要租赁的小巴品牌：");
                        System.out.println("1.金杯");
                        System.out.println("2.金龙");
                    } else if (busBrand == 2) {
                        System.out.println("请选择您要租赁的大巴品牌：");
                        System.out.println("1.金杯");
                        System.out.println("2.金龙");
                    }

                    System.out.println("请输入您的选择(数字):");
                    try {
                        int busTypeNo = sc.nextInt();
                        switch (busBrand) {
                            case 1:
                                busType = (busTypeNo == 1) ? "金杯" : "金龙";
                                break;
                            case 2:
                                busType = (busTypeNo == 2) ? "金杯" : "金龙";
                                break;
                        }

                        for (Bus b : buses) {
                            if (b.getType().equals(busType)){
                                bus = b;
                                isBusTypeValid = true;
                                break;
                            }
                        }

                        if (!isBusTypeValid) {
                            System.out.println("您的选择有误，请重新输入！");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("您的输入有误，请输入数字！");
                        sc.nextLine();  // 清空错误输入
                    }
                }
                break;
            default:
                System.out.println("您的选择有误，请输入1或2！");
                break;
        }

        if (car != null) {
            System.out.println("您选择的是：" + car.getBrand() + car.getType() + car.getNum());
            int days = 0;
            boolean isDaysValid = false;
            while (!isDaysValid) {
                System.out.print("请输入租车天数：");
                try {
                    days = sc.nextInt();
                    isDaysValid = true;
                } catch (InputMismatchException e) {
                    System.out.println("您的输入有误，请输入数字！");
                    sc.nextLine();  // 清空错误输入
                }
            }
            double rent = car.getRent() * days;
            System.out.println("共租借了" + days + "天，租金是" + rent + "元");
            pay(rent);
        } else if (bus != null) {
            System.out.println("您选择的是：" + bus.getType() + bus.getBrand() + bus.getNum());
            int headcount = 0;
            boolean isHeadcountValid = false;
            while (!isHeadcountValid) {
                System.out.print("请输入租借天数：");
                try {
                    headcount = sc.nextInt();
                    isHeadcountValid = true;
                } catch (InputMismatchException e) {
                    System.out.println("您的输入有误，请输入数字！");
                    sc.nextLine();  // 清空错误输入
                }
            }
            double rent = bus.getRent() * headcount;
            System.out.println("共租借了 " + headcount + " 天，租金是 " + rent + " 元");
            pay(rent);
        }
    }

    private static void pay(double rent) {
        System.out.println("请您付款！！！");
    }
}