package groovy_test
/** 
 * @author sfit1014
 * 创建时间： 2016年1月29日
 */
class User {
    def name;
    def password
    String toString() {
        "${name},${password}"
    };

    static void main(String[] arg){
        println "hello user";
        println new User().toString();
        println new User(name:"xiaoli").toString();
        println new User(name:"xiaoli",password:"1234").toString();
    }
}

