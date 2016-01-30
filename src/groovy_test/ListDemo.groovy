package groovy_test;
/**
 * Created by amosli on 14-9-14.
 */
class ListDemo {
    static void main(args) {

        //range
        def range = 0..4;
        println(range.class);//class groovy.lang.IntRange
        assert range instanceof List;

        //groovy形式Collection
        //Collection
        def personGroovy = ["name", "age", "address"];
        println(personGroovy.class);//class java.util.ArrayList
        assert personGroovy instanceof Collection;
        assert personGroovy instanceof ArrayList;

        //java形式Collection
        Collection<String> personJava = new ArrayList<String>();
        personJava.add("name");
        personJava.add("age");
        personJava.add("address");
        println(personJava.class);//class java.util.ArrayList

        //java形式add element
        personJava.add("hobby");
        //groovy形式add element
        personJava << "gender";
        personJava[5] = "country";

        assert personJava[1] == "age";

        //Map java
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "Andy");
        map.put("VPN-#", "45");
        map.put("", 11)

        //Map groovy
        def hash = [name: "Andy", "VPN-#": 45]// name自动转换成字符串
        assert hash.getClass() == java.util.LinkedHashMap;
        hash.put("id", 23)
        assert hash.get("name") == "Andy"
        hash.dob = "01/29/76"
        assert hash.dob == "01/29/76"

        //Iterator
        def acoll = ["Groovy", "Java", "Ruby"]

        for (Iterator iter = acoll.iterator(); iter.hasNext();) {
            println iter.next()
        }

        acoll = ["Groovy", "Java", "Ruby"];

        acoll.each { println it }
        acoll.each {value->println "collection指定参数迭代${value}"}
        hash.each {key,value->println "map迭代：${key},${value}"}


    }
}
