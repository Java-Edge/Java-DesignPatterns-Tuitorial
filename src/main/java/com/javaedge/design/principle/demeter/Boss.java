package com.javaedge.design.principle.demeter;


/**
 * Created by Learner
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
