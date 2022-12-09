//Katherine Watkins
//SDEV 301
//10/04/2022
package accessibility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class AccessibilityResults{
    public Set<AccessibilityTest> accessibilityRes = new LinkedHashSet<>();

//    constructor
    public AccessibilityResults (String fileName){
        try(Scanner s = new Scanner(new File(fileName))){
            while(s.hasNextLine()){
//      get parameters for new accessibility.AccessibilityTest

                String category = s.next();
                String google = s.next();
                String wave = s.next();
                String sortSite = s.next();
                String ASLint = s.next();
                String description = s.nextLine();

//      add new accessibility.AccessibilityTest to set
                AccessibilityTest test = new AccessibilityTest(category, google, wave, sortSite, ASLint, description);
                accessibilityRes.add(test);

            }
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + fileName);
        }
    }

//    return number of tests in set

    public int numTests(){
        return accessibilityRes.size();
    }

//    show test results by detail

    public void showTestResults(String detailFinder){
        detailFinder = detailFinder.toLowerCase();
        int count = 0;
        Set<AccessibilityTest> results = new LinkedHashSet<>();
        for(AccessibilityTest cur: accessibilityRes){
            if(cur.getDescription().toLowerCase().contains(detailFinder)){
                results.add(cur);
                count++;
            }
        }
        for(AccessibilityTest cur : results){
            System.out.println(cur);
        }
        System.out.println();
        System.out.println("Total tests matching: " + count);
    }

//    show by category

    public void showByCategory(String category){
        category = category.toLowerCase();
        int count = 0;
        Set<AccessibilityTest> results = new LinkedHashSet<>();
        for(AccessibilityTest cur: accessibilityRes){
            if(cur.getCategory().toLowerCase().contains(category)){
                results.add(cur);
                count++;
            }
        }
        for(AccessibilityTest cur : results){
            System.out.println(cur);
        }
        System.out.println();
        System.out.println("Total tests in category: " + count);
    }

//      show all failed tests

    public void showAllFailed(){
        String fail = "notfound";
        int count = 0;
        Set<AccessibilityTest> results = new LinkedHashSet<>();
        for(AccessibilityTest cur: accessibilityRes){
            if(cur.getGoogle().equals(fail) && cur.getWave().equals(fail) && cur.getSortSite().equals(fail) && cur.getASLint().equals(fail)){
                results.add(cur);
                count++;
            }
        }
        for(AccessibilityTest cur : results){
            System.out.println(cur);
        }
        System.out.println();
        System.out.println("Total tests failed: " + count);
    }

//    number that passed based on checker name and category

    public void numPass(String name, String category){
        String g = "google";
        String s = "sortsite";
        String w = "wave";
        String asl = "aslint";

        int count = 0;
        if(g.contains(name)){
            for(AccessibilityTest cur: accessibilityRes){
                if(cur.getGoogle().contains("error") && cur.getCategory().toLowerCase().contains(category)){
                    count++;
                }
            }
        }
        if(s.contains(name)){
            for(AccessibilityTest cur: accessibilityRes){
                if(cur.getSortSite().contains("error") && cur.getCategory().toLowerCase().contains(category)){
                    count++;
                }
            }
        }
        if(w.contains(name)){
            for(AccessibilityTest cur: accessibilityRes){
                if(cur.getWave().contains("error") && cur.getCategory().toLowerCase().contains(category)){
                    count++;
                }
            }
        }
        if(asl.contains(name)){
            for(AccessibilityTest cur: accessibilityRes){
                if(cur.getASLint().contains("error") && cur.getCategory().toLowerCase().contains(category)){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
