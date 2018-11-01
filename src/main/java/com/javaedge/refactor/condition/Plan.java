package com.javaedge.refactor.condition;

import java.time.LocalDate;

/**
 * @author JavaEdge
 * @date 2022/4/2
 */
public class Plan {
    public LocalDate summerStart;
    public LocalDate summerEnd;
    public Long summerRate;

    public Long regularRate;
    public Long regularServiceCharge;

//    public int disabilityAmount(Employee anEmployee) {
//        if (anEmployee.seniority < 2) {
//            return 0;
//        }
//        if (anEmployee.monthsDisabled > 12) {
//            return 0;
//        }
//        if (anEmployee.isPartTime) {
//            return 0;
//        }
//        return 1;
//    }

//    /**
//     * compute the disability amount
//     */
//    public int disabilityAmount(Employee anEmployee) {
//        if ((anEmployee.seniority < 2) || (anEmployee.monthsDisabled > 12)) {
//            return 0;
//        }
//        if (anEmployee.isPartTime) {
//            return 0;
//        }
//        return 1;
//    }

//    public int disabilityAmount(Employee anEmployee) {
//        if ((anEmployee.seniority < 2) || (anEmployee.monthsDisabled > 12) || (anEmployee.isPartTime)) {
//            return 0;
//        }
//        return 1;
//    }
//
//    public int disabilityAmount(Employee anEmployee) {
//        if (isNotEligableForDisability(anEmployee)) {
//            return 0;
//        }
//        return 1;
//    }
//
//    public boolean isNotEligableForDisability(Employee anEmployee) {
//        return ((anEmployee.seniority < 2) || (anEmployee.monthsDisabled > 12) || (anEmployee.isPartTime));
//    }

    /**
     * 逻辑与
     */
    public double disabilityAmount(Employee anEmployee) {
        if ((anEmployee.onVacation) && (anEmployee.seniority > 10)) {
            return 1;
        }
        return 0.5;
    }

//    public Long payAmount(Employee employee) {
//        long result;
//        if (employee.isSeparated) {
//            result = 0;
//        } else {
//            if (employee.isRetired) {
//                result = 0;
//            } else {
//                // logic to compute amount
//                lorem.ipsum(dolor.sitAmet);
//                consectetur(adipiscing).elit();
//                sed.do.eiusmod = tempor.incididunt.ut(labore) && dolore(magna.aliqua);
//                ut.enim.ad(minim.veniam);
//                result = someFinalComputation();
//            }
//        } return result;
//    }

//    public Long payAmount(Employee employee) {
//        long result;
//        if (employee.isSeparated) {
//            result = 0;
//        }
//        if (employee.isRetired) {
//            result = 0;
//        } else { // logic to compute amount
//            lorem.ipsum(dolor.sitAmet);
//            consectetur(adipiscing).elit();
//            sed.do.eiusmod = tempor.incididunt.ut(labore) && dolore(magna.aliqua);
//            ut.enim.ad(minim.veniam);
//            result = someFinalComputation();
//        } return result;
//    }

//    public Long payAmount(Employee employee) {
//        long result;
//        if (employee.isSeparated) {
//            return 0l;
//        }
//        if (employee.isRetired) {
//            return 0l;
//        }
//
//        lorem.ipsum(dolor.sitAmet);
//        consectetur(adipiscing).elit();
//        sed. do.eiusmod = tempor.incididunt.ut(labore) && dolore(magna.aliqua);
//        ut.enim.ad(minim.veniam);
//        result = someFinalComputation();
//        return result;
//    }

//    public Long payAmount(Employee employee) {
//        if (employee.isSeparated) {
//            return 0l;
//        }
//        if (employee.isRetired) {
//            return 0l;
//        }
//        lorem.ipsum(dolor.sitAmet);
//        consectetur(adipiscing).elit();
//        sed. do.eiusmod = tempor.incididunt.ut(labore) && dolore(magna.aliqua);
//        ut.enim.ad(minim.veniam);
//        return someFinalComputation();
//    }

//    public int adjustedCapital(Instrument anInstrument) {
//        int result = 0;
//        if (anInstrument.capital > 0) {
//            if (anInstrument.interestRate > 0 && anInstrument.duration > 0) {
//                result = (anInstrument.income / anInstrument.duration) * anInstrument.adjustmentFactor;
//            }
//        }
//        return result;
//    }

//    public int adjustedCapital(Instrument anInstrument) {
//        int result = 0;
//        if (anInstrument.capital <= 0) {
//            return result;
//        }
//        if (anInstrument.interestRate > 0 && anInstrument.duration > 0) {
//            result = (anInstrument.income / anInstrument.duration) * anInstrument.adjustmentFactor;
//        }
//        return result;
//    }

//    public int adjustedCapital(Instrument anInstrument) {
//        int result = 0;
//        if (anInstrument.capital <= 0) {
//            return result;
//        }
//        if (!(anInstrument.interestRate > 0 && anInstrument.duration > 0)) {
//            return result;
//        }
//        result = (anInstrument.income / anInstrument.duration) * anInstrument.adjustmentFactor;
//        return result;
//    }

//    public int adjustedCapital(Instrument anInstrument) {
//        int result = 0;
//        if (anInstrument.capital <= 0) {
//            return result;
//        }
//        if (anInstrument.interestRate <= 0 || anInstrument.duration <= 0) {
//            return result;
//        }
//        result = (anInstrument.income / anInstrument.duration) * anInstrument.adjustmentFactor;
//        return result;
//    }

//    public int adjustedCapital(Instrument anInstrument) {
//        int result = 0;
//        if (anInstrument.capital <= 0 || anInstrument.interestRate <= 0 || anInstrument.duration <= 0) {
//            return result;
//        }
//        result = (anInstrument.income / anInstrument.duration) * anInstrument.adjustmentFactor;
//        return result;
//    }

    public int adjustedCapital(Instrument anInstrument) {
        if (anInstrument.capital <= 0 || anInstrument.interestRate <= 0 || anInstrument.duration <= 0) {
            return 0;
        }
        return (anInstrument.income / anInstrument.duration) * anInstrument.adjustmentFactor;
    }
}
