package com.yilu.demo1_1;

public class test {
    public static void main(String[] args) {

        Triangle tr1 = new Triangle(3.0, 4.0, 5.0);
        Triangle tr2 = new Triangle(1.0, 1.0, 2.0);

        try {
            System.out.println("三条边长度分别为" + tr1.getLen1() + "、" + tr1.getLen2() + "、" + tr1.getLen3() + "三角形的面积为" + area(tr1));
            System.out.println("三条边长度分别为" + tr2.getLen1() + "、" + tr2.getLen2() + "、" + tr2.getLen3() + "三角形的面积为" + area(tr2));

        } catch (NotTriangle e) {
            e.printStackTrace();
        }
    }

    private static double area(Triangle triangle) {
        double len1 = triangle.getLen1();
        double len2 = triangle.getLen2();
        double len3 = triangle.getLen3();
        if (!(len1 > 0 && len2 > 0 && len3 > 0 && (len1 + len2 > len3))) {
            throw new NotTriangle("长度数据" + len1 + "," + len2 + "," + len3 + "异常");
        }
        double p = (len1 + len2 + len3) / 2;
        return Math.sqrt(p * (p - len1) * (p - len2) * (p - len3));
    }
}