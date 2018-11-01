package com.javaedge.design.pattern.behavioral.iterator.demo1;

/**
 * @author JavaEdge
 * @date 2018/10/11
 */
public class Test {

    public static void main(String[] args) {
        Course course1 = new Course("Java课程");
        Course course2 = new Course("Python课程");
        Course course3 = new Course("前端课程");
        Course course4 = new Course("大数据课程");
        Course course5 = new Course(" AI课程");
        Course course6 = new Course("PHP课程");

        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("-----课程列表-----");
        printCourses(courseAggregate);
        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);
        System.out.println("-----删除操作之后的课程列表-----");
        printCourses(courseAggregate);
    }

    private static void printCourses(CourseAggregate courseAggregate) {
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()) {
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
