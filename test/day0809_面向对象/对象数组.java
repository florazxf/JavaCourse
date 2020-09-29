/*
定义Student类，包含三个属性 学号、年级、分数
创建20个学生，学号是1到20，年级和分数都是随机数决定
问题一：打印3年级的学生信息
问题二：使用冒泡排序成绩，遍历所有学生信息
*/

public class StudentTest{
    public static void main(String[] args){

        Student[] students = new Student[20]; //数组的值还是null
        for(int i=0;i<20;i++){
            //给数组元素赋值
            students[i] = new Student();
            //给Student的属性赋值
            students[i].number = i+1;
            students[i].state = (int)(Math.random()*6+1); //年级[1,6]
            students[i].score = (int)(Math.random()*101);//成绩[0,100]
            //打印3年级的学生信息
            if(students[i].state==3){
                System.out.println(students[i].printInfo());
            }

        }
        System.out.println("****************");
        //使用冒泡排序按学生成绩排序
        for(int i=0;i<19;i++){
            for(int j=0;j<19-i;j++){
                if(students[j+1].score<students[j].score){
                    Student tmp = students[j];
                    students[j] = students[j+1];
                    students[j+1] =tmp;

                }
            }
        }

        for(int i=0;i<20;i++){
            System.out.println(students[i].printInfo());
        }


    }
}


 class Student {
    int number;
    int state;
    int score;

    public String printInfo(){
        //System.out.println("学号："+number+" 年级："+state+" 分数："+score);
        return "学号："+number+" 年级："+state+" 分数："+score;
    }


}


//老师的改进： 把StudentTest的那些都弄成方法


public class StudentTest{
    public static void main(String[] args){

        Student[] students = new Student[20]; //数组的值还是null
        for(int i=0;i<20;i++){
            //给数组元素赋值
            students[i] = new Student();
            //给Student的属性赋值
            students[i].number = i+1;
            students[i].state = (int)(Math.random()*6+1); //年级[1,6]
            students[i].score = (int)(Math.random()*101);//成绩[0,100]
        }

        StudentTest test = new StudentTest();
        test.SearchSate(students,3);
        System.out.println("****************");
        test.sort(students);
        test.print(students);
    }

    /**
     * 遍历Student 数组
     * @param students
     */
    public void print(Student[] students){
        for(int i=0;i<20;i++){
            System.out.println(students[i].printInfo());
        }

    }

    /**
     * 打印3年级的学生信息
     * @param students
     * @param state
     */
    public void SearchSate(Student[] students,int state){
        for(int i=0;i<20;i++){
            if(students[i].state==3){
                System.out.println(students[i].printInfo());
            }

        }

    }

    /**
     * 使用冒泡排序按学生成绩排序
     * @param students
     */
    public void sort(Student[] students){
        for(int i=0;i<19;i++){
            for(int j=0;j<19-i;j++){
                if(students[j+1].score<students[j].score){
                    Student tmp = students[j];
                    students[j] = students[j+1];
                    students[j+1] =tmp;

                }
            }
        }

    }
}


 class Student {
    int number;
    int state;
    int score;

    public String printInfo(){
        //System.out.println("学号："+number+" 年级："+state+" 分数："+score);
        return "学号："+number+" 年级："+state+" 分数："+score;
    }


}
