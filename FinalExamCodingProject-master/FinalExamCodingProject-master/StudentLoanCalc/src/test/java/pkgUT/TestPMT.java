package pkgUT;

import static org.junit.Assert.*;

import org.apache.poi.ss.formula.functions.*;
import org.junit.Test;

public class TestPMT {

	@Test
	public void testTotalInterest() {
		int iYears = 15;
		double AnnualInterestRate =0.07;
		double LoanAmount = 2000000;
		double InterestRatePerPeriod = 0.07 / 12;
		double TotalPayments = 20 * 12;
		double TotalInterest = 150000;
		double EstimatedInterestSavings = 0;
		boolean Rounding = false;
		PMT = Math.abs(FinanceLib.pmt(LoanAmount, InterestRatePerPeriod, TotalPayments, TotalInterest, Years));
		
		double PMTExpected = 1162.95;
		
		assertEquals(InterestExpected, AnnualInterestRate, 0.01);
		
		
		
	}

}

 

