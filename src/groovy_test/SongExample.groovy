package groovy_test;
import org.junit.Test

/**
 * Created by amosli on 14-9-14.
 */
//如果不指定，任何方法，变量，类等都默认是public
class SongExample {
    static void main(args) {
        //不需要显式的写出构造函数
        //def 类似javascript的var
        def song = new Song(name:"love",artist:"ladyGaga",genre: "Pop")//默认不加分号;

        //简便的输出，等于System.out.println(song);
        println song
        def sng2 = new Song(name:"KungFuFighting", genre:"Disco")

        println sng2

        def sng3 = new Song()
        //除了构造函数方式以外的给变量赋值方式
        sng3.name = "Funkytown"
        sng3.artist = "Lipps Inc."
        sng3.setGenre("Disco")
        println sng3.toString()
        sng3.setGenre "ouchuquan"

        println sng3.toString()
        //打印属性
        println sng3.genre

        //便捷的断言
        assert sng3.getArtist() == "Lipps Inc."



    }

    //便捷的junit test
    @Test
    public void test(){

        def sng2 = new Song(name:"Kung Fu Fighting", genre:"Disco")

        println sng2.getArtist();
        println sng2.name;
        assert sng2.name == "Kung Fu Fighting"
    }

}
