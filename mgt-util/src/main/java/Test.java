import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by wjian17 on 2019/8/26.
 */
public class Test {


    public static void main(String[] args) throws Exception {


        String str = "50000.00|0.00|35662.20|0.00|0.00";
        String[] arr = str.split("\\|");
        for (String string : arr) {
            System.out.println("string="+string);
        }

        System.out.println("中国".replaceAll("[\u4e00-\u9fa5]","aa").length());
        System.out.println("ad十点多 ".replaceAll("[\u4e00-\u9fa5]","aa").length());
        System.out.println("阿斯蒂芬".replaceAll("[\u4e00-\u9fa5]","aa").length());
        System.out.println("爱迪生".replaceAll("[\u4e00-\u9fa5]","aa").length());


        System.out.println(new Test().TestB("066602","20010827","20090826"));
        System.out.println(new Test().TestB("066602","20010825","20090826"));
        System.out.println(new Test().TestB("066602","20010826", "20090826"));
        System.out.println(new Test().TestB("060404","20010827","20090826"));
        System.out.println(new Test().TestB("060404","20010825","20090826"));
        System.out.println(new Test().TestB("060404","20010826", "20090826"));
        System.out.println(new Test().TestB("060405","20010827","20090826"));
        System.out.println(new Test().TestB("060405","20010825","20090826"));
        System.out.println(new Test().TestB("060405","20010826", "20090826"));
    }


    public String TestB(String proNo, String mainBirth, String byBirth) throws Exception {


        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");


        Date date = new SimpleDateFormat("yyyyMMdd").parse("20190826");


        try {

            Date mainBirthday = null;

            if (mainBirth != null && !"".equals(mainBirth)) {
                mainBirthday = sf.parse(mainBirth);
            }

            Date byBirthday = sf.parse(byBirth);

            Calendar ca = Calendar.getInstance();

            if (proNo.equals("060404")) {//交通险赠险

                ca.setTime(date);//设置起时间
                ca.add(Calendar.DATE, 1);//增加一天
                //ca.add(Calendar.YEAR, 1);//增加一年
                ca.add(Calendar.DATE, 364);


                ca.setTime(byBirthday);//设置起时间
                long days = (date.getTime() - ca.getTime().getTime()) / (1000 * 3600 * 24);

                ca.add(Calendar.YEAR, 86);

                long year = date.getTime() - ca.getTime().getTime();
                if (days >= 30 && year < 0) {
                    return "1";
                } else {
                    return "2";
                }


            } else if (proNo.equals("060405")) {//交通险


                ca.setTime(byBirthday);//设置起时间
                long byDays=(date.getTime()-ca.getTime().getTime())/(1000*3600*24);

                ca.add(Calendar.YEAR, 85);

                long byYear=date.getTime()-ca.getTime().getTime();


                ca.setTime(mainBirthday);//设置起时间

                ca.add(Calendar.YEAR, 18);

                long mainYear=date.getTime()-ca.getTime().getTime();

                if(byDays>=30&&byYear<=0&&mainYear>=0){
                    return "1";
                }else if(byDays<30||byYear>0){
                    return "2";
                }else if(mainYear<0){
                    return "3";
                }else{
                    return "4";
                }


            } else if (proNo.equals("066602")) {
                ca.setTime(byBirthday);//设置起时间
                long byDays = date.getTime() - ca.getTime().getTime();

                ca.add(Calendar.YEAR, 81);//包含80周岁

                long byYear = date.getTime() - ca.getTime().getTime();


                ca.setTime(mainBirthday);//设置起时间

                ca.add(Calendar.YEAR, 18);

                long mainYear = date.getTime() - ca.getTime().getTime();

                if (byDays >= 0 && byYear < 0 && mainYear >= 0) {
                    return "1";
                } else if (byDays < 0 || byYear >= 0) {
                    return "2";
                } else if (mainYear < 0) {
                    return "3";
                } else {
                    return "4";
                }
            } else {
                return "0";
            }


        } catch (Exception e) {
            return "-1";
        }

        //return "0";
    }
}