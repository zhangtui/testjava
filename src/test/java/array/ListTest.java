package array;

import domain.Person;
import domain.Teacher;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by 张瑞 on 2019/3/6.
 */
public class ListTest {
    @Test
    public void test1() {
        List<String> list = new ArrayList();
        list.add("小象");
        list.add("细白");
        list.add("rabbit");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //for(引用类型 变量：集合的实例引用)
        for (String s : list) {
            System.out.println(s);
        }
        //这里面的l等级上面的foreach循环里面的s是一样的
        //区别只在于这里的l不用必须指定类型
        //普通类型可以这样使用
        list.forEach(l -> System.out.println(l));

//        List list1 = new LinkedList();
//        list1.add("小a");

        Person person = new Person();
        person.setName("list");

        List<Person> list1 = new ArrayList();
        list1.add(person);
        for (Person p : list1) {
            System.out.println(p.getName());
        }
        for (int i = 0; i < list1.size(); i++) {
            Person p = list1.get(i);
            System.out.println(p.getName());
        }
        //复杂类型需要再后面添加一个{}来实现
        list1.forEach(p -> {
            System.out.println(p.getName());
        });
    }
    @Test
    public void setTest(){
        Person person = new Person();
        person.setName("list");

        Set<Person> set = new HashSet();
        set.add(person);
        //set 遍历循环 要拿到一个迭代器去循环
        Iterator iterator = set.iterator();
        //放一个条件的表达式，只有true的时候才会遍历
        //interator.hasNext()找个方法会返回来一个boolean类型
        //while 只有括号里面的表达式的条件为真时，才会继续循环
        while (iterator.hasNext()){
            //加上一个强制转换类型
            //强制转接的前提下是类型一致，否则抛出类型转换异常
            //运行时的类强制转换，所以编译的时候不会抛出异常
            //因为迭代器里面的next方法返回的是一个object类型的引用
            //
            Object o = iterator.next();
            Person p = (Person) o;
            System.out.println(p.getName());
        }
        //引用类型再new的时候要通过泛型类型指定类型
        set.forEach(p ->{
            System.out.println(p.getName());
        });

        Set set1 = new HashSet();
        set1.add("小象");
        set1.add("mery");
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


        set.forEach(s ->{
            System.out.println(s);
        });
    }
    @Test
    public void test2(){
        List  list = new ArrayList();
        //可以放基础类型 int long
        //引用类型  string person
        //当指定泛型类型后，那么代表找个list里面的内容就是字符串类型s
        //所以你才可以用foreach 和lambda表达式

        //Java所有的类就是object的子类
        list.add("sss");
        list.add("1");
        for(Object o:list){
            String s1 = (String) o;
            System.out.println(s1);
        }

        //List<Object>
        //你可以放任何类型进去，list后面跟上一个<E>，那么就这个就是一个泛型
        //泛型的意思就是你可以指定一个类型放到list里面
        Set<Integer> set = new HashSet();
//        set.add("a");

    }
    @Test
    public  void filterTest(){
        List<String> list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");


        for(String s:list){
            if(null !=s && !"b".equals(s)){
                System.out.println(s);
            }
        }
        //再这里可以写一个表达式，反水boolean类型
        list.stream().filter(s ->!"b".equals(s))
                .forEach(s -> System.out.println(s));


        //对象类型
        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        person.setName("阳阳");
        person.setAge(18);
        personList.add(person);


        Person person1 = new Person();
        person1.setName("zhangrui");
        person1.setAge(20);
        personList.add(person1);

//        personList.stream().filter(p -> !p.getName().equals("阳阳"))
//                .forEach(p -> {
//                    System.out.println(p.getAge());
//                });
        //已经过滤掉name 等于阳阳的对象了
        //假如只想通过过滤不输出的话，list里面依旧是以前的数据，那么需要通过过滤转接到另外一个list接收，达到后续的应用

        List list2 = personList.stream().filter(p ->p.getName().equals("阳阳"))
                .collect(Collectors.toList());
        System.out.println(list2.size());
        //上下的代码形式是一个内容
        List list1 = new ArrayList();
        for(Person p:personList){
            if(!p.getName().equals("阳阳")){
                list1.add(p);
            }
        }

        List<Map> mapList = new ArrayList<>();
        Map map = new HashMap();
        map.put("name","阳阳");
        map.put("age",25);
        mapList.add(map);

        mapList.stream().filter(m ->m.get("name").equals("阳阳"))
                .forEach(m -> {
                    System.out.println(m.get("age"));
                });

    }
    @Test
    public void lambdaMapTest(){
        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        person.setName("阳阳");
        person.setAge(18);
        personList.add(person);
        Person person1 = new Person();
        person1.setName("zhangrui");
        person1.setAge(20);
        personList.add(person1);
        //把两个人的年龄，放到一个list里面
        List list1 = new ArrayList();
        for(Person person2:personList){
            list1.add(person2.getAge());
        }
        //新的写法
        //引用类型：： 方法
        List list2 = personList.stream().map(Person::getName).collect(Collectors.toList());
        //把两个人的年龄加再一起
        int totalAge = personList.stream().mapToInt(Person::getAge).sum();
        System.out.println(totalAge);
    }
    @Test
    public void distinctTest(){
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("a");
        stringList.stream().distinct().forEach(s -> System.out.println(s));


        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        person.setName("zhangrui");
        person.setAge(20);
        personList.add(person);
        Person person1 = new Person();
        person1.setName("zhangrui");
        person1.setAge(20);
        personList.add(person1);
        personList.stream().distinct().forEach(p ->{
            System.out.println(p.getName());
        }
        );
        //去重还是两个，针对于对象的去重需要重写hashcode

        //原始的排序方法
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        //1.8后
        personList.sort((Person p1,Person p2) ->p1.getName().compareTo(p2.getName()));
    }
    @Test
    public void sortTest(){
        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        person.setName("c");
        person.setAge(29);
        personList.add(person);
        Person person1 = new Person();
        person1.setName("a");
        person1.setAge(25);
        personList.add(person1);
        Person person2 = new Person();
        person2.setName("b");
        person2.setAge(30);
        personList.add(person2);
//        personList.forEach(p -> {
//            System.out.println(p.getName());
//        });


//        //原始的排序方法
//        Collections.sort(personList, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        personList.forEach(p -> {
//            System.out.println(p.getName());
//        });
        //1.8后
//        personList.sort((Person p1,Person p2) ->p1.getName().compareTo(p2.getName()));
        //使用流的方式去排序
        personList.stream().sorted(Comparator.comparing(Person::getAge).reversed()).forEach(p -> {
            System.out.println(p.getName());
        });
        //使用留排序需要返回一个重新的留,两个不同的list reversed是倒序
        List<Person> list = personList.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());

        list.forEach(l -> {
            System.out.println(l.getName());
        });

    }
    @Test
    public  void mapTest(){
        Map<String,Person> map = new HashMap<>();
        Person person = new Person();
        person.setName("test");
        map.put("test",person);
        Person person1 = new Person();
        person1.setName("test1");
        map.put("test",person1);
        //如果不知道key的时候，想要拿name等于test的这个对象
        Person person2 = map.get("test");

        map.forEach((k,v) ->{
            if(v.getName().equals("test")){
                System.out.println(v.getName());
            }
        });

    }
    @Test
    public void teacherTest(){
        String name = this.getNameByCourse("数");
        Assert.assertEquals("老师名字的校验","小9",name);

    }
    public String getNameByCourse(String Course){
        //创建一个map把老师放到里面
        Map<String, Teacher> teacherMap = new HashMap<>();
        Teacher teacher = new Teacher();
        teacher.setName("小李");
        teacher.setSex("男");
        teacher.setCourse("java");
        teacherMap.put("小李",teacher);

        Teacher teacher2 = new Teacher();
        teacher2.setName("小王");
        teacher2.setSex("女");
        teacher2.setCourse("python");
        teacherMap.put("小王",teacher2);

        Teacher teacher3 = new Teacher();
        teacher3.setName("小赵");
        teacher3.setSex("女");
        teacher3.setCourse("数学");
        teacherMap.put("xiaozhao",teacher3);

        final String[] name = new String[1];
        //遍历循环这个map，对里面的值做判断，如果里面老师的课程字段的值等于方法传入的参数，那么返回这个老师的名字
        teacherMap.forEach((k,v) ->{
            if(v.getCourse().equals(Course)){
                name[0] = v.getName();
            }
        });
        //对key的遍历,以往的写法
        for(String key:teacherMap.keySet()){
            Teacher teacher1 = teacherMap.get(key);
            if(teacher1.getCourse().equals(Course)){
                return teacher1.getName();
            }
        }

        return name[0];

    }
}









