//Correct nine classes: Worker (employee), Clerk (clerk), IT (IT specialist), Programmer (programmer),
// ProjectManager (project manager), CTO (CTO), HR (recruiter), OfficeManager (office manager), Cleaner (cleaner).
//        Inherit a programmer, project manager and technical director from an IT specialist.
//        Inherit the recruiter, cleaner and office manager from the clerk.
//        Inherit the clerk and IT professional from the employee.
//
//    public class Worker // -->>                       ||||||
//    public class Clerk  // -->>: <- Worker            ||||||
//    public class IT // --->>: <- Worker               ||||||
//    public class Programmer: <- IT                    ||||||
//    public class ProjectManager: <- IT                ||||||
//    public class CTO : <- IT                          ||||||
//    public class OfficeManager: -> Clerc              ||||||
//    public class HR: -> Clerc                         ||||||
//    public class Cleaner: -> Clerc                    ||||||

package com.less4Task4Package;

public class Main {

    public static void main(String[] args) {
        Worker employee = new Worker();

        System.out.println();
        Clerk clerk = new Clerk();

        System.out.println();
        IT itSpecialist = new IT();

        System.out.println();
        Programmer programmer = new Programmer();

        System.out.println();
        ProjectManager projectManager = new ProjectManager();

        System.out.println();
        CTO cto = new CTO();

        System.out.println();
        OfficeManager officeManager = new OfficeManager();

        System.out.println();
        HR recruiter = new HR();

        System.out.println();
        Cleaner cleaner = new Cleaner();

    }
}
