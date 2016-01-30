package groovy_test;
/**
 * Created by amosli on 14-9-14.
 */
class Song {

    //动态类型，在赋值的时候再决定变量的类型
    def name;
    def artist;
    def genre

    String toString(){
        //便捷根据变量构造字符串方式
        "${name}, ${artist}, ${genre}"
    }

    def getArtist(){
        //符号?可以避免空指针，等于java的if(artist!=null)
        artist?.toUpperCase();
    }

}
