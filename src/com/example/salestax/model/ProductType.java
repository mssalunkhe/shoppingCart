package com.example.salestax.model;

public enum ProductType {


    FOOD(0.0, 5.0) {
        @Override
        public double getTaxRate(Boolean isImpoterd) {
            if (isImpoterd) return taxRate + getImportDutyRate();
            return taxRate;
        }


    },
    MEDICINE(0.0, 5.0) {
        @Override
        public double getTaxRate(Boolean isImpoterd) {

            if (isImpoterd) return taxRate + getImportDutyRate();
            return taxRate;

        }


    },
    BOOK(0.0, 5.0) {
        @Override
        public double getTaxRate(Boolean isImpoterd) {

            if (isImpoterd) return taxRate + getImportDutyRate();
            return taxRate;

        }


    },
    OTHER(10.0, 5.0) {
        @Override
        public double getTaxRate(Boolean isImpoterd) {

            if (isImpoterd) return taxRate + getImportDutyRate();
            return taxRate;


        }


    };


    double taxRate = 0.0;
    double importDutyRate = 0.0;

    ProductType(double salesTaxRate, double importDutyRate) {
        taxRate = salesTaxRate;
        this.importDutyRate = importDutyRate;
    }


    public abstract double getTaxRate(Boolean isImpoterd);

    /*public static void setImportDutyRate( double rate){
        importDutyRate = rate;
    }*/
    public double getImportDutyRate() {
        return importDutyRate;
    }


}

