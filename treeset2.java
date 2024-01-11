    package CollectionsFramework;

    import java.util.Iterator;
    import java.util.List;
    import java.util.Set;
    import java.util.TreeSet;
    class Student56 implements Comparable<Student56>{
        int id;
        String name;
        int age;
        double marks;

        Student56(int id,String name,int age,double marks){
            this.id=id;
            this.name=name;
            this.age=age;
            this.marks=marks;
        }

        @Override
        public int compareTo(Student56 s) {
            if(id>s.id){
                return 1;
            }
           else if(id<s.id){
            return -1;
            }
           else
               return 0;

    }
    }

    public class treeset2 {
        public static void main(String[] args) {
            Student56 s1 = new Student56(4, "vikram", 23, 30000);
            Student56 s2 = new Student56(7, "vikas", 22, 20000);
            Student56 s3 = new Student56(1, "vikram", 21, 24000);

            // TreeSet<Character> t=new TreeSet<>(Set.of('E','R','Y','Q','I'));
            TreeSet<Student56> t1 = new TreeSet<>(Set.of(s1, s2, s3));

//            Iterator<Character> d=t.descendingIterator();
//            while (d.hasNext()){
//                System.out.println(d.next());
//            }
            Iterator<Student56> it = t1.iterator();
            while (it.hasNext()) {
                Student56 s = it.next();
                System.out.println(s.id+":"+s.name + ":" + s.age + ":" + s.marks);
            }


        }

    }
