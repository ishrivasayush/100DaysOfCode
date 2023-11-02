package Week1.Types;

import java.util.Date;

public class ReferencedType {
    public static void main(String[] args) {
        byte age=35;
        Date now=new Date();
        System.out.println(now);
    }
}
/*
Primitives Type
int x=1;
int y=x;
x=2;
sout(y) -> 1

Reference Type
Point point1=new Point(1,1);
Point point2=point1;
point1.x=2;
sout(point2.x); -> 2
 */
