package testdata;

import org.testng.annotations.DataProvider;

public class TestData
{
    @DataProvider(name="jobSearch")
    public Object[][] getData()
    {
        Object[][] data = new Object[][]{
                {"Tester","Harrow, Greater London","5","30000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow"},
                {"Developer","Harrow","15","40000","500000","Per month","Contract","Contract Developer jobs in Harrow"},
                {"Graphic Designer","London","7","3000","4000","Per week","Temporary","Temporary Graphic Designer jobs in London"},
                {"Salesforce","Harrow, Greater London","15","80000","500000","Per month","Permanent","Permanent Salesforce jobs in Harrow"},
                {"Data Analyst","liverpool Uk","10","300","400","Per day","Temporary","Temporary Data Analyst jobs"},
                {"QA Tester","liverpool Uk","7","4000","5000","Per day","Apprenticeship","Apprenticeship Qa Tester jobs"}
        };
        return data;
    }
}
