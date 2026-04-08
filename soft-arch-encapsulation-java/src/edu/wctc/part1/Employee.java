package edu.wctc.part1;

import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document Encapsulation Checklist if
 * needed.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private LocalDate orientationDate;

    public String getLastName() {
        if (lastName == null || lastName.isEmpty()) {
            lastName = "Bob";
            System.out.println("Name invalid: Set to Bob");
        }

        this.lastName = lastName;
    }

    public String getSsn() {
        if (snn == null || snn.Length() != 12) {
            snn = "123-45-678";
            System.out.println("Name invalid: Set to Bob");
        }

        this.snn = snn;
    }

    public String getFirstName() {
        if (firstName == null || firstName.isEmpty()) {
            firstName = "Bob";
            System.out.println("Name invalid: Set to Bob");
        }

        this.firstName = firstName;

    }

    public LocalDate getOrientationDate() {
        return orientationDate;
    }

    public String getCubeId() {
        return cubeId;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }


    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;

    }
}
