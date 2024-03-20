public class AgeProblem {

    public static void main(String[] args) {
        // 定义老师和学生的年龄变量
        int teacher = 0;
        int student = 0;
        // 定义年龄差常量
        final int ageDiff = (35 - teacher) / 2;
        // 定义一个标志变量，表示是否找到符合条件的年龄
        boolean found = false;
        // 用一个循环，从 0 开始，每次增加 1，直到找到满足条件的年龄
        for (int i = 0; i <= 35; i++) {
            // 更新老师和学生的年龄
            teacher = i;
            student = i - ageDiff;
            // 判断是否满足条件
            if (teacher - student == ageDiff && 35 - student == ageDiff) {
                // 如果满足条件，设置标志变量为 true，并跳出循环
                found = true;
                break;
            }
        }
        // 根据标志变量，输出结果
        if (found) {
            // 如果找到符合条件的年龄，输出老师和学生的年龄
            System.out.println("老师的年龄是 " + teacher + " 岁，学生的年龄是 " + student + " 岁。");
        } else {
            // 如果没有找到符合条件的年龄，输出提示信息
            System.out.println("没有找到符合条件的年龄。");
        }
    }
}
