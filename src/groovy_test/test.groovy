package groovy_test;

print "dd";
println();

def list1=["1", "2"];
list1.each { println "list1.each:"+it; }

list1.join(",").each { println "list1.join(\",\"):"+it; }


println "list1[1]:"+list1[1];

