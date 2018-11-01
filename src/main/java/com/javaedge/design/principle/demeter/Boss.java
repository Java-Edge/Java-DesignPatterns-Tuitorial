package com.javaedge.design.principle.demeter;


/**
 * Created by JavaEdge
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
