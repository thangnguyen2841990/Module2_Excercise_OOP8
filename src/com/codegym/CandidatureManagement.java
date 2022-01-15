package com.codegym;

public class CandidatureManagement {
    public static final int SIZE = 0;
    BlockA[] candidaturesBlockAs =new BlockA[SIZE];
    BlockB[] candidaturesBlockBs =new BlockB[SIZE];
    BlockC[] candidaturesBlockCs =new BlockC[SIZE];


    public CandidatureManagement() {
    }


    public CandidatureManagement(BlockA[] candidaturesBlockAs, BlockB[] candidaturesBlockBs, BlockC[] candidaturesBlockCs) {
        this.candidaturesBlockAs = candidaturesBlockAs;
        this.candidaturesBlockBs = candidaturesBlockBs;
        this.candidaturesBlockCs = candidaturesBlockCs;
    }

    public BlockA[] getCandidaturesBlockAs() {
        return candidaturesBlockAs;
    }

    public void setCandidaturesBlockAs(BlockA[] candidaturesBlockAs) {
        this.candidaturesBlockAs = candidaturesBlockAs;
    }

    public BlockB[] getCandidaturesBlockBs() {
        return candidaturesBlockBs;
    }

    public void setCandidaturesBlockBs(BlockB[] candidaturesBlockBs) {
        this.candidaturesBlockBs = candidaturesBlockBs;
    }

    public BlockC[] getCandidaturesBlockCs() {
        return candidaturesBlockCs;
    }

    public void setCandidaturesBlockCs(BlockC[] candidaturesBlockCs) {
        this.candidaturesBlockCs = candidaturesBlockCs;
    }

    public void addNewCandidature(int index, BlockA newCandidature) {
        BlockA[] newCandidatures = new BlockA[candidaturesBlockAs.length+ 1];
        for (int i = 0; i < newCandidatures.length; i++) {
            if (i < index) {
                newCandidatures[i] = candidaturesBlockAs[i];
            } else if (i == index) {
                newCandidatures[i] = newCandidature;
            } else {
                newCandidatures[i] = candidaturesBlockAs[i - 1];
            }
        }
        this.candidaturesBlockAs = newCandidatures;
    }
    public void addNewCandidature(int index, BlockB newCandidature) {
        BlockB[] newCandidatures = new BlockB[candidaturesBlockBs.length+ 1];
        for (int i = 0; i < newCandidatures.length; i++) {
            if (i < index) {
                newCandidatures[i] = candidaturesBlockBs[i];
            } else if (i == index) {
                newCandidatures[i] = newCandidature;
            } else {
                newCandidatures[i] = candidaturesBlockBs[i - 1];
            }
        }
        this.candidaturesBlockBs = newCandidatures;
    }
    public void addNewCandidature(int index, BlockC newCandidature) {
        BlockC[] newCandidatures = new BlockC[candidaturesBlockCs.length+ 1];
        for (int i = 0; i < newCandidatures.length; i++) {
            if (i < index) {
                newCandidatures[i] = candidaturesBlockCs[i];
            } else if (i == index) {
                newCandidatures[i] = newCandidature;
            } else {
                newCandidatures[i] = candidaturesBlockCs[i - 1];
            }
        }
        this.candidaturesBlockCs = newCandidatures;
    }

    public void displayCandidatureBlockA() {
        for (int i = 0; i < candidaturesBlockAs.length; i++) {
            System.out.println((i + 1) + ". " + candidaturesBlockAs[i]);
        }
    }
    public void displayCandidatureBlockB() {
        for (int i = 0; i < candidaturesBlockBs.length; i++) {
            System.out.println((i + 1) + ". " + candidaturesBlockBs[i]);
        }
    }
    public void displayCandidatureBlockC() {
        for (int i = 0; i < candidaturesBlockCs.length; i++) {
            System.out.println((i + 1) + ". " + candidaturesBlockCs[i]);
        }
    }
    public void findCandidature(int examID){
        for (int i = 0; i < candidaturesBlockAs.length; i++) {
            if (candidaturesBlockAs[i].getExamID()==examID){
                System.out.println(candidaturesBlockAs[i]);
            }else if (candidaturesBlockBs[i].getExamID()==examID){
                System.out.println(candidaturesBlockBs[i]);
            }else if (candidaturesBlockCs[i].getExamID()==examID){
                System.out.println(candidaturesBlockCs[i]);
            }else {
                System.out.println("Không tìm thấy SBD: "+examID);
            }
        }
    }
}
