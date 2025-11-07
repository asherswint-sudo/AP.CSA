package U3;
public class CondEx{
    public boolean isLeapYear(int year){
        if (year % 400 == 0)return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        else return false;
    }

    public boolean isSooner(int month1, int day1, int year1, int month2, int day2, int year2){
        if (year1 > year2) return false;
        if (year1 < year2) return true;
        if (year1 == year2){
            if (month1 > month2) return false;
            if (month1 < month2) return true;
            if (month1 == month2){
                if (day1 > day2) return false;
                if (day1 == day2) return false;
                else return true;
            }
        }
        return false;
    }

    public int findBestFit(int space, int size1, int size2){
        if (space >= size1+size2) return 3;
        if (size1 > space && size2 > space) return 0;
        if (size1 <= space && !(size2 <= space)) return 1;
        if (size2 <= space && !(size1 <= space)) return 2;
        if (size1 <= space && size2 <= space){
            if (size1==size2) return 1;
            if (size2 > size1) return 2;
            return 1;
        }
        
        return 55;

    }

    public boolean makeBenches(int small, int big, int goal){
        if (goal > small + big*5) return false;
        int maxBig = goal/5;
        if (maxBig < big) big = maxBig;
        if (maxBig*5 + small >= goal) return true;
        return false;
    }

    public String removeTag(String s, String tag){
        //make string y that is string s without tags
        if y.equals("<" + tag + ">" + s + "</" + tag + ">") return y;
        else
    }




public static void main(String[] args) {
    CondEx ce = new CondEx();
    // leap year
// System.out.println("2000 " + ce.isLeapYear(2000));
// System.out.println("2004 " + ce.isLeapYear(2004));
// System.out.println("2003 " + ce.isLeapYear(2003));
// System.out.println("2100 " + ce.isLeapYear(2100));

// // is sooner
// System.out.println("isSooner");
// System.out.println("1/2/2010 is sooner than 1/2/2011 " + ce.isSooner(1,2,2010, 1,2,2011));
// System.out.println("2/1/2011 is sooner than 2/2/2010 " + ce.isSooner(2,1,2011, 2,2,2010));
// System.out.println("1/2/2011 is sooner than 2/2/2010 " + ce.isSooner(1,2,2011, 2,2,2010));
// System.out.println("1/5/2010 is sooner than 3/2/2010 " + ce.isSooner(1,5,2010, 3,2,2010));
// System.out.println("3/2/2010 is sooner than 1/2/2010 " + ce.isSooner(3,2,2010, 1,2,2010));
// System.out.println("1/3/2010 is sooner than 1/2/2010 " + ce.isSooner(1,3,2010, 1,2,2010));
// System.out.println("5/2/2010 is sooner than 1/3/2011 " + ce.isSooner(5,2,2010, 1,3,2011));
// System.out.println("1/2/2010 is sooner than 1/2/2010 " + ce.isSooner(1,2,2010, 1,2,2010));
// System.out.println("4/8/2010 is sooner than 1/2/2010 " + ce.isSooner(4,8,2010, 1,2,2010));


// // // Best Fit
// System.out.println("Best Fit");
// System.out.println("Find Best fit 6 2 3 is " + ce.findBestFit(6,2,3));
// System.out.println("Find Best fit 6 4 3 is " + ce.findBestFit(6,4,3));
// System.out.println("Find Best fit 6 3 4 is " + ce.findBestFit(6,3,4));
// System.out.println("Find Best fit 1 2 3 is " + ce.findBestFit(1,2,3));
// System.out.println("Find Best fit 4 6 3 is " + ce.findBestFit(4,6,3));
// System.out.println("Find Best fit 4 3 6 is " + ce.findBestFit(4,3,6));
// System.out.println("Find Best fit 4 3 3 is " + ce.findBestFit(4,3,3));
// System.out.println("Find Best fit 4 4 3 is " + ce.findBestFit(4,4,3));


// // Make Bench
// System.out.println("Make benches 3 1 8 is " + ce.makeBenches(3,1,8));
// System.out.println("Make benches 3 1 9 is " + ce.makeBenches(3,1,9));
// System.out.println("Make benches 11 1 15 is " + ce.makeBenches(11,1,15));
// System.out.println("Make benches 4 2 15 is " + ce.makeBenches(4,2,15));
// System.out.println("Make benches 20 0 20 is " + ce.makeBenches(20,0,20));
// System.out.println("Make benches 3 4 20 is " + ce.makeBenches(3,4,20));
// System.out.println("Make benches 0 6 30 is " + ce.makeBenches(0,6,30));
// System.out.println("Make benches 0 5 30 is " + ce.makeBenches(0,5,30));
// System.out.println("Make benches 2 6 23 is " + ce.makeBenches(2,6,23));
// System.out.println("Make benches 3 2 23 is " + ce.makeBenches(3,2,23));

System.out.println("\nremoveTag");
System.out.println(ce.removeTag("<b>Hello World</b>", "b")); // Hello World
System.out.println(ce.removeTag("<b>Hello World</b>", "head")); // <b>Hello World</b>
System.out.println(ce.removeTag("Hello World</b>", "b")); // Hello World</b>
System.out.println(ce.removeTag("<b>Hello World", "b")); // <b>Hello World
System.out.println(ce.removeTag("</img>Hello World<img>", "img")); // </img>Hello World<img>
System.out.println(ce.removeTag("Happy Birthday <b>Hello World</b>", "b"));
System.out.println(ce.removeTag("<title>Hello World</title> Happy Birthday","title"));
System.out.println(ce.removeTag("Happy <b>Hello World</b> Birthday", "b"));
}
}